// This is a Calculator program which performs basic arithmetic operations.
import java.util.Scanner; // This allows us to use the Scanner to enter different operations.

public class Homework3 { // Main class
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // allows us to write in Run I/O.
      Calculator calculator = new Calculator(); // an instance of the Calculator class
      calculator.Process(input.nextLine()); // Entering an arithmetic operation.
      System.out.println("The result from the operation is: " + calculator.GetResult()); // Checking the result from the given command.
   }
}

class Calculator { // Written class
   String result = ""; // The private data field which stores the value of the result. In the begging it is empty before any command.
   
   public void Process(String command) { // The public method which processes the give command.
   /* https://press.rebus.community/programmingfundamentals/chapter/arithmetic-operators/
   Command    	     Common Symbol
   
   Addition	        +
   Subtraction	     -
   Multiplication	  *
   Division	        /
   Modulus          %
   */
      switch (command) {
         case "":
            
            break;
      }
   }
   
   public String GetResult() { // The public method from which we can retrieve the value of the result.
      return result;
   }
}