package apps.mohanad.com.londontourguide;

/**
 * Created by mohanad on 02/06/17.
 * model to descripe location information (name , location , longitude , latitude )
 */

public class Location {

    /*the location name*/
    private String mName;

    /*the location address */
    private String mAddress;


    /*the location phone*/
    private String mPhone;

    /*the location image resource ID*/
    private int mImgResourceId;

    public Location(String mName, String mAddress, String mPhone, int mImgResourceId) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mImgResourceId = mImgResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone(){
        return mPhone;
    }

    public int getImgResourceId() {
        return mImgResourceId;
    }
}
