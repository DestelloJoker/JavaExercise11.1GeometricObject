/*Program Name: GeometricTriangle.java
 * Authors: Austin P
 * Date last Updated: 8/27/2024
 * Purpose: This program is the driver for the GeometricObject and Triangle classes.
 */
public class GeometricTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "blue", true);
    
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println(triangle.toString());
      } 
}
