package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * Structural unit of text representing a number of words in certain order.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Paragraph">Paragraph</a>
 */
public class Paragraph {
    public TextProperty property;
    public BoundingPoly boundingBox;
    public List<Word> words;

}
