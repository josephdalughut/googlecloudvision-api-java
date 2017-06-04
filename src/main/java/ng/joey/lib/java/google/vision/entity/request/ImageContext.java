package ng.joey.lib.java.google.vision.entity.request;

import ng.joey.lib.java.google.vision.entity.response.LatLng;

/**
 * Image context and/or feature-specific parameters.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#ImageContext">ImageContext</a>
 */
public class ImageContext {

    /**
     * Constructor
     * @param latLongRect @see {@link #latLongRect}
     * @param cropHintsParams @see {@link #cropHintsParams}
     * @param languageHints @see {@link #languageHints}
     */
    public ImageContext(LatLongRect latLongRect, CropHintsParams cropHintsParams, String[] languageHints) {
        this.latLongRect = latLongRect;
        this.languageHints = languageHints;
        this.cropHintsParams = cropHintsParams;
    }

    /**
     * lat/long rectangle that specifies the location of the image.
     */
    public LatLongRect latLongRect;

    /**
     * List of languages to use for TEXT_DETECTION. In most cases, an empty value yields the best results
     * since it enables automatic language detection. For languages based on the Latin alphabet,
     * setting <b>languageHints</b> is not needed. In rare cases, when the language of the text in the image
     * is known, setting a hint will help get better results (although it will be a significant hindrance
     * if the hint is wrong). Text detection returns an error if one or more of the specified languages is
     * not one of the <a href="https://cloud.google.com/vision/docs/languages">supported languages</a>.
     */
    public String[] languageHints;

    /**
     * Parameters for crop hints annotation request.
     */
    public CropHintsParams cropHintsParams;

    /**
     * Rectangle determined by min and max LatLng pairs.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#LatLongRect">LatLongRect</a>
     */
    public static class LatLongRect{

        /**
         * Min lat/long pair.
         */
        public LatLng minLatLng;

        /**
         * Max lat/long pair.
         */
        public LatLng maxLatLng;

        /**
         * Constructor
         * @param minLatLng @see {@link #minLatLng}
         * @param maxLatLng @see {@link #maxLatLng}
         */
        public LatLongRect(LatLng minLatLng, LatLng maxLatLng) {
            this.minLatLng = minLatLng;
            this.maxLatLng = maxLatLng;
        }
    }

    /**
     * Parameters for crop hints annotation request.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#CropHintsParams">CropHintsParams</a>
     */
    public static class CropHintsParams {

        /**
         *Aspect ratios in floats, representing the ratio of the width to the height of the image.
         * For example, if the desired aspect ratio is 4/3, the corresponding float value should be
         * 1.33333. If not specified, the best possible crop is returned. The number of provided
         * aspect ratios is limited to a maximum of 16; any aspect ratios provided after the 16th are
         * ignored.
         */
        public float[] aspectRatios;

        /**
         * Constructor
         * @param aspectRatios @see {@link #aspectRatios}
         */
        public CropHintsParams(float[] aspectRatios) {
            this.aspectRatios = aspectRatios;
        }
    }

}
