public class UserValidator {
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("User must be at least 18 years old");
        }

        System.out.println("Age is valid");
    }
}
