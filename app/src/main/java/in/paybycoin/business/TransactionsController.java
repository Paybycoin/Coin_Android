package in.paybycoin.business;

import java.util.ArrayList;
import java.util.Date;

import Domain.Merchant;
import Domain.Transaction;

public class TransactionsController {

    public ArrayList<Transaction> getTransactions() {
        ArrayList transactionList = new ArrayList<Transaction>();

        Transaction t1 = new Transaction();
        Transaction t2 = new Transaction();

        Merchant m1 = new Merchant();
        m1.setMerchant("Dominos Andheri East");
        Merchant m2 = new Merchant();
        m2.setMerchant("Faasos Andheri East");

        t1.setMerchant(m1);
        t1.setItem("Pizza");
        t1.setCost("450");
        t1.setDate(new Date("1/1/2014"));

        t2.setMerchant(m2);
        t2.setItem("Donuts");
        t2.setDate(new Date("1/1/2014"));
        t2.setCost("60");

        transactionList.add(t1);
        transactionList.add(t2);
        return transactionList;

    }
}
		 
