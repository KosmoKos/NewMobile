package Progect;

/**
 * Created by Kos on 20.10.2015.
 */
public abstract class Tariff {

    protected String name;
    protected int price;

    public Tariff(){

    }

    public abstract int getPrice();

    public abstract int getFreeSMS();

    public abstract int getCallsInNetwork();

    public abstract int getCallsToOtherNetwork();

    public abstract int getInternetMB();

    public abstract int getQuantity();
}
