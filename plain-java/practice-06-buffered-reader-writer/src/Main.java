import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        TextFileService fileService = new TextFileService();
        Path path = Path.of("data", "message.txt");

        String text = """
                Hello from Java!
                This text was written with BufferedWriter.
                Then it was read with BufferedReader.
                """;

        try {
            fileService.writeToFile(path, text);

            String fileContent = fileService.readFromFile(path);

            System.out.println("File content:");
            System.out.println(fileContent);
        } catch (IOException exception) {
            System.out.println("File error: " + exception.getMessage());
        }
    }
}
