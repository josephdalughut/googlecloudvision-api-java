package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * Relevant information for the image from the Internet.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#WebDetection">WebDetection</a>
 */
public class WebDetection {

    public List<WebEntity> webEntities;
    public List<WebImage> fullMatchingImages;
    public List<WebImage> partialMatchingImages;
    public List<WebPage> pagesWithMatchingImages;
    public List<WebImage> visuallySimilarImages;


    /**
     * Entity deduced from similar images on the Internet.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#WebEntity">WebEntity</a>
     */
    public static class WebEntity{

        /**Opaque entity ID. */
        public String entityId;

        /**
         * Overall relevancy score for the entity. Not normalized and not comparable across different image queries.
         */
        public double Score;

        /**
         * Canonical description of the entity, in English.
         */
        public String description;

    }

    /**
     * Metadata for online images.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#WebImage">WebImage</a>
     */
    public static class WebImage {

        /**The result image URL. */
        public String url;

        /**Overall relevancy score for the image. Not normalized and not comparable across different image queries. */
        public double score;

    }

    /**
     * Metadata for web pages
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#WebPage">WebPage</a>
     */
    public static class WebPage {

        /**The result web page URL. */
        public String url;

        /**Overall relevancy score for the web page. Not normalized and not comparable across different image queries. */
        public double score;

    }

}
