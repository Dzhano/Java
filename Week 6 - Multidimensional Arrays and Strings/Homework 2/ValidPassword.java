// This is a program which checks whether the entered password is valid if it follows the rules.
import java.util.Scanner; // This allows us to use the Scanner for assigning the password's value.

public class ValidPassword {
   public static void main(String[] args) {
      // Assigning value of the password.
      Scanner input = new Scanner(System.in);
      String password = input.nextLine();
      
      boolean valid = true; // This value will show the password's validity.
      int digits = 0; // Keeps track of the number of digits in the password.
      
      if (password.length() < 8) valid = false; // If the password does not have at least 8 characters, it is not valid.
      else {                                   // If it is invalid, we do not even need to check the other rules after that and directly go to the end of the program.
         for (int i = 0; i < password.length(); i++) { // Going though each of the characters in the password.
            if (Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i))) { // Checks whether the current character is a letter or a digit.
               if (Character.isDigit(password.charAt(i))) digits++; // If the current character is a digit, we increase the digit counter by 1.
            }
            else {
               // If the character is not a letter or a digit, then we can immediately just set it as invalid and break the for-loop iteration.
               valid = false;
               break;
            }
         }
      }
      if (digits < 2) valid = false; // If the password does not have at least 2 digits, it is not valid.
      
      // Printing the output depending on the results.
      if (valid) System.out.print("Valid Password"); // If the password is valid.
      else System.out.print("Invalid Password"); // If the password is not valid.
   }
}