public class HelloDojo {
    public static void main(String[] args) {
        // int age; //here's the name // can be declared before used.
        // double is used for fractions
        // int age = 28; // here's the assignment operator equaling 28
        String greeting = "My name is Sixto. ";
        String age = "I am 28 years old. ";
        String location = " My hometown is Manassas, VA. ";
        String str = greeting + " " + age + location;

        // System.out.println(greeting + age + "." + location);
        System.out.println(str.replaceAll("  ", "\n"));
        System.out.println();
    }
}

// My name is Coding Dojo
// I am 100 years old
// My hometown is Burbank, CA

// system.out.print('insert here') this will print it in a line
// system.out.println('insert here') this will print it in anything after it in
// a line

// String.format("%s%n%s%n%s", firstName, lastName, Time);
// if you are using format then use the format string with arguments.

// %s = String
// %n = new line