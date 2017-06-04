package ng.joey.lib.java.google.vision.entity.response;

import com.google.gson.annotations.SerializedName;

/**
 * A bucketized representation of likelihood, which is intended to give clients highly stable
 * results across model upgrades.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Likelihood">Liklihood</a>
 */
public enum Likelihood {
    @SerializedName("UNKNOWN") UNKNOWN("UNKNOWN"),
    @SerializedName("VERY_UNLIKELY") VERY_UNLIKELY("VERY_UNLIKELY"),
    @SerializedName("UNLIKELY") UNLIKELY("UNLIKELY"),
    @SerializedName("POSSIBLE") POSSIBLE("POSSIBLE"),
    @SerializedName("LIKELY") LIKELY("LIKELY"),
    @SerializedName("VERY_LIKELY") VERY_LIKELY("VERY_LIKELY");

    String name;

    Likelihood(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
