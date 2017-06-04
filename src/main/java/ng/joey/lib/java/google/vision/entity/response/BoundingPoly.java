package ng.joey.lib.java.google.vision.entity.response;

import java.util.List;

/**
 * A bounding polygon for the detected image annotation.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#BoundingPoly">BoundingPoly</a>
 */
public class BoundingPoly {

    public List<Vertex> vertices;

    /**
     * A vertex represents a 2D point in the image. NOTE: the vertex coordinates are in the same scale as the original image.
     * <br>
     * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Vertex">Vertex</a>
     */
    public static class Vertex {
        public double x;
        public double y;
    }
}
