import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileService {
    public void writeToFile(Path path, String text) throws IOException {
        Path parent = path.getParent();

        if (parent != null) {
            Files.createDirectories(parent);
        }

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(text);
        }
    }

    public String readFromFile(Path path) throws IOException {
        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;

            while ((line = reader.readLine()) != null) {
                result.append(line).append(System.lineSeparator());
            }
        }

        return result.toString();
    }
}
