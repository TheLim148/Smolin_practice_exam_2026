public class Main {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();

        try {
            validator.checkAge(16);
        } catch (InvalidAgeException exception) {
            System.out.println("Validation error: " + exception.getMessage());
        }

        try {
            validator.checkAge(20);
        } catch (InvalidAgeException exception) {
            System.out.println("Validation error: " + exception.getMessage());
        }
    }
}
