// This is a program which calculates a hexagon's area by using a given side, decided by the user.
import java.util.Scanner; // This allows us to use the Scanner for assigning the hexagon side's value

public class HexagonArea {
   public static void main(String[] args) {
      double side, area; // Initializing the values for the hexagon's side and area.
            
      // Assign value of side    
      Scanner input = new Scanner(System.in);
      System.out.print("Enter hexagon side's value: "); // Asking the user to enter a number for the hexagon's side
      side = input.nextDouble(); // Reading the user's input
      
      // Calculating the area
      area = (3 * Math.pow(3, 0.5) * side * side) / 2;
      
      // Display results      
      System.out.println("The area of the hexagon is " + area);
   }
}