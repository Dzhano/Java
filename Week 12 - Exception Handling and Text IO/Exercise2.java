import java.util.Scanner;

public class Exercise2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] numbers = new int[100];
      for (int i = 0; i < 100; i++) numbers[i] = (int)(Math.random() * 100);
      System.out.print("Enter index: ");
      int index = input.nextInt();
      try {
         System.out.println("Number at index " + index + " is " + numbers[index]);
      }
      catch (ArrayIndexOutOfBoundsException exception) {
         System.out.println("Out of Bounds");
         input.nextLine();
      }
      input.close();
   }
}