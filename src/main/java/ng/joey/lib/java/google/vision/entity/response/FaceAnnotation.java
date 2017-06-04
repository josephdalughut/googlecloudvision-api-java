package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * Created by joey on 6/3/17.
 */

/**
 * A face annotation object contains the results of face detection.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#FaceAnnotation">FaceAnnotation</a>
 */
public class FaceAnnotation {

    /**The bounding polygon around the face. The coordinates of the bounding box are in the original
     * image's scale, as returned in <b>ImageParams</b>. The bounding box is computed to "frame" the face in
     * accordance with human expectations. It is based on the landmarker results. Note that one or more x
     * and/or y coordinates may not be generated in the <b>BoundingPoly</b> (the polygon will be unbounded)
     * if only a partial face appears in the image to be annotated.
     */
    public BoundingPoly boundingPoly;

    /**
     * The fdBoundingPoly bounding polygon is tighter than the boundingPoly, and encloses only the
     * skin part of the face. Typically, it is used to eliminate the face from any image analysis
     * that detects the "amount of skin" visible in an image. It is not based on the landmarker
     * results, only on the initial face detection, hence the
     * <br><br>
     * <b>fd</b>
     * <br><br>
     * (face detection) prefix.
     * */
    public BoundingPoly fdBoundingPoly;

    /**
     * Detected face landmarks.
     */
    public List<Landmark> landmarks;

    /**
     * Roll angle, which indicates the amount of clockwise/anti-clockwise rotation of the face
     * relative to the image vertical about the axis perpendicular to the face. Range [-180,180].
     */
    public double rollAngle;

    /**
     * Yaw angle, which indicates the leftward/rightward angle that the face is pointing relative
     * to the vertical plane perpendicular to the image. Range [-180,180].
     */
    public double panAngle;

    /**
     * Pitch angle, which indicates the upwards/downwards angle that the face is pointing relative
     * to the image's horizontal plane. Range [-180,180].
     */
    public double tiltAngle;

    /**
     * Detection confidence. Range [0, 1].
     */
    public double detectionConfidence;

    /**
     * Face landmarking confidence. Range [0, 1].
     */
    public double landmarkingConfidence;

    /**
     * Joy likelihood.
     */
    public Likelihood joyLikelihood;

    /**
     * Sorrow likelihood.
     */
    public Likelihood sorrowLikelihood;

    /**
     * Anger likelihood.
     */
    public Likelihood angerLikelihood;

    /**
     * Surprise likelihood.
     */
    public Likelihood surpriseLikelihood;

    /**
     * Under-exposed likelihood.
     */
    public Likelihood underExposedLikelihood;

    /**
     * Blurred likelihood.
     */
    public Likelihood blurredLikelihood;

    /**
     * Headwear likelihood.
     */
    public Likelihood headwearLikelihood;

}
