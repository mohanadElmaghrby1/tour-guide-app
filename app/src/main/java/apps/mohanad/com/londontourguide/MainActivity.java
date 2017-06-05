package apps.mohanad.com.londontourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * open the restaurants
     * @param view
     */
    public void openFoodIntent(View view) {
        Intent inten  = new Intent(this,RestaurantActivity.class);
        startActivity(inten);
    }

    /**
     * open the hotles
     * @param view
     */
    public void openHotelIntent(View view) {
        Intent inten  = new Intent(this,HotelActivity.class);
        startActivity(inten);
    }

    /**
     * open the hospitals
     * @param view
     */
    public void openHospitalIntent(View view) {
        Intent inten  = new Intent(this,HospitalActivity.class);
        startActivity(inten);
    }

    /**
     * open the Shops
     * @param view
     */
    public void openShopIntent(View view) {
        Intent inten  = new Intent(this,ShopActivity.class);
        startActivity(inten);
    }
}
