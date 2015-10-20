package Progect;

/**
 * Created by Kos on 20.10.2015.
 */
public class Tariff_Econom extends Tariff_Contract{

    public Tariff_Econom(String name,
                         int price,
                         int callsInNetwork,
                         int callsToOtherNetwork,
                         int internetMB,
                         int freeSMS,
                         int quantity) {
        super(name, price, callsInNetwork, callsToOtherNetwork, internetMB, freeSMS, quantity);
    }
}
