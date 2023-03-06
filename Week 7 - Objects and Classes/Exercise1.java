public class Exercise1 {
   public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(5, 6);
      System.out.println("The area of the rectangle is " + rectangle.getArea());
      System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
   }
}

class Rectangle {
   double width;
   double height;
   
   Rectangle(double w, double h) {
      width = w;
      height = h;
   }
   
   
   double getArea() {
      return width * height;
   }
   
   double getPerimeter() {
      return (width + height) * 2;
   }
}