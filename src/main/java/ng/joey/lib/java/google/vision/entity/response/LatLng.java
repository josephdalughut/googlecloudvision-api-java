package ng.joey.lib.java.google.vision.entity.response;

/**
 * An object representing a latitude/longitude pair. This is expressed as a pair of doubles
 * representing degrees latitude and degrees longitude. Unless specified otherwise,
 * this must conform to the <a href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf">WGS84 standard</a>.
 * Values must be within normalized ranges.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#LatLng">LatLng</a>
 */
public class LatLng {
    public double latitude;
    public double longitude;

    public LatLng(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
