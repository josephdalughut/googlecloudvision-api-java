package ng.joey.lib.java.google.vision.entity.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Logical element on the page.
 * <br>
 * @see <a href="https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate#Block">Block</a>
 */
public class Block {

    public TextProperty property;
    public BoundingPoly boundingBox;
    public List<Paragraph> paragraphs;
    public BlockType blockType;

    /**
     * Type of a block (text, image etc) as identified by OCR.
     * <br>
     * @see <a href="Type of a block (text, image etc) as identified by OCR.">BlockType</a>
     */
    public static enum BlockType {
        /**
         * Unknown block type.
         */
        @SerializedName("UNKNOWN") UNKNOWN("UNKNOWN"),

        /**
         * Regular text block.
         */
        @SerializedName("TEXT") TEXT("TEXT"),

        /**
         * Table block.
         */
        @SerializedName("TABLE") TABLE("TABLE"),

        /**
         * Image block.
         */
        @SerializedName("PICTURE") PICTURE("PICTURE"),

        /**
         * Horizontal/vertical line box.
         */
        @SerializedName("RULER") RULER("RULER"),

        /**
         * Barcode block.
         */
        @SerializedName("BARCODE") BARCODE("BARCODE");

        BlockType(String name) {
            this.name = name;
        }

        String name;

        @Override
        public String toString() {
            return name;
        }
    }
}
