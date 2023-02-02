import java.util.Scanner;

public class CourseGrade {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter student's course grade: ");
      double grade = input.nextDouble();
      
      if (grade > 100 || grade < 0) System.out.println("Error: Invalid grade input");
      else {
         if (grade >= 90) System.out.println("Grade: A (" + grade + ")");
         else if (grade >= 80) System.out.println("Grade: B (" + grade + ")");
         else if (grade >= 70) System.out.println("Grade: C (" + grade + ")");
         else if (grade >= 60) System.out.println("Grade: D (" + grade + ")");
         else System.out.println("Grade: F (" + grade + ")");
      }
   }
}