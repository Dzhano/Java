import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the last number which to be presented in the Fibonacci sequence: ");
      int n = input.nextInt();
      int current = 1;
      int first = 0, second = current;
      String output = "0, 1";
      while (current <= n) {
         first = second;
         second = current;
         output += ", " + current;
         current = first + second;
      }
      if (second != n) output += ", " + n;
      System.out.println(output);
   }
}