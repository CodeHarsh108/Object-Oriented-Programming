class Driver{
    String name;
    Driver(String name){
        this.name = name;
    }
}

class Car{
    Driver driver;
    void setDriver(Driver driver){
        this.driver = driver;
    }
    void show(){
        System.out.println("Car driven by : " + driver.name);
    }
}

public class Assosiation {
    public static void main(String[] args) {
        Driver d = new Driver("Harsh");
        Car c = new Car();

        c.setDriver(d); // association
        c.show();
    }
}
