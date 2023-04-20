import java.util.Scanner;

public class Exercise1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1 = 0, num2 = 0;
      System.out.println("Enter the values of the two integers.");
      while (true) {
         try {
            System.out.print("Number 1: ");
            num1 = input.nextInt();
            System.out.print("Number 2: ");
            num2 = input.nextInt();
            break;
         }
         catch (Exception exception) {
            System.out.println("Please enter the values in correct format.");
            input.nextLine();
         }
      }
      input.close();
      System.out.println("Sum is " + (num1 + num2));
   }
}