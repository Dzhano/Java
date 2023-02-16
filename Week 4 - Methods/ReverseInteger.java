import java.util.Scanner;

public class ReverseInteger {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      reverse(input.nextInt());
   }
   
   public static void reverse(int number) {
      // My version
      for (int i = number; i > 0; i /= 10) {
         System.out.print(i % 10);
      }
      
      /*// while-loop version (Professor's one)
      int remainder;
      while (number > 0) {
         remainder = number % 10;
         System.out.print(remainder);
         number /= 10;
      }*/
   }
}