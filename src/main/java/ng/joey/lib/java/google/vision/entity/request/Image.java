package ng.joey.lib.java.google.vision.entity.request;

/**
 * Client image to perform Google Cloud Vision API tasks over.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Image">Image</a>
 */
public class Image {

    /**
     * Image content, represented as a stream of bytes. Note: as with all <b>bytes</b> fields, protobuffers
     * use a pure binary representation, whereas JSON representations use base64.
     * <br><br>
     * A base64-encoded string.
     */
    public String content;

    /**
     * Google Cloud Storage image location. If both <b>content</b> and <b>source</b> are provided for an image,
     * <b>content</b> takes precedence and is used to perform the image annotation request.
     */
    public ImageSource source;

    /**
     * Constructor
     * @param content @see {@link #content}
     */
    public Image(String content) {
        this.content = content;
    }

    /**
     * Constructor
     * @param source @see {@link #source}
     */
    public Image(ImageSource source) {
        this.source = source;
    }

//    /**
//     * Constructor
//     * @param file a file to encode into Base64 for {@link #content}
//     * @throws IOException
//     */
//    public Image(File file) throws IOException {
//        byte[] bytes = Files.toByteArray(file);
//        content = BaseEncoding.base64().encode(bytes);
//    }

    /**
     * External image source (Google Cloud Storage image location).
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#ImageSource">ImageSource</a>
     */
    public static class ImageSource {

        /**
         * NOTE: For new code <b>imageUri</b> below is preferred. Google Cloud Storage image URI, which must
         * be in the following form: <b>gs://bucket_name/object_name</b>
         * (for details, see <a href="https://cloud.google.com/storage/docs/reference-uris">Google Cloud Storage Request URIs)</a>.
         * NOTE: Cloud Storage object versioning is not supported.
         */
        public String gcsImageUri;

        /**
         * Image URI which supports: 1) Google Cloud Storage image URI, which must be in the following
         * form: <b>gs://bucket_name/object_name</b> (for details, see
         * <a href="https://cloud.google.com/storage/docs/reference-uris">Google Cloud Storage Request URIs)</a>.
         * NOTE: Cloud Storage object versioning is not supported. 2) Publicly accessible image HTTP/HTTPS URL.
         * This is preferred over the legacy <b>gcsImageUri</b> above. When both <b>gcsImageUri</b> and
         * <b>imageUri</b> are specified, <b>imageUri</b> takes precedence.
         */
        public String imageUri;

        /**
         * Constructor, either one should be null or imageUri would be used instead
         * @param gcsImageUri @see {@link #gcsImageUri}
         * @param imageUri @see {@link #imageUri}
         */
        public ImageSource(String gcsImageUri, String imageUri) {
            this.gcsImageUri = gcsImageUri;
            this.imageUri = imageUri;
        }


    }


}
