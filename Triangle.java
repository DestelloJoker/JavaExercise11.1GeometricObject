/*Program Name: Triangle.java
 * Authors: Austin P
 * Date last Updated: 8/27/2024
 * Purpose: This program extends the GemometricObject class and implements the Triangle class
 * to calculate the side lengths, then the perimeter and are of a triangle
 */
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
  
    public Triangle() {
      this(1.0, 1.0, 1.0);
    }
  
    public Triangle(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    }
  
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
      super(color, filled);
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    }
  
    public double getSide1() {
      return side1;
    }
  
    public double getSide2() {
      return side2;
    }
  
    public double getSide3() {
      return side3;
    }
  
    @Override
    public double getArea() {
      double s = (side1 + side2 + side3) / 2;
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
  
    @Override
    public double getPerimeter() {
      return side1 + side2 + side3;
    }
  
    @Override
    public String toString() {
      return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 +
             ", color: " + getColor() + ", filled: " + isFilled();
    }
  }
  
