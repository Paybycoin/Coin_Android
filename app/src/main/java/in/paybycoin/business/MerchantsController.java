package in.paybycoin.business;

import java.util.ArrayList;
import java.util.List;

import Domain.Merchant;

public class MerchantsController {

    public List<Merchant> getMerchants () {
        List<Merchant> merchantsList = new ArrayList<Merchant>();
        Merchant merchant1 =new Merchant();
        merchant1.setUuid("ax123by");
        merchant1.setMerchant("Dominos Andheri");

        Merchant merchant2 = new Merchant();

        merchant2.setUuid("AX234BY");
        merchant2.setMerchant("Faasos Andheri East");

        Merchant merchant3 = new Merchant();

        merchant3.setUuid("AX234BY");
        merchant3.setMerchant("Box8");

        Merchant merchant4 = new Merchant();

        merchant4.setUuid("AX234BY");
        merchant4.setMerchant("Taco Bell");

        Merchant merchant5 = new Merchant();

        merchant5.setUuid("AX234BY");
        merchant5.setMerchant("Baroque Dining");

        merchantsList.add(merchant1);
        merchantsList.add(merchant2);
        merchantsList.add(merchant3);
        merchantsList.add(merchant4);
        merchantsList.add(merchant5);

        return merchantsList;
    }
}
