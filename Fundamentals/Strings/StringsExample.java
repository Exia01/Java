public class StringsExample {
    public static void test1() {
        String ninja = "Testing 123";
        int length = ninja.length();
        System.out.println("String Length is : " + length);
    }

    public static void test2() {
        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);
    }

    public static void test3() {
        String string1 = "Welcome," + " ninja ";
        String string2 = "Michael" + "!";
        String string3 = string1.concat(string2);
        System.out.println(string3);
    }

    public static void test4() {
        String ninja = String.format("Hi %s, you owe me $%.2f", "John", 35.00);
        String string2 = " ...the invoice will be in the mail" + ".";
        String string3 = ninja.concat(string2);
        // Will print out Hi Jack, you owe me $25.00 !
        // Where %s is expecting a string
        // And %.2f is expecting a float data type. The value 2 will just place two
        // values to right of the decimal point.
        System.out.println(string3);
    }
    public static void test5() {
        String ninja = String.format("Hi %s, you owe me $%.2f", "John", 35.00);
        String string2 = " ...the invoice will be in the mail" + ".";
        String string3 = ninja.concat(string2);
        // Will print out Hi Jack, you owe me $25.00 !
        // Where %s is expecting a string
        // And %.2f is expecting a float data type. The value 2 will just place two
        // values to right of the decimal point.
        System.out.println(string3);
    }

    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        // test4();
        test5();
    }

}

// String sentence = "   spaces everwhere!   ";
// System.out.println(sentence.trim())
// This will output: spaces everywhere!.

// Uppercase and Lowercase: The String class provides methods to lowercase and uppercase strings.

// String a = "HELLO";
// String b = "world";
// System.out.println(a.toLowerCase()); // hello
// System.out.println(b.toUpperCase()); // WORLD
// Equality: We can compare the equality of a string in two ways. Do they refer to the exact same object, or do they have the same exact sequence of characters.

// String a = new String("word");
// String b = new String("word");
// System.out.println(a == b); // false. not the same exact object.
// System.out.println(a.equals(b)); // true. same exact characters.
