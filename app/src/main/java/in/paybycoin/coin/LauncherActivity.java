package in.paybycoin.coin;



import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class LauncherActivity extends FragmentActivity {
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_launcher);
        mTabHost = (FragmentTabHost) findViewById(R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.tabFrameLayout);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("Available Merchants", null),
                FragmentTabPayNow.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("Available Transactions", null),
                FragmentTabTransactions.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab3").setIndicator("Coupons", null),
                FragmentTabCoupons.class, null);
    }
}