package technassolutions.com.rxjava_instantsearch.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import technassolutions.com.rxjava_instantsearch.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // white background notification bar
        whiteNotificationBar(toolbar);
    }

    private void whiteNotificationBar(Toolbar toolbar) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int flags = toolbar.getSystemUiVisibility();
            flags |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            toolbar.setSystemUiVisibility(flags);
            getWindow().setStatusBarColor(Color.WHITE);
        }
    }

    @OnClick(R.id.btn_local_search)
    public void openLocalSearch() {
        // launching local search activity
        startActivity(new Intent(MainActivity.this, LocalSearchActivity.class));
    }

    @OnClick(R.id.btn_remote_search)
    public void openRemoteSearch() {
        // launch remote search activity
        startActivity(new Intent(MainActivity.this, RemoteSearchActivity.class));
    }
}
