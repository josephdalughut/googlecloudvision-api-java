package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * Set of detected entity features.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#EntityAnnotation">EntityAnnotation</a>
 */
public class EntityAnnotation {
    public String mid, locale, description, score;
    public double confidence, tropicality;
    public BoundingPoly boundingPoly;
    public List<LocationInfo> locations;
    public List<Property> properties;

    /**
     * A Property consists of a user-supplied name/value pair.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Property">Property</a>
     */
    public static class Property {
        public String name, value, uint64Value;
    }
}
