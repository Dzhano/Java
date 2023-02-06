import java.util.Scanner;

public class Multiplier {
   public static void main(String[] args) {
      System.out.print("Enter N (2 <= N <= 20): ");
      Scanner input = new Scanner(System.in);
      int i, number = input.nextInt();
      for (i = 1; i < 11; i++) {
         System.out.println(number + " x " + i + " = " + (number * i));
      }
   }
}