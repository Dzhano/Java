import java.util.Scanner;

public class FloydTriangle  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int number = 1;
      for (int i = 1; i <= n; i++){
         for (int y = 1; y <= i; y++) System.out.print(number++ + " ");
         System.out.println();
      }
   }
}