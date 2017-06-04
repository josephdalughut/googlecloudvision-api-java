package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * TextAnnotation contains a structured representation of OCR extracted text. The hierarchy of an OCR
 * extracted text structure is like this: TextAnnotation -> Page -> Block -> Paragraph -> Word -> Symbol
 * Each structural component, starting from Page, may further have their own properties.
 * Properties describe detected languages, breaks etc.. Please refer to the
 * <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#TextProperty">google.cloud.vision.v1.TextAnnotation.TextProperty</a>
 * message definition below for more detail.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#TextAnnotation">TextAnnotation</a>
 */
public class TextAnnotation {

    public List<Page> pages;
    public String text;

}
