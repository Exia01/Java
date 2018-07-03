class VehicleTest {
    public static void main(String[] args) {
      
        Vehicle bike = new Vehicle("Pink"); //creates a bike
          // bike.setColor("Orange"); //this is an attribute //but also a setter
        bike.setNumberOfWheels(2);
        
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();
        
        // Vehicle car = new Vehicle("Blue"); //creates a car //late we added the ability to create a color
        
        // car.setNumberOfWheels(4);
        // car.setColor("Lime-green");
        
        // int carWheels = car.getNumberOfWheels();
        // String carColor = car.getColor();
        
        Vehicle truck = new Vehicle("Black"); //creates a car //late we added the ability to create a color
        truck.setNumberOfWheels(4);
        truck.setColor("Desert-gray");

        int truckWheels = truck.getNumberOfWheels();
        String truckColor = truck.getColor();
        
        //That's one way of doing it
        //below is another way

        Vehicle car = new Vehicle("White", 4, 125);
        int carWheels = car.getNumberOfWheels();
        int carSpeed = car.getSpeed();
        String carColor = car.getColor();

        // car.setNumberOfWheels(4);
        // car.setColor("Lime-green");
        
        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor + "\n");

        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor + ", Speed: "+ carSpeed +  "\n");
        System.out.println("Truck object - Wheels: " + truckWheels + ", Color: " + truckColor + "\n");
    }
}
