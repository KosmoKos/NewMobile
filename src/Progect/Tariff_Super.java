package Progect;

/**
 * Created by Kos on 20.10.2015.
 */
public class Tariff_Super extends Tariff_Contract {
    public Tariff_Super(String name,
                        int price,
                        int callsInNetwork,
                        int callsToOtherNetwork,
                        int internetMB,
                        int freeSMS,
                        int quantity) {
        super(name, price, callsInNetwork, callsToOtherNetwork, internetMB, freeSMS, quantity);
    }
}
