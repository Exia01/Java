public class GreeterTest{
    public static void main(String[] args) {
        Greeter g = new Greeter(); // this is instanciating a class

        String greeting = g.greet(); // this is calling method or fuction 1
         greeting = g.greet("Tyrone", "Bruh"); 
        // System.out.println(greetingWithName);

        // if (greeting.equals("Hello World") && greetingWithName.equals("Hello Eduardo")) {
        //     System.out.println("Test successful");
        // } else {
        //     System.out.println("Test Fail");
        // }
    }
}