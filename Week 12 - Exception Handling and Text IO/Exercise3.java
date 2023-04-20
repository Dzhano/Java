import java.util.Scanner;

public class Exercise3 {
   public static void main(String[] args) {
      try {
         TriangleWithException t1 = new TriangleWithException(1.5, 2, 3);
         System.out.println("Perimeter for t1: " + t1.getPerimeter());
         System.out.println("Area for t1: " + t1.getArea());
         TriangleWithException t2 = new TriangleWithException(1, 2,3);
         System.out.println("Perimeter for t2: " + t2.getPerimeter());
         System.out.println("Area for t2: " + t2.getArea());
      }
      catch (IllegalTriangleException ex) {
         System.out.println("Illegal triangle");
         System.out.println("Side1: " + ex.getSide1());
         System.out.println("Side2: " + ex.getSide2());
         System.out.println("Side3: " + ex.getSide3());
      }
   }
}

class IllegalTriangleException extends Exception {
   private double a, b, c;
   public IllegalTriangleException(double a, double b, double c, String s) {
      super(s);
      this.a = a;
      this.b = b;
      this.c = c;
   }
   
   public double getSide1() { return a; }
   public double getSide2() { return b; }
   public double getSide3() { return c; }
}

class TriangleWithException extends Object {
   double side1, side2, side3;
   public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
      if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
         throw new IllegalTriangleException(side1, side2, side3, "The sum of any two sides is greater than the other side");
   }
   
   public double getArea() {
      double s = (side1 + side2 + side3) / 2;
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
   }
   
   public double getPerimeter() {
      return side1 + side2 + side3;
   }
   
   @Override
   public String toString() {
      // Implement it to return the three sides
      return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
   }
}