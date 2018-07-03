public class Greeter {
    public String greet(String name){
        return createGreeting(name);
    }
    public String greet(){ //1
        return createGreeting("there");
    }
    public String greet(String firstName, String lastName){
        System.out.println("We are about to greet " + firstName);
        return createGreeting(firstName + " " + lastName);
    }
    private String createGreeting(String toBeGreeted){
        return "Hi " + toBeGreeted + ",  welcome to the dojo."; // this could use any of the previous parameters above depending on input.
    }
}
    // public static void testGreeting(String name)
    // System.out.println("This is a test of a static method, " + name)
