package main;


public class Plane extends Vehicle {
    public Plane(String valmistaja, String malli, String nopeus) 
    {
        super(valmistaja, malli, nopeus);
        setEngine(new Engine("Suihkumoottori", 500));
    }

    public void fly() 
    {
        System.out.println(getManufacturer() + " " + getModel() + " lentää kohteeseen!");
    }
}