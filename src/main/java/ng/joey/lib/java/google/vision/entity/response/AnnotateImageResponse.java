package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;
import java.util.Map;

/**
 * Response to an image annotation request.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#AnnotateImageResponse">AnnotateImageResponse</a>
 */
public class AnnotateImageResponse {

    public List<FaceAnnotation> faceAnnotations;
    public List<EntityAnnotation> landmarkAnnotations;
    public List<EntityAnnotation> logoAnnotations;
    public List<EntityAnnotation> labelAnnotations;
    public List<EntityAnnotation> textAnnotations;
    public TextAnnotation fullTextAnnotation;
    public SafeSearchAnnotation safeSearchAnnotation;
    public ImageProperties imagePropertiesAnnotation;
    public CropHintsAnnotation cropHintsAnnotation;
    public WebDetection webDetection;
    public Status error;

    /**
     * The Status type defines a logical error model that is suitable for different programming environments,
     * including REST APIs and RPC APIs. It is used by <a href="https://github.com/grpc">gRPC</a>. The error model is designed to be:
     * <ul>
     *     <li>Simple to use and understand for most users</li>
     *     <li>Flexible enough to meet unexpected needs</li>
     * </ul>
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Status">Status</a>
     */
    public static class Status {

        /**The status code, which should be an enum value of <a href="https://cloud.google.com/vision/docs/reference/rest/v1/Code">google.rpc.Code</a>*/
        public int code;

        /**A developer-facing error message, which should be in English. Any user-facing error message
         * should be localized and sent in the <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Status.FIELDS.details">google.rpc.Status.details</a> field, or localized by the client.*/
        public String message;

        /**A list of messages that carry the error details. There will be a common set of message types for APIs to use.
         * An object containing fields of an arbitrary type. An additional field "<b>@type</b>" contains a URI identifying the type.
         * Example: <b>{ "id": 1234, "@type": "types.example.com/standard/id" }</b>.
         * */
        public Map<Object, Object>[] details;

    }

}
