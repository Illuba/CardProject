package ca.cardteam.it.cardtournament;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import ca.teambot.it.cave.examination.cardproject.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    LeaderboardFragment leaderboardFragment = new LeaderboardFragment();
    PointshopFragment pointshopFragment = new PointshopFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == R.id.navigation_home)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
            return true;
        }
        if (item.getItemId() == R.id.navigation_leaderboards)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, leaderboardFragment).commit();
            return true;
        }
        if (item.getItemId() == R.id.navigation_points)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, pointshopFragment).commit();
            return true;
        }
        return false;
    }
}