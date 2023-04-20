import java.util.*;
import java.io.*;

public class Exercise5 {
   public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter the name of the file you want to check: "); // Asks the user to enter the file's name.
      String fileName = input.nextLine(); // Entering the file's name.
      input.close();
      int[] letterCount = new int[26];
      try {
         Scanner inputFile = new Scanner(new File(fileName));
         while (inputFile.hasNext()) {
            String s = inputFile.nextLine();
            for (int i = 0; i < s.length(); i++) {
               if (Character.isLetter(s.charAt(i)))
                  letterCount[Character.toUpperCase(s.charAt(i)) - 'A']++;
            }
         }
         inputFile.close();
      }
      catch (Exception ex) {}
      for (int i = 0; i < 26; i++) {
         System.out.println("The occurrence of " + ((char)(i + 'A')) + "'s is " + letterCount[i]);
      }
   }
}