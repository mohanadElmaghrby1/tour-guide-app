package apps.mohanad.com.londontourguide;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mohanad on 02/06/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    /*the list background color*/
    private int backgroundColor;

    public LocationAdapter(@NonNull Context context , @NonNull ArrayList<Location> places , int backgroundColor) {
        super(context, 0, places);
        this.backgroundColor=backgroundColor;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //get the location object
        final Location location = getItem(position);

        //get the list item location name
        TextView location_name=(TextView)listItemView.findViewById(R.id.location_name);

        //set the location name on list item to be object location name
        location_name.setText(location.getName());

        //get the list item location name
        TextView location_city=(TextView)listItemView.findViewById(R.id.location_city);

        //set the location name on list item to be object location name
        location_city.setText(location.getAddress());

        //get the location image
        ImageView location_img=(ImageView)listItemView.findViewById(R.id.location_img);

        //set the location image
        location_img.setImageResource(location.getImgResourceId());

        listItemView.setBackgroundResource(backgroundColor);

        //get the call image and action it
        ImageView callImg =(ImageView) listItemView.findViewById(R.id.callImag);
        /*action the list view items
        * when the call icon is clicked , an implicit intent is opened to call
         * the location
        * */
        callImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create an implicit phone call intent
                Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                //set the phone number
                phoneIntent.setData(Uri.parse("tel:" +location.getPhone()));

                //check that it will be handel
                if (ActivityCompat.checkSelfPermission(getContext(),
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                getContext().startActivity(phoneIntent);
            }
        });


        return listItemView;
    }
}
