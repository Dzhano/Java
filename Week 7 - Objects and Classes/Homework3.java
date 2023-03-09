// This is a Calculator program which performs basic arithmetic operations.
import java.util.Scanner; // This allows us to use the Scanner to enter different operations.

public class Homework3 { // Main class
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // allows us to write in Run I/O.
      Calculator calculator = new Calculator(); // an instance of the Calculator class
      System.out.println("Enter two numbers and an arithmetic operation (\"+\", \"-\", \"*\", \"/\", \"%\") in the format \"num1 (operator) num2\"."); // Asks the user to enter an operation in format "num1 operator num2".
      System.out.println("If you wish to stop the program, just enter \"0\" or empty line."); // Explanation of how the program can be terminated.
      String inputLine = input.nextLine(); // Entering the first arithmetic operation.
      while (inputLine.length() != 0 && inputLine.charAt(0) != ' ' && inputLine.charAt(0) != '0') { // Enteing the loop (again) until the inputline no longer meets the loop's condition.
         calculator.Process(inputLine); // Processing the current operation.
         System.out.println("The result from the operation is: " + calculator.GetResult() + "\n"); // Checking the result from the given command.
         inputLine = input.nextLine(); // Entering new arithmetic operation.
      }
   }
}

class Calculator { // Written class
   String result = ""; // The private data field which stores the value of the result. In the begging it is empty before any command.
   
   public void Process(String command) { // The public method which processes the give command.
      String[] input = command.split("\\s+"); // Splitting the coomand into three strings representing: num1, operator and num2
      double num1 = Double.parseDouble(input[0]); // Turning the first number into double.
      double num2 = Double.parseDouble(input[2]); // Turning the second number into double.
      switch (input[1]) { // Depending on the received operator, the value of the result changes.
         case "+":
            result = Double.toString(num1 + num2); // Summing the two numbers.
            break;
         case "-":
            result = Double.toString(num1 - num2); // Substracting the two numbers.
            break;
         case "*":
            result = Double.toString(num1 * num2); // Multiplying the two numbers.
            break;
         case "/":
            result = Double.toString(num1 / num2); // Dividing the two numbers.
            break;
         case "%":
            result = Double.toString(num1 % num2); // Module dividing the two numbers.
            break;
      }
   }
   
   public String GetResult() { // The public method from which we can retrieve the value of the result.
      return result;
   }
}