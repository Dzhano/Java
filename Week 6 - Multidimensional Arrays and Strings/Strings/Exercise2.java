import java.util.Scanner;

public class Exercise2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println(countLetters(input.nextLine()));
   }
   
   public static int countLetters(String s) {
      int letters = 0;
      for (int i = 0; i < s.length(); i++)
         if (Character.isLetter(s.charAt(i)))
            letters++;
      
      return letters;
   }
}