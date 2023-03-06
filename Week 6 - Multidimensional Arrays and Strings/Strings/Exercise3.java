import java.util.Scanner;

public class Exercise3 {
   public static void main(String[] args) {
      validateNumber();
   }
   
   public static void validateNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in the format DD-DDD-DDDDD");
        String s = input.nextLine();
        if (s.matches("\\d{2}-\\d{3}-\\d{5}")) {
            System.out.println("Valid Roll Number");
        }
        else {
            System.out.println("Invalid Roll Number");
        }
   }
}