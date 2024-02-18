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
        String print = "Kulkuneuvo: " + valmistaja + " " + malli + "\n" +"Moottori: " + engine.getName() + " " + engine.getPower() + "kW\n" +"Huippunopeus: " + nopeus + "km/h"+"\n";
        System.out.println(print);
    }
}