public class ImportDemoTest { // this is importing the class
    public static void main(String[] args) { //settomg out method
        ImportDemo iD = new ImportDemo(); // //we are importing the demo and creating an instance while assigning it to ID
        String currentDate = iD.getCurrentDate();
        System.out.println(currentDate);
    }
}