package in.paybycoin.coin;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import Domain.Favourites;
import in.paybycoin.business.FavouritesController;
import in.paybycoin.screens.adapters.FavouritesAdapter;

@SuppressWarnings("ResourceType")
public class FragmentTabFavourites extends FragmentTab{

    FavouritesController favouritesController = new FavouritesController();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        final ArrayList<Favourites> favouritesList = favouritesController.getFavourites();
        TextView tv = (TextView)v.findViewById(R.id.text_view_main);
        tv.setText("Favourites");
        ListView lv = (ListView)v.findViewById(R.id.list_view_main);
        FavouritesAdapter favouritesAdapter = new FavouritesAdapter(getActivity(),R.layout.row,favouritesList);
        lv.setAdapter(favouritesAdapter);

        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Favourites f = favouritesList.get(position);
                Toast toast = Toast.makeText(getActivity(), f.getContact(), 2);
                toast.show();
                Intent newActivity = new Intent(getActivity(),FavouritesActivity.class);
                newActivity.putExtra("merchant",f.getMerchant().getMerchant());
                newActivity.putExtra("Contact",f.getContact());
                startActivity(newActivity);
            }
        });
        return v;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

    }
}
