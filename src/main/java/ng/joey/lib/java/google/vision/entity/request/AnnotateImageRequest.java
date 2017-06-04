package ng.joey.lib.java.google.vision.entity.request;

import java.util.ArrayList;
import java.util.List;

/**
 * Request for performing Google Cloud Vision API tasks over a user-provided image, with user-requested
 * features.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#AnnotateImageRequest">AnnotateImageRequest</a>
 */
public class AnnotateImageRequest {

    /**
     * The image to be processed.
     */
    public Image image;

    /**
     * Run web detection.
     */
    public Feature[] features;

    /**
     * Additional context that may accompany the image.
     */
    public ImageContext imageContext;

    /**
     * Constructor
     * @param image @see {@link #image}
     * @param imageContext @see {@link #imageContext}
     * @param features @see {@link #features}
     */
    public AnnotateImageRequest(Image image, ImageContext imageContext, Feature[] features) {
        this(image, features);
        this.imageContext = imageContext;
    }

    /**
     * Constructor
     * @param image @see {@link #image}
     * @param features @see {@link #features}
     */
    public AnnotateImageRequest(Image image,Feature[] features) {
        this.image = image;
        this.features = features;
    }
}
