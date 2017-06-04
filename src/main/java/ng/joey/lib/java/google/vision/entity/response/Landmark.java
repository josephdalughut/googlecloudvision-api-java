package ng.joey.lib.java.google.vision.entity.response;

import com.google.gson.annotations.SerializedName;

/**
 * A face-specific landmark (for example, a face feature). Landmark positions may fall outside the
 * bounds of the image if the face is near one or more edges of the image.
 * Therefore it is NOT guaranteed that 0 <= x < width or 0 <= y < height.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Landmark">Landmark</a>
 */
public class Landmark {

    public Type type;
    public Position position;

    /**
     * Face landmark (feature) type. Left and right are defined from the vantage of the viewer of
     * the image without considering mirror projections typical of photos. So, LEFT_EYE, typically,
     * is the person's right eye.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Type_1">Type</a>
     */
    public static enum Type {

        /**Unknown face landmark detected. Should not be filled.*/
        @SerializedName("UNKNOWN_LANDMARK") UNKNOWN_LANDMARK("UNKNOWN_LANDMARK"),
        @SerializedName("LEFT_EYE") LEFT_EYE("LEFT_EYE"),
        @SerializedName("RIGHT_EYE") RIGHT_EYE("RIGHT_EYE"),
        @SerializedName("LEFT_OF_LEFT_EYEBROW") LEFT_OF_LEFT_EYEBROW("LEFT_OF_LEFT_EYEBROW"),
        @SerializedName("RIGHT_OF_LEFT_EYEBROW") RIGHT_OF_LEFT_EYEBROW("RIGHT_OF_LEFT_EYEBROW"),
        @SerializedName("LEFT_OF_RIGHT_EYEBROW") LEFT_OF_RIGHT_EYEBROW("LEFT_OF_RIGHT_EYEBROW"),
        @SerializedName("RIGHT_OF_RIGHT_EYEBROW") RIGHT_OF_RIGHT_EYEBROW("RIGHT_OF_RIGHT_EYEBROW"),
        @SerializedName("MIDPOINT_BETWEEN_EYES") MIDPOINT_BETWEEN_EYES("MIDPOINT_BETWEEN_EYES"),
        @SerializedName("NOSE_TIP") NOSE_TIP("NOSE_TIP"),
        @SerializedName("UPPER_LIP") UPPER_LIP("UPPER_LIP"),
        @SerializedName("LOWER_LIP") LOWER_LIP("LOWER_LIP"),
        @SerializedName("MOUTH_LEFT") MOUTH_LEFT("MOUTH_LEFT"),
        @SerializedName("MOUTH_RIGHT") MOUTH_RIGHT("MOUTH_RIGHT"),
        @SerializedName("MOUTH_CENTER") MOUTH_CENTER("MOUTH_CENTER"),
        @SerializedName("NOSE_BOTTOM_RIGHT") NOSE_BOTTOM_RIGHT("NOSE_BOTTOM_RIGHT"),
        @SerializedName("NOSE_BOTTOM_LEFT") NOSE_BOTTOM_LEFT("NOSE_BOTTOM_LEFT"),
        @SerializedName("NOSE_BOTTOM_CENTER") NOSE_BOTTOM_CENTER("NOSE_BOTTOM_CENTER"),
        @SerializedName("LEFT_EYE_TOP_BOUNDARY") LEFT_EYE_TOP_BOUNDARY("LEFT_EYE_TOP_BOUNDARY"),
        @SerializedName("LEFT_EYE_RIGHT_CORNER") LEFT_EYE_RIGHT_CORNER("LEFT_EYE_RIGHT_CORNER"),
        @SerializedName("LEFT_EYE_BOTTOM_BOUNDARY") LEFT_EYE_BOTTOM_BOUNDARY("LEFT_EYE_BOTTOM_BOUNDARY"),
        @SerializedName("LEFT_EYE_LEFT_CORNER") LEFT_EYE_LEFT_CORNER("LEFT_EYE_LEFT_CORNER"),
        @SerializedName("RIGHT_EYE_TOP_BOUNDARY") RIGHT_EYE_TOP_BOUNDARY("RIGHT_EYE_TOP_BOUNDARY"),
        @SerializedName("RIGHT_EYE_RIGHT_CORNER") RIGHT_EYE_RIGHT_CORNER("RIGHT_EYE_RIGHT_CORNER"),
        @SerializedName("RIGHT_EYE_BOTTOM_BOUNDARY") RIGHT_EYE_BOTTOM_BOUNDARY("RIGHT_EYE_BOTTOM_BOUNDARY"),
        @SerializedName("RIGHT_EYE_LEFT_CORNER") RIGHT_EYE_LEFT_CORNER("RIGHT_EYE_LEFT_CORNER"),
        @SerializedName("LEFT_EYEBROW_UPPER_MIDPOINT") LEFT_EYEBROW_UPPER_MIDPOINT("LEFT_EYEBROW_UPPER_MIDPOINT"),
        @SerializedName("RIGHT_EYEBROW_UPPER_MIDPOINT") RIGHT_EYEBROW_UPPER_MIDPOINT("RIGHT_EYEBROW_UPPER_MIDPOINT"),
        @SerializedName("LEFT_EAR_TRAGION") LEFT_EAR_TRAGION("LEFT_EAR_TRAGION"),
        @SerializedName("RIGHT_EAR_TRAGION") RIGHT_EAR_TRAGION("RIGHT_EAR_TRAGION"),
        @SerializedName("LEFT_EYE_PUPIL") LEFT_EYE_PUPIL("LEFT_EYE_PUPIL"),
        @SerializedName("RIGHT_EYE_PUPIL") RIGHT_EYE_PUPIL("RIGHT_EYE_PUPIL"),
        @SerializedName("FOREHEAD_GLABELLA") FOREHEAD_GLABELLA("FOREHEAD_GLABELLA"),
        @SerializedName("CHIN_GNATHION") CHIN_GNATHION("CHIN_GNATHION"),
        @SerializedName("CHIN_LEFT_GONION") CHIN_LEFT_GONION("CHIN_LEFT_GONION"),
        @SerializedName("CHIN_RIGHT_GONION") CHIN_RIGHT_GONION("CHIN_RIGHT_GONION");


        String name;

        Type(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    /**
     * A 3D position in the image, used primarily for Face detection landmarks. A valid Position
     * must have both x and y coordinates. The position coordinates are in the same scale as the
     * original image.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Position">Position</a>
     */
    public static class Position {
        public double x, y, z;
    }
}
