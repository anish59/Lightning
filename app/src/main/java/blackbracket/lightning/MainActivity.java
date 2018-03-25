package blackbracket.lightning;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar incToolBar;
    private android.widget.FrameLayout fragmentHolder;
    private android.widget.RelativeLayout container;
    private android.support.design.widget.BottomNavigationView navigation;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setView();
        initListeners();

    }

    private void initListeners() {
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        changeFragment(0, context.getResources().getString(R.string.items));
                        return true;
                    case R.id.navigation_profile:
                        changeFragment(1, context.getResources().getString(R.string.enquiries));
                        return true;
                    case R.id.navigation_notifications:
                        changeFragment(2, context.getResources().getString(R.string.offers));
                        return true;
                }
                return false;
            }
        });
    }

    private void changeFragment(int fragmentIndex, String navigation_home) {
        Fragment newFragment;
/*
        if (fragmentIndex == 0) {

            Bundle args = new Bundle();
            args.putString("keyName", "Home");
            HomeFragment homeFragment = new HomeFragment();
//            homeFragment.setArguments(args);

            newFragment = homeFragment;

        } else if (fragmentIndex == 1) {

            Bundle args = new Bundle();
            args.putString("keyName", "Profile");
            ProfileFragment pf = new ProfileFragment();
            pf.setArguments(args);

            newFragment = pf;

        } else {
            Bundle args = new Bundle();
            args.putString("keyName", "Notification");
            NotificationFragment pf = new NotificationFragment();
            pf.setArguments(args);
            newFragment = pf;
        }


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentHolder, newFragment)
//                .addToBackStack("navigation_home")
                .commit();
                */
    }

    private void setView() {
        setContentView(R.layout.activity_main);
        this.navigation = (BottomNavigationView) findViewById(R.id.navigation);
        this.container = (RelativeLayout) findViewById(R.id.container);
        this.fragmentHolder = (FrameLayout) findViewById(R.id.fragmentHolder);
        this.incToolBar = findViewById(R.id.incToolBar);
    }
}
