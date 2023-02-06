import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
      int factorial = 1;
      System.out.print("Enter positive integer: ");
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      for (int i = 1; i <= number; i++) factorial *= i;
      System.out.print("The factorial of the integer is " + factorial);
   }
}