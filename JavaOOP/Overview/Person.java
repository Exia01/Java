public class Person {
    private int age;
    private int cmHeight;
    private String name;
    // public Person() {
    //     this(20, "John Doe", 171);
    // }
    
    public Person(int age, String name, int cmHeight) {
        this.age = age;
        this.name = name;
        this.cmHeight = cmHeight;
    }

    // public example1() {
    //     this(20, "John Doe", 171);
    // }
    // class Person {
    //     private int age;
    //     private String name;
    //     public Person(int ageParam, String nameParam) {
    //         this.age = ageParam;
    //         this.name = nameParam;
    //     }
        public void objectMethods(Person anotherObject) {
            System.out.println("Class name: " + this.getClass().getSimpleName());
            System.out.println("toString: " + this.toString());
            System.out.println("Equals: " + this.equals(anotherObject));
        }
    }
