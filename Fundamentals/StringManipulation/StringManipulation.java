public class StringManipulation {
    public static void exampleOne() {
        String str ="    Echo       ";
        String str2 = "          world           ";
        System.out.println(str.trim() + " "+ str2.trim());
    }

    public static Integer exampleTwo(String ninja, char letter) {
       
        if(ninja.indexOf(letter) != - 1){
             return ninja.indexOf(letter);
        }
        else{
            return null;
        }

       
    } 
    
    public static void main(String[] args) {
        // exampleOne();
            // Integer a = ninja.indexOf("Coding"); // a is 11
            // Integer b = ninja.indexOf("co"); // b is 3
            // Integer c = ninja.indexOf("pizza");
            System.out.println(exampleTwo("blob", letter));
       

    }

}