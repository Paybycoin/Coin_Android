package in.paybycoin.screens.adapters;

import java.util.ArrayList;

import Domain.Merchant;
import android.content.Context;
import in.paybycoin.coin.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MerchantAdapter extends ArrayAdapter<Merchant> {
    static class ViewHolder {
        TextView itemView;
    }
    ViewHolder viewHolder = null;

    public MerchantAdapter(Context context, int textViewResourceId, ArrayList<Merchant> items) {
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

        Merchant item = getItem(position);
        if (item!= null) {
            // My layout has only one TextView
            // do whatever you want with your string and long
            viewHolder.itemView.setText(String.format("%s", item.getMerchant()));
        }

        return convertView;
    }
}
