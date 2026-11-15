/**
 * Represents a rectangle with a width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
  * Constructs a rectangle.
  *
  * @param w the width
  * @param h the height
  */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
  * Calculates the area of the rectangle.
  *
  * @return the area
  */
  public double area() {
    return width * height;
  }

  /**
  * Scales the rectangle.
  *
  * @param factor the scaling factor
  */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
  * Checks whether this rectangle is larger than another.
  *
  * @param other the rectangle to compare with
  * @return true if this rectangle has a larger area
  */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}