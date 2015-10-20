package Progect;

import java.util.List;
/**
 * Created by Kos on 20.10.2015.
 */
public class Main {

        private String companyName;

        public Main(String companyName) {
            this.companyName = companyName;
        }

        public static void main(String[] args) {

            MobileCompany company = new MobileCompany("Kyivstar");


            company.addTariffsToTariffList(new Tariff_Contract("Contract", 1000, 120, 500, 750, 20, 65));
            company.addTariffsToTariffList(new Tariff_Econom("Econom", 1000, 120, 500, 750, 20, 65));
            company.addTariffsToTariffList(new Tariff_Super("Super", 500, 750, 2000, 2500, 1000, 65));
            company.addTariffsToTariffList(new Tariff_Vip("VIP tariff", 4000, 1000, 2500, 3000, 1400, 48));


            System.out.println("\nДиапазон тарифов: ");
            List<Tariff> diapasonTariffs = company.sortTariffsByPrice(1, 4000);
            for (Tariff c : diapasonTariffs) {
                System.out.println(c);
            }

            System.out.println("\nСортировка по абонентской плате: ");
            List<Tariff> SubFee = MobileCompany.sortTarriffsByFee(company.getTariffsList());
            for (Tariff c : SubFee) {
                System.out.println(c);
            }

            System.out.println("\nОбщее количество клиентов: ");
            List<Tariff> custom = company.totalCustomer();
            for (Tariff c : custom) {
                System.out.println(c);
            }
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }
    }

