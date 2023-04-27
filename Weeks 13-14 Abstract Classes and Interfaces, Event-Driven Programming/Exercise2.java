public class Exercise2 {
  public static void main(String[] args) {
    Octagon a1 = new Octagon(5);
    System.out.println("Area is " + a1.getArea());
    System.out.println("Perimeter is " + a1.getPerimeter());

    Octagon a2 = (Octagon)(a1.clone());
    System.out.println("Compare the octagons " + a1.compareTo(a2));
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

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
  private double side;
  
  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  // TO DO
  /** Construct a Octagon with the default side */
  public Octagon() { setSide(1); }
  /** Construct a Octagon with the specified side */
  public Octagon(double value) { setSide(value); }
  
  /** Implement the abstract method getArea in GeometricObject */
  public double getArea() {
   return (2 + 4 / Math.sqrt(2)) * side * side;
  }
  
  /** Implement the abstract method getPerimeter in GeometricObject */
  public double getPerimeter() {
   return 8 * side;
  }
  
  // Implement compareTo()
  public int compareTo(Octagon o) {
   if (this.side > o.getSide()) return 1;
   else if (this.side == o.getSide()) return 0;
   else return -1;
  }
  
  /** Implement the clone method in the Object class */
  public Object clone() {
   try {
      return super.clone();
   }
   catch (CloneNotSupportedException ex) {
      return null;
   }
  }
}
