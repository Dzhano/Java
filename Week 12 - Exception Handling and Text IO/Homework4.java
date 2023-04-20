// This is a program taking a statistic about the number of lines, words and characters in a text file.s
import java.util.Scanner; // This allows us to use the Scanner to enter the name of the desired file.

public class Homework4 {
   public static void main(String[] args) throws Exception { // Declaring an exception in the main method.
      int lines = 0, words = 0, characters = 0; // Variables keeping the count of the lines, words and characters.
      
      System.out.print("Please enter the name of the file you want to check: "); // Asks the user to enter the file's name.
      Scanner input = new Scanner(System.in); // Allows us to write in Run I/O.
      String fileName = input.nextLine(); // Entering the file's name.
      input.close(); // Closing the reading for the file's name.
      
      try { // Declaring try-catch block so that we can avoid "error: unreported exception FileNotFoundException; must be caught or declared to be thrown"
         Scanner inputFile = new Scanner(new java.io.File(fileName)); // A new scanner which will read from the file.
         while (inputFile.hasNext()) { // Cycling through each line of the file
            String[] wordsArr = inputFile.nextLine().split("\\s+"); // Splitting the words in the line into an String array.
            for (int i = 0; i < wordsArr.length; i++) { // Cycling through all words in the line.
               words++; // Adding the word to the number of words.
               characters += wordsArr[i].length(); // Adding the number of characters in the word to the total number of characters in the text.
            }
            lines++; // Adding the line to the count of lines.
         }
         
         inputFile.close(); // Closing the reading of the file.
      }
      catch (Exception ex) {} // Adding an empty catch block since we don't need to throw any specific exception.
      
      // Output
      System.out.println("Number of lines in " + fileName + ": " + lines);
      System.out.println("Number of words in " + fileName + ": " + words);
      System.out.println("Number of characters in " + fileName + ": " + characters);
   }
}