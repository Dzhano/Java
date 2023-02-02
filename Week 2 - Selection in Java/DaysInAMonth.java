import java.util.Scanner;

public class DaysInAMonth {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter month's number: ");
      int month = input.nextInt();
      int days = 0;
      
      System.out.print("This month has ");
      switch (month) {
         case 1: case 3: case 5: case 7: case 8: case 10: case 12:
             days = 31;
            break;
         case 4: case 6: case 9: case 11:
             days = 30;
            break;
         case 2:
             System.out.print("Enter the year: ");
             double year = input.nextDouble();
             if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) days = 29;
             else days = 28;
            break;
      }
      
      System.out.printf("Number of days in Month %d: %d", month, days);
   }
}