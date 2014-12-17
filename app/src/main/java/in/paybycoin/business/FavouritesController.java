package in.paybycoin.business;

import java.util.ArrayList;

import Domain.Merchant;

import Domain.Favourites;

public class FavouritesController {

    public ArrayList<Favourites> getFavourites() {
        ArrayList FavouritesList = new ArrayList<Favourites>();

        Favourites f1 = new Favourites();
        Favourites f2 = new Favourites();

        Merchant m1 = new Merchant();
        m1.setMerchant("Dominos Andheri East");
        Merchant m2 = new Merchant();
        m2.setMerchant("Faasos Andheri East");

        f1.setMerchant(m1);
        f1.setContact("022-84565156");

        f2.setMerchant(m2);
        f2.setContact("+91902616161");

        FavouritesList.add(f1);
        FavouritesList.add(f2);
        return FavouritesList;

    }
}
		 
