package ng.joey.lib.java.google.vision.entity.request;

import com.google.gson.annotations.SerializedName;

/**
 * Users describe the type of Google Cloud Vision API tasks to perform over images by using *Feature*s.
 * Each Feature indicates a type of image detection task to perform. Features encode the Cloud Vision
 * API vertical to operate on and the number of top-scoring results to return.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Feature">Feature</a>
 */
public class Feature {

    /**
     * Constructor
     * @param maxResults @see {@link #maxResults}
     * @param type @see {@link #type}
     */
    public Feature(int maxResults, Type type) {
        this.maxResults = maxResults;
        this.type = type;
    }

    /**
     * Constructor,
     * default {@link #maxResults} = 1
     * @see #maxResults
     * @param type @see {@link #type}
     */
    public Feature(Type type) {
        this.type = type;
    }

    /**
     * Maximum number of results of this type.
     */
    public int maxResults = 1;

    /**
     * The feature type.
     */
    public Type type;

    /**
     * Type of image feature.
     */
    public static enum Type {
        /**
         * Unspecified feature type.
         */
        @SerializedName("TYPE_UNSPECIFIED") TYPE_UNSPECIFIED("TYPE_UNSPECIFIED"),

        /**
         * Run face detection.
         */
        @SerializedName("FACE_DETECTION") FACE_DETECTION("FACE_DETECTION"),

        /**
         * Run landmark detection.
         */
        @SerializedName("LANDMARK_DETECTION") LANDMARK_DETECTION("LANDMARK_DETECTION"),

        /**
         * Run logo detection.
         */
        @SerializedName("LOGO_DETECTION") LOGO_DETECTION("LOGO_DETECTION"),

        /**
         * Run label detection.
         */
        @SerializedName("LABEL_DETECTION") LABEL_DETECTION("LABEL_DETECTION"),

        /**
         * Run OCR.
         */
        @SerializedName("TEXT_DETECTION") TEXT_DETECTION("TEXT_DETECTION"),

        /**
         * Run dense text document OCR. Takes precedence when both {@link #DOCUMENT_TEXT_DETECTION} and {@link #TEXT_DETECTION} are present.
         */
        @SerializedName("DOCUMENT_TEXT_DETECTION") DOCUMENT_TEXT_DETECTION("DOCUMENT_TEXT_DETECTION"),

        /**
         * Run computer vision models to compute image safe-search properties.
         */
        @SerializedName("SAFE_SEARCH_DETECTION") SAFE_SEARCH_DETECTION("SAFE_SEARCH_DETECTION"),

        /**
         * Compute a set of image properties, such as the image's dominant colors.
         */
        @SerializedName("IMAGE_PROPERTIES") IMAGE_PROPERTIES("IMAGE_PROPERTIES"),

        /**
         * Run crop hints.
         */
        @SerializedName("CROP_HINTS") CROP_HINTS("CROP_HINTS"),

        /**
         * Run web detection.
         */
        @SerializedName("WEB_DETECTION") WEB_DETECTION("WEB_DETECTION");

        String name;

        Type(String name) {
            this.name = name;
        }

    }

}
