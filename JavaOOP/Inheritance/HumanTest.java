class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.regulateTemperature();
        h.startSleeping();
        boolean sleeping = h.isSleeping();
        h.goToWork();
        
        if (sleeping){
            System.out.println("The human is sleeping!");
        }else{
            System.out.println("He must be woke #wokeHuman");
        }
    }
}
