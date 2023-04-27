import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three sides: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();
    
    TriangleNew triangle = new TriangleNew(side1, side2, side3);
    
    System.out.print("Enter the color: ");
    String color = input.next();
    triangle.setColor(color);
    
    System.out.print("Enter a boolean value for filled: ");
    boolean filled = input.nextBoolean();
    triangle.setFilled(filled);

    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is "
      + triangle.getPerimeter());
    System.out.println(triangle);
  }
}

// GeometricObject.java: The abstract GeometricObject class
abstract class GeometricObject {
  private String color = "white";
  private boolean filled;

  /**Default construct*/
  protected GeometricObject() {
  }

  /**Construct a geometric object*/
  protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**Getter method for color*/
  public String getColor() {
    return color;
  }

  /**Setter method for color*/
  public void setColor(String color) {
    this.color = color;
  }

  /**Getter method for filled. Since filled is boolean,
     so, the get method name is isFilled*/
  public boolean isFilled() {
    return filled;
  }

  /**Setter method for filled*/
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**Abstract method findArea*/
  public abstract double getArea();

  /**Abstract method getPerimeter*/
  public abstract double getPerimeter();
}

class TriangleNew extends GeometricObject {
  private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
  
  /** Implement the two constructors */
  public TriangleNew() {}
  
  public TriangleNew(double side1, double side2, double side3) {
   this.side1 = side1;
   this.side2 = side2;
   this.side3 = side3;
  }
  
  /** Implement the abstract methods in GeometricObject */
  public double getArea() {
   double p = getPerimeter() / 2;
   return Math.sqrt(p*(p - side1)*(p - side2)*(p - side3));
  }

  public double getPerimeter() {
   return this.side1 + this.side2 + this.side3;
  }
  
  // Override toString()
  @Override
  public String toString() {
   return "Triangle's sides: " + "\n" + "side1 = " + side1 + "\n" + "side2 = " + side2 + "\n" + "side3 = " + side3;
  }
}
