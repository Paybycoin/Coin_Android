package in.paybycoin.screens.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import Domain.Favourites;
import Domain.Transaction;
import in.paybycoin.coin.R;

public class FavouritesAdapter extends ArrayAdapter<Favourites> {
    static class ViewHolder {
        TextView itemView;
    }
    ViewHolder viewHolder = null;

    public FavouritesAdapter(Context context, int textViewResourceId, ArrayList<Favourites> items) {
        super(context, textViewResourceId, items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(this.getContext())
                    .inflate(R.layout.row, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.itemView = (TextView) convertView.findViewById(R.id.name);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }



        return convertView;
    }
}
