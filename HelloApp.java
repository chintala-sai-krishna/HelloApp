public class HelloApp {
    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = args[0];   // take name from command line
        } else {
            name = "World";   // default name
        }

        System.out.println("Hello " + name);
    }
}