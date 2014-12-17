package in.paybycoin.screens.adapters;

import java.util.ArrayList;

import Domain.Transaction;
import android.content.Context;
import in.paybycoin.coin.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TransactionAdapter extends ArrayAdapter<Transaction> {
    static class ViewHolder {
        TextView itemView;
    }
    ViewHolder viewHolder = null;

    public TransactionAdapter(Context context, int textViewResourceId, ArrayList<Transaction> items) {
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

        Transaction item = getItem(position);
        if (item!= null) {
            // My layout has only one TextView
            // do whatever you want with your string and long
            viewHolder.itemView.setText(String.format("%s", item.getItem()+"--"+item.getCost()));
        }

        return convertView;
    }
}
