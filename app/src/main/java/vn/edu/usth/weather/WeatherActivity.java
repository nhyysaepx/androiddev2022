package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        TabLayout tablayout = findViewById(R.id.tab_layout);
        ViewPager2 pager2 = findViewById(R.id.view_pager);

        WeatherFragmentAdapter adapter = new WeatherFragmentAdapter(this);
        pager2.setAdapter(adapter);

        new TabLayoutMediator(tablayout, pager2, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Ha Noi");
                    break;
                case 1:
                    tab.setText("Thanh Hoa");
                    break;
                case 2:
                    tab.setText("Sai Gon");
                    break;
            }
        }).attach();
        Log.i("WeatherActivity", "Create");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("WeatherActivity", "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("WeatherActivity", "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("WeatherActivity", "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("WeatherActivity", "Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("WeatherActivity", "Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("WeatherActivity", "Destroy");
    }
}