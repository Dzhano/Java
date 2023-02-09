import java.util.Scanner;

public class WindSpeedCategory {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the wind speed (in mph): ");
      int windSpeed = input.nextInt();
      
      if (windSpeed >= 155) System.out.println("Category 5");
      else if (windSpeed >= 131) System.out.println("Category 4");
      else if (windSpeed >= 111) System.out.println("Category 3");
      else if (windSpeed >= 96) System.out.println("Category 2");
      else if (windSpeed >= 74) System.out.println("Category 1");
   }
}