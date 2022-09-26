import java.util.Locale;

public class Address {
    private class GeoLocation{
        private float longitude;
        private float latitude;
        public GeoLocation(float longitude,float  latitude) {
            this.longitude = longitude;
            this.latitude = latitude;
        }
    }

    private String province;
    private String city;
    private String society;
    private char block;
    private int plotNumber;
    private GeoLocation geoLocation;

    public Address(String province, String city, String society, char block,int plotNumber,
                   float longitude, float latitude){

        this.province = province;
        this.city = city;
        this.society = society;
        this.block = block;
        this.plotNumber = plotNumber;
        this.geoLocation = new GeoLocation(longitude, latitude);
    }

    public String getFullAddress(){
        return String.format("----------Plot Address----------" +
            "%nProvince: %s%nCity: %s%nSociety: %s%nBlock: %s%nPlot Number: %d" +
            "%nGeolocation: Longitude (%f), latitude (%f)",
            this.province, this.city, this.society, this.block,this.plotNumber,
            this.geoLocation.longitude, this.geoLocation.latitude);
    }

}
