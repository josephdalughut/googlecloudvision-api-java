package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * A word representation.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Word">Word</a>
 */
public class Word {

    public TextProperty property;
    public BoundingPoly boundingBox;
    public List<Symbol> symbols;

    /**
     * A single symbol representation.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Symbol">Symbol</a>
     */
    public static class Symbol {
        public TextProperty property;
        public BoundingPoly boundingBox;
        public String text;
    }
}
