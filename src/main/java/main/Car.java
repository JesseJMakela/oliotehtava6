package main;

public class Car extends Vehicle {
    public Car(String valmistaja, String malli, String nopeus) 
    {
        super(valmistaja, malli, nopeus);
        setEngine(new Engine("V8", 300));
    }

    public void drive() 
    {
        System.out.println(getManufacturer() + " " + getModel() + " paahtaa tietä eteenpäin!");
    }
}
