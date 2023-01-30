import java.util.Scanner;

public class Distance {
   public static void main(String[] args) {
      double x1, x2, y1, y2, distance;
            
      // Assign values      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter next value: ");
      x1 = input.nextDouble();
      System.out.print("Enter next value: ");
      x2 = input.nextDouble();
      System.out.print("Enter next value: ");
      y1 = input.nextDouble();
      System.out.print("Enter next value: ");
      y2 = input.nextDouble();
      
      // Compute distance 
      distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
       
      // Display results      
      System.out.println("The distance between (x1, y1) and (x2, y2) is " + distance);
      // or like this: System.out.printf("Distance = %.2f", distance);
   }
}