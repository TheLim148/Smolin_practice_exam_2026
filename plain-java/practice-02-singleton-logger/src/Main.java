public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Program started");
        logger2.log("Second logger object is used");

        System.out.println("logger1 == logger2: " + (logger1 == logger2));
    }
}
