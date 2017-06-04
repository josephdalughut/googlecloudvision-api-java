package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * Stores image properties, such as dominant colors.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#ImageProperties">ImageProperties</a>
 */
public class ImageProperties {

    public DominantColorsAnnotation dominantColorsAnnotation;

    /**
     * Set of dominant colors and their corresponding scores.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#DominantColorsAnnotation">DominantColorsAnnotation</a>
     */
    public static class DominantColorsAnnotation {

        public List<ColorInfo> colors;

        /**
         * Color information consists of RGB channels, score, and the fraction of the image that the color occupies in the image.
         * <br>
         * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#ColorInfo">ColorInfo</a>
         */
        public static class ColorInfo {

            public double score, pixelFraction;
            public Color color;

            /**
             * Represents a color in the RGBA color space. This representation is designed for simplicity
             * of conversion to/from color representations in various languages over compactness; for example,
             * the fields of this representation can be trivially provided to the constructor of "java.awt.Color"
             * in Java; it can also be trivially provided to UIColor's "+colorWithRed:green:blue:alpha" method in iOS;
             * and, with just a little work, it can be easily formatted into a CSS "rgba()" string in JavaScript, as well.
             * <br>
             * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Color">Color</a>
             */
            public static class Color {

                public double red, green, blue, alpha;

            }

        }

    }

}
