package ng.joey.lib.java.google.vision.entity.response;

/**
 * Set of features pertaining to the image, computed by computer vision methods over safe-search verticals
 * (for example, adult, spoof, medical, violence).
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#SafeSearchAnnotation">SafeSearchAnnotation</a>
 */
public class SafeSearchAnnotation {

    public Likelihood adult, spoof, medical, violence;

}
