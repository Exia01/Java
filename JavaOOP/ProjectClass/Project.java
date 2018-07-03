public class Project{
    private String name;
    private String description;

    // Overloading Constructors


    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    
    // Setters and Getters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //we can even combine the actions

    //Different way of doing it 

    public String presentation(String name){
        return totaResults(name);
    }

    public String presentation(){ //1
        return totaResults("Completed");
    }

    public String presentation(String name, String description){
        // System.out.println("Testing the product " + name);
        return totaResults(name + " " + description);
    }

    private String totaResults(String information){
        return "Product" + "is " + information + ", is ready for sale.";
    }



}