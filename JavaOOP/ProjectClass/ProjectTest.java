class ProjectTest{
    public static void main(String[] args) {
        Project x = new Project();

        String projectResults = x.presentation();

        
        System.out.println(x.presentation("Gucchi - Purse", "For all you out there."));
     


        Project handbags = new Project();
        handbags.setName("No child left behind");
        handbags.setDescription("...the name says it all.");
        String projectName = handbags.getName();
        String projectDescription = handbags.getDescription();

        System.out.println("Project " + projectName + "' main focus is: " + projectDescription +"!");

}
}

