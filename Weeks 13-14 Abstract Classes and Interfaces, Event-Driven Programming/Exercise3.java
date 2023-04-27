import java.util.Date;

public class Exercise3 {
   public static void main(String[] args) {
      
   }
}

abstract class Shape {
   protected Date created = new Date();
   public abstract double getArea();
   public abstract double getPerimeter();
}

class Circle extends Shape implements Comparable, Cloneable {
   private double radius;
   
   public double getRadius() {
    return radius;
   }

   public void setRadius(double radius) {
    this.radius = radius;
   }
   
   public Circle() {setRadius(1)}
   public Circle(double value) { setRadius(value); }
   
   public double getArea() {
      return Math.PI * radius * radius;
   }
   
   public double getPerimeter() {
      return Math.PI * 2 * radius;
   }
   
   // Implement compareTo()
   public int compareTo(Circle c) {
      if (this.radius > c.getRadius()) return 1;
      else if (this.radius == c.getRadius()) return 0;
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
   
private static double sumAreas(Shape[] shapes) {
   double sum = 0;
   for (Shape shape: shapes) sum += shape.getArea();
   return sum;
}