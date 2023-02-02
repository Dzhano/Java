import java.util.Scanner;

public class LeapYear {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter year: ");
      double year = input.nextDouble();
      
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.printf("%.0f is a leap year.", year);
      else System.out.printf("%.0f is not a leap year.", year);
   }
}