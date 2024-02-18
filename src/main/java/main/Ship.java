package main;

public class Ship extends Vehicle 
{
    public Ship(String valmistaja, String malli, String nopeus) 
    {
        super(valmistaja, malli, nopeus);
        setEngine(new Engine("Wärtsilä Super", 1000));
    }

    public void sail() {
        System.out.println(getManufacturer() + " " + getModel() + " seilaa merten ääriin!");
    }
}
