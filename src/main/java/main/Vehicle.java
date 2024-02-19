package main;

public class Vehicle 
{
    private String valmistaja;
    private String malli;
    private String nopeus;
    private Engine engine;

    public Vehicle(String valmistaja, String malli, String nopeus) 
    {
        this.valmistaja = valmistaja;
        this.malli = malli;
        this.nopeus = nopeus;
    }

    public String getManufacturer() 
    {
        return valmistaja;
    }

    public String getModel() 
    {
        return malli;
    }

    public String getMaxSpeed() 
    {
        return nopeus;
    }

    public void setEngine(Engine engine) 
    {
        this.engine = engine;
    }

    public Engine getEngine() 
    {
        return engine;
    }

    public void print(String valmistaja, String malli, String nopeus)
    {   
        String vehicleType = "";
        if (this instanceof Car) {
            vehicleType = "auto";
        } else if (this instanceof Plane) {
            vehicleType = "lentokone";
        } else if (this instanceof Ship) {
            vehicleType = "laiva";
        }
        String print = vehicleType + ": " + valmistaja + " " + malli + "\n" +"Moottori: " + engine.getName() + " " + engine.getPower() + "kW\n" +"Huippunopeus: " + nopeus + "km/h"+"\n";
        System.out.println(print);
    }
}