package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);


        ForecastFragment ff = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, ff).commit();

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