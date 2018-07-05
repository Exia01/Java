class Mammal{
    private boolean sleeping = true;
    public void regulateTemperature() {
        System.out.println("My temperature is just right now.");
    }
    public void startSleeping() {
        sleeping = false;
        System.out.println("ZzZz");
    }
    public boolean isSleeping(){
        return sleeping;
    }
}
