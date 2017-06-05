package apps.mohanad.com.londontourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mohanad on 05/06/17.
 */

public class HotelActivity extends AppCompatActivity {

    /*the listView */
    private ListView list;

    /*the call image*/
    private ImageView callImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> hotelsList=new ArrayList<>();

        /*create a hotels objects*/
        hotelsList.add(new Location(getString(R.string.hotel_fours) ,getString(R.string.hotel_fours_address)
                , getString(R.string.hotel_fours_phone) ,R.drawable.hotle_fourseason));
        hotelsList.add(new Location(getString(R.string.hotel_mandrin) ,getString(R.string.hotel_fours_address)
                , getString(R.string.hotel_mandrin_phone) ,R.drawable.hotel_mandarin));
        hotelsList.add(new Location(getString(R.string.hotel_park) ,getString(R.string.hotel_park_address)
                , getString(R.string.hotel_fours_phone) ,R.drawable.hotel_parkplaza));
        hotelsList.add(new Location(getString(R.string.hotel_fours) ,getString(R.string.hotel_fours_address)
                , getString(R.string.hotel_fours_address) ,R.drawable.hotel_novotel));

        //create adapter
        LocationAdapter locationAdapter = new LocationAdapter(this,hotelsList , R.color.hotel_list_color);

        //get the list view
        list=(ListView)findViewById(R.id.location_list);
        //setting the listview adapter
        list.setAdapter(locationAdapter);

    }
}

