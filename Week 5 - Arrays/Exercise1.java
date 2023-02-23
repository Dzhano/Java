import java.util.Scanner;

public class Exercise1 {
   public static void main(String[] args) {
      double[] numbers = new double[10];
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < 10; i++) {
         numbers[i] = input.nextDouble();
         numbers[i] *= 2;
      }
      for (double number: numbers){
         System.out.print(number + " ");
      }
   }
}