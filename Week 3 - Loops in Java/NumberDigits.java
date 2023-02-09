import java.util.Scanner;

public class NumberDigits {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      String number = input.nextLine();
      System.out.print("The number of digits in the number is: " + number.length());
   }
}