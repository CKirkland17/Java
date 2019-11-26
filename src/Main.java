public class Main {
    //global variables
    public static String firstName = "Anakin";
    public static void main(String[] args){
        System.out.println("Whats up");
        displayName();

    }

    public static void displayName(){
        String lastName = "SkyWalker";
        System.out.print("Your name is: " + firstName + " " + lastName);
    }
}
