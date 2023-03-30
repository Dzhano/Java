//public @interface Override;

public class Shapes {
   public static void main(String[] args) {
      Shape[] shapes = new Shape[4];
      shapes[0] = new Shape();
      shapes[1] = new Circle(2);
      shapes[2] = new Rectangle(2,3);
      shapes[3] = new Square(2);
      for (int x=0; x < shapes.length; x++) {
         System.out.print(shapes[x] + ": ");
         System.out.println(shapes[x].getArea());
      }
   }
}

class Shape {
   //@Override
   public double getArea() {
      return 0;
   }
   
   //@Override
   public String toString() {
      return "Shape";
   }
}

class Circle extends Shape {
   private double radius;
   
   Circle() {
      radius = 0;
   }
   
   Circle(double radius) {
      this.radius = radius;
   }
   
   public double getArea() {
      return Math.PI * radius * radius;
   }
   
   public String toString() {
      return "Circle";
   }
}

class Rectangle extends Shape {
   private double width;
   private double height;
   
   Rectangle() {
      setWidth(0);
      setHeight(0);
   }
   
   Rectangle(double width, double height) {
      setWidth(width);
      setHeight(height);
   }
   
   void setWidth(double w) {
		if (w > -1) this.width = w;
		else this.width = 0;
	}

	double getWidth() {
		return this.width;
	}
   
   void setHeight(double h) {
		if (h > -1) this.height = h;
		else this.height = 0;
	}

	double getHeight() {
		return this.height;
	}
   
   public double getArea() {
      return height * width;
   }
   
   public String toString() {
      return "Rectangle";
   }
}

class Square extends Rectangle {
   Square(double side) {
      super(side, side);
   }
   
   public String toString() {
      return "Square";
   }
}