package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * Additional information detected on the structural component.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#TextProperty">TextProperty</a>
 */
public class TextProperty {
    public List<DetectedLanguage> detectedLanguages;
    public DetectedBreak detectedBreak;

}
