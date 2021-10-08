package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Main layout
        LinearLayout mainlayout = new LinearLayout(getActivity());
        mainlayout.setBackgroundColor(0x100000FF);
        mainlayout.setOrientation(LinearLayout.VERTICAL);

        // Scroll
        ScrollView scrl_layout = new ScrollView(getActivity());
        scrl_layout.addView(mainlayout);

        // Monday layout
        LinearLayout mon_layout = new LinearLayout(getActivity());
        mon_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView mon = new TextView(getActivity());
        ImageView mon_weather = new ImageView(getActivity());
        LinearLayout mon_descriptions = new LinearLayout(getActivity());
        mon_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView mon_weather_cond = new TextView(getActivity());
        TextView mon_temp_info = new TextView(getActivity());

        mon.setText("Monday");
        mon_weather.setImageResource(R.drawable.storm);
        mon_weather_cond.setText("Storm");
        mon_temp_info.setText("26\u00B0 21\u00B0");

        mon_layout.addView(mon);
        mon_layout.addView(mon_weather);
        mon_layout.addView(mon_descriptions);
        mon_descriptions.addView(mon_weather_cond);
        mon_descriptions.addView(mon_temp_info);

        // Tuesday layout
        LinearLayout tue_layout = new LinearLayout(getActivity());
        tue_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView tue = new TextView(getActivity());
        ImageView tue_weather = new ImageView(getActivity());
        LinearLayout tue_descriptions = new LinearLayout(getActivity());
        tue_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView tue_weather_cond = new TextView(getActivity());
        TextView tue_temp_info = new TextView(getActivity());

        tue.setText("Tuesday");
        tue_weather.setImageResource(R.drawable.sun);
        tue_weather_cond.setText("Sunny");
        tue_temp_info.setText("31\u00B0 25\u00B0");

        tue_layout.addView(tue);
        tue_layout.addView(tue_weather);
        tue_layout.addView(tue_descriptions);
        tue_descriptions.addView(tue_weather_cond);
        tue_descriptions.addView(tue_temp_info);


        // Wednesday layout
        LinearLayout wed_layout = new LinearLayout(getActivity());
        wed_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView wed = new TextView(getActivity());
        ImageView wed_weather = new ImageView(getActivity());
        LinearLayout wed_descriptions = new LinearLayout(getActivity());
        wed_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView wed_weather_cond = new TextView(getActivity());
        TextView wed_temp_info = new TextView(getActivity());

        wed.setText("Wednesday");
        wed_weather.setImageResource(R.drawable.cloud);
        wed_weather_cond.setText("Cloudy");
        wed_temp_info.setText("32\u00B0 24\u00B0");

        wed_layout.addView(wed);
        wed_layout.addView(wed_weather);
        wed_layout.addView(wed_descriptions);
        wed_descriptions.addView(wed_weather_cond);
        wed_descriptions.addView(wed_temp_info);


        // Thursday layout
        LinearLayout thu_layout = new LinearLayout(getActivity());
        thu_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView thu = new TextView(getActivity());
        ImageView thu_weather = new ImageView(getActivity());
        LinearLayout thu_descriptions = new LinearLayout(getActivity());
        thu_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView thu_weather_cond = new TextView(getActivity());
        TextView thu_temp_info = new TextView(getActivity());

        thu.setText("Thursday");
        thu_weather.setImageResource(R.drawable.sun);
        thu_weather_cond.setText("Sunny");
        thu_temp_info.setText("34\u00B0 25\u00B0");

        thu_layout.addView(thu);
        thu_layout.addView(thu_weather);
        thu_layout.addView(thu_descriptions);
        thu_descriptions.addView(thu_weather_cond);
        thu_descriptions.addView(thu_temp_info);


        // Friday layout
        LinearLayout fri_layout = new LinearLayout(getActivity());
        fri_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView fri = new TextView(getActivity());
        ImageView fri_weather = new ImageView(getActivity());
        LinearLayout fri_descriptions = new LinearLayout(getActivity());
        fri_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView fri_weather_cond = new TextView(getActivity());
        TextView fri_temp_info = new TextView(getActivity());

        fri.setText("Friday");
        fri_weather.setImageResource(R.drawable.sun);
        fri_weather_cond.setText("Sunny");
        fri_temp_info.setText("36\u00B0 27\u00B0");

        fri_layout.addView(fri);
        fri_layout.addView(fri_weather);
        fri_layout.addView(fri_descriptions);
        fri_descriptions.addView(fri_weather_cond);
        fri_descriptions.addView(fri_temp_info);


        // Saturday layout
        LinearLayout sat_layout = new LinearLayout(getActivity());
        sat_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView sat = new TextView(getActivity());
        ImageView sat_weather = new ImageView(getActivity());
        LinearLayout sat_descriptions = new LinearLayout(getActivity());
        sat_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView sat_weather_cond = new TextView(getActivity());
        TextView sat_temp_info = new TextView(getActivity());

        sat.setText("Saturday");
        sat_weather.setImageResource(R.drawable.storm);
        sat_weather_cond.setText("Light rain");
        sat_temp_info.setText("29\u00B0 24\u00B0");

        sat_layout.addView(sat);
        sat_layout.addView(sat_weather);
        sat_layout.addView(sat_descriptions);
        sat_descriptions.addView(sat_weather_cond);
        sat_descriptions.addView(sat_temp_info);


        // Sunday layout
        LinearLayout sun_layout = new LinearLayout(getActivity());
        sun_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView sun = new TextView(getActivity());
        ImageView sun_weather = new ImageView(getActivity());
        LinearLayout sun_descriptions = new LinearLayout(getActivity());
        sun_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView sun_weather_cond = new TextView(getActivity());
        TextView sun_temp_info = new TextView(getActivity());

        sun.setText("Sunday");
        sun_weather.setImageResource(R.drawable.storm);
        sun_weather_cond.setText("Heavy rain");
        sun_temp_info.setText("29\u00B0 23\u00B0");

        sun_layout.addView(sun);
        sun_layout.addView(sun_weather);
        sun_layout.addView(sun_descriptions);
        sun_descriptions.addView(sun_weather_cond);
        sun_descriptions.addView(sun_temp_info);


        // add to main layout
        mainlayout.addView(mon_layout);
        mainlayout.addView(tue_layout);
        mainlayout.addView(wed_layout);
        mainlayout.addView(thu_layout);
        mainlayout.addView(fri_layout);
        mainlayout.addView(sat_layout);
        mainlayout.addView(sun_layout);

        return mainlayout;
    }
}