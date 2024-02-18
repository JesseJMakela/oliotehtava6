package main;

public class Engine 
{
    private String nimi;
    private int teho;

    public Engine(String nimi, int teho) 
    {
        this.nimi = nimi;
        this.teho = teho;
    }

    public String getName() 
    {
        return nimi;
    }

    public int getPower() 
    {
        return teho;
    }
}
