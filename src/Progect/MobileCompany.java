package Progect;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Kos on 20.10.2015.
 */
public class MobileCompany {


        private List<Tariff> tariffsList = new ArrayList<>();{
        }

        public MobileCompany(String kyivstar) {
        }

        public static List<Tariff> sortTarriffsByFee(List<Tariff> tariffsList) {
            Collections.sort(tariffsList, new Comparator<Tariff>() {
                @Override
                public int compare(Tariff a1, Tariff a2) {
                    return Integer.compare(a1.getPrice(), a2.getPrice());
                }
            });
            return tariffsList;
        }

        List<Tariff> sortTariffsByPrice(int diapasonStart, int diapasonEnd) {
            List<Tariff> list = new ArrayList<>();
            for (Tariff c : tariffsList) {
                if (c.getPrice() >= diapasonStart && c.getPrice() <= diapasonEnd) {
                    list.add(c);
                }
            }
            return list;
        }

        List<Tariff> totalCustomer() {
            List<Tariff> list = new ArrayList<>();
            int sum = 0;
            for (Tariff c : tariffsList) {
                list.add(c);
                sum += c.getQuantity();
            }
            System.out.print("");
            System.out.println(sum + " клиента.");
            System.out.print("");

            return list;

        }

        public List<Tariff> getTariffsList() {
            return tariffsList;
        }

        public void setTariffsList(ArrayList<Tariff> tariffsList) {
            this.tariffsList = tariffsList;
        }

        void addTariffsToTariffList(Tariff tariff) {
            tariffsList.add(tariff);
        }
    }


