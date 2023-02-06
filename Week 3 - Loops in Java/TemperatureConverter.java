import java.util.Scanner;

public class TemperatureConverter {
   public static void main(String[] args) {
      for (int c = 20; c <= 60; c += 5) {
         System.out.println("Temperature in Celsius: " + c);
         System.out.println("Temperature in Fahrenheit: " + ((c * 1.8) + 32) + "\n");
      }
   }
}