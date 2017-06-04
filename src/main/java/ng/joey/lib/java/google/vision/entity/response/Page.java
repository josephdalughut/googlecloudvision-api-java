package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * Detected page from OCR.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Page">Page</a>
 */
public class Page {

    public TextProperty property;
    public double width, height;
    public List<Block> blocks;

}
