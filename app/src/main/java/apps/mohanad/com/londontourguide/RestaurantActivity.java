package apps.mohanad.com.londontourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    /*the listView */
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> restaurantList=new ArrayList<>();

        /*create a restaurants objects*/
        restaurantList.add(new Location(getString(R.string.hotel_fours) ,getString(R.string.hotel_fours_address)
                , getString(R.string.hotel_fours_phone) ,R.drawable.restaurant_ledbury2));
        restaurantList.add(new Location(getString(R.string.hotel_fours) ,getString(R.string.hotel_fours_address)
                , getString(R.string.hotel_fours_phone) ,R.drawable.restaurant_lenoir2));
        restaurantList.add(new Location(getString(R.string.hotel_fours) ,getString(R.string.hotel_fours_address)
                , getString(R.string.hotel_fours_phone) ,R.drawable.restaurant_five2));
        restaurantList.add(new Location(getString(R.string.hotel_fours) ,getString(R.string.hotel_fours_address)
                , getString(R.string.hotel_fours_phone) ,R.drawable.restaurant_bar61_2));

        //create adapter
        LocationAdapter locationAdapter = new LocationAdapter(this,restaurantList ,R.color.restaurant_list_color);

        //get the list view
        list=(ListView)findViewById(R.id.location_list);

        list.setAdapter(locationAdapter);
    }
}
