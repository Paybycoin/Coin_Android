package in.paybycoin.coin;
        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import in.paybycoin.coin.R;

public class TransactionActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String merchant = intent.getStringExtra("merchant");
        String item = intent.getStringExtra("item");
        String cost = intent.getStringExtra("cost");
        String date = intent.getStringExtra("date");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_launcher);
        TextView dateText = (TextView)findViewById(R.id.text_view_date);
        TextView merchantText = (TextView)findViewById(R.id.text_view_merchant);
        TextView itemText = (TextView)findViewById(R.id.text_view_item);
        TextView costText = (TextView)findViewById(R.id.text_view_cost);

        dateText.setText(date);
        merchantText.setText(merchant);
        itemText.setText(item);
        costText.setText(cost);

//        EditText billNoText = (EditText) findViewById(R.id.edit_text_billno);
//        String billNo = billNoText.getText().toString();

        Button payButton = (Button)findViewById(R.id.Pay_Again_Button);
        payButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                doTransact();
                Intent newActivity = new Intent(getBaseContext(),LauncherActivity.class);
                startActivity(newActivity);
            }

        });

        Button favoritesButton = (Button)findViewById(R.id.Add_To_Favorites);
        favoritesButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                doTransact();
                Intent newActivity = new Intent(getBaseContext(),LauncherActivity.class);
                startActivity(newActivity);
            }

        });
    }

    protected void doTransact() {
        // TODO Auto-generated method stub

    }

}

