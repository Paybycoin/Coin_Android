package in.paybycoin.coin;
import java.util.ArrayList;
import Domain.Merchant;
import Domain.Transaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import in.paybycoin.coin.R;
import in.paybycoin.business.TransactionsController;
import in.paybycoin.screens.adapters.TransactionAdapter;

@SuppressWarnings("ResourceType")
public class FragmentTabTransactions extends FragmentTab{
    TransactionsController transactionsController = new TransactionsController();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        final ArrayList<Transaction> transactionsList = transactionsController.getTransactions();
        TextView tv = (TextView)v.findViewById(R.id.text_view_main);
        tv.setText("Past transactions");
        ListView lv = (ListView)v.findViewById(R.id.list_view_main);
        TransactionAdapter transactionAdapter = new TransactionAdapter(getActivity(),R.layout.row,transactionsList);
        lv.setAdapter(transactionAdapter);

        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Transaction t = transactionsList.get(position);
                Toast toast = Toast.makeText(getActivity(), t.getItem()+"--"+t.getCost(), 2);
                toast.show();
                Intent newActivity = new Intent(getActivity(),TransactionActivity.class);
                newActivity.putExtra("merchant",t.getMerchant().getMerchant());
                newActivity.putExtra("item",t.getItem());
                newActivity.putExtra("cost",t.getCost());
                newActivity.putExtra("date",t.getDate());
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
