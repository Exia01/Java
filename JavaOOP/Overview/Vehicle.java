class Vehicle {
    private int numberOfWheels;
    private int speed;
    private String color;
    public Vehicle(String color) {
        // setting the color attribute to the value from the color parameter
        this.color = color;
    }

    public Vehicle(String color, int num, int speed) {
        this.color = color;
        this.numberOfWheels = num;
        this.speed = speed;
    }

    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    // setter
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }
    // getter
    public String getColor() {
        return color;
    }
    // setter
    public void setColor(String color) {
        this.color = color;        // 1
    }
    public int getSpeed() {
        return speed;
    }
    // setter
    public void setSpeed(int speed) {
        this.speed = speed;        // 1
    }
}
