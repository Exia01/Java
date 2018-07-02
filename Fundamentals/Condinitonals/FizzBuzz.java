
public class FizzBuzz {
    public static void main(String[] args) {
        int number = 100;
        // if (number instanceof String) {
        //     System.out.println("False");
        // test this out later....... I can't get it to run if that is left in there. 
            for (int i = 1; i <= 100; i++) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(String.valueOf(i));
                }
            }
        }
    }
