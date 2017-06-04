package ng.joey.lib.java.google.vision.entity.response;

import com.google.gson.annotations.SerializedName;

/**
 * Detected start or end of a structural component.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#DetectedBreak">DetectedBreak</a>
 */
public class DetectedBreak {

    public boolean isPrefix;
    public BreakType type;

    /**
     * Enum to denote the type of break found. New line, space etc.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#BreakType">BreakType</a>
     */
    public static enum BreakType {

        /**
         * Unknown break label type.
         */
        @SerializedName("UNKNOWN") UNKNOWN("UNKNOWN"),

        /**
         * Regular space.
         */
        @SerializedName("SPACE") SPACE("SPACE"),

        /**
         * Sure space (very wide).
         */
        @SerializedName("SURE_SPACE") SURE_SPACE("SURE_SPACE"),

        /**
         * Line-wrapping break.
         */
        @SerializedName("EOL_SURE_SPACE") EOL_SURE_SPACE("EOL_SURE_SPACE"),

        /**
         * End-line hyphen that is not present in text; does not co-occur with
         * {@link BreakType#SPACE}, {@link BreakType#LEADER_SPACE}, or {@link BreakType#LINE_BREAK}.
         */
        @SerializedName("HYPHEN") HYPHEN("HYPHEN"),

        /**
         * Line break that ends a paragraph.
         */
        @SerializedName("LINE_BREAK") LINE_BREAK("LINE_BREAK"),

        @SerializedName("LEADER_SPACE") LEADER_SPACE("LEADER_SPACE");



        BreakType(String name) {
            this.name = name;
        }

        String name;


        @Override
        public String toString() {
            return name;
        }
    }
}
