package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * Set of crop hints that are used to generate new crops when serving images.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#CropHintsAnnotation">CropHintsAnnotation</a>
 */
public class CropHintsAnnotation {

    public List<CropHint> cropHints;

    /**
     * Single crop hint that is used to generate a new crop when serving an image.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#CropHint">CropHint</a>
     */
    public static class CropHint{

        /**The bounding polygon for the crop region. The coordinates of the bounding box are in the original image's scale, as returned in <b>ImageParams</b>.*/
        public BoundingPoly boundingPoly;

        /**Confidence of this being a salient region. Range [0, 1]. */
        public double confidence;

        /**Fraction of importance of this salient region with respect to the original image. */
        public double importanceFraction;
    }

}
