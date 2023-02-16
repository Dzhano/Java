import java.util.Scanner;

public class SortNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();
      double num3 = input.nextDouble();
      
      displaySortedNumbers(num1, num2, num3);
   }
   
   public static void displaySortedNumbers(double num1, double num2, double num3) {
      double low, mid, high;
      
      if ((num1 > num2) && (num1 > num3)) high = num1;
      else if ((num2 > num1) && (num2 > num3)) high = num2;
      else high = num3;
      
      if ((num1 < num2) && (num1 < num3)) low = num1;
      else if ((num2 < num1) && (num2 < num3)) low = num2;
      else low = num3;
      
      if ((high == num1 && low == num3) || (high == num3 && low == num1)) mid = num2;
      else if ((high == num2 && low == num3) || (high == num3 && low == num2)) mid = num1;
      else mid = num3;
      
      System.out.print(high + " " + mid + " " + low);
   }
}