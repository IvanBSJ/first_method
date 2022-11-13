public class App {
    public static void main(String[] args) {
        String firstName = "Julia";
        String secondName = " Roberts";

        String fullName = fullName (firstName, secondName);

        System.out.println(fullName);
}

public static String fullName (String firstName, String secondName) {
    return "Method result: " + firstName +secondName;
}

}   