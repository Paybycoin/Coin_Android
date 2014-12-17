package in.paybycoin.coin;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.EditText;

        import in.paybycoin.coin.R;

public class PaymentActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String value = intent.getStringExtra("merchant");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_launcher);

//        EditText billNoText = (EditText) findViewById(R.id.edit_text_billno);
//        String billNo = billNoText.getText().toString();

        Button payButton = (Button)findViewById(R.id.Pay_Now_Button);
        payButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText billNoText = (EditText) findViewById(R.id.edit_text_billno);
                String billNo = billNoText.getText().toString();
                EditText amountText = (EditText) findViewById(R.id.edit_text_amount);
                String amount = amountText.getText().toString();

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
