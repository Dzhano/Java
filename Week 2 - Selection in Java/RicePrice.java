import java.util.Scanner;

public class RicePrice {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter weight and price for package 1: ");
      int weight1 = input.nextInt();
      double price1 = input.nextDouble();
      
      System.out.print("Enter weight and price for package 2: ");
      int weight2 = input.nextInt();
      double price2 = input.nextDouble();
      
      double calcWeightDif1 = 100.0 / weight1;
      double pricePerKilogram1 = price1 * calcWeightDif1;
      
      double calcWeightDif2 = 100.0 / weight2;
      double pricePerKilogram2 = price2 * calcWeightDif2;
      
      if (pricePerKilogram1 < pricePerKilogram2) System.out.print("Package 1 has a better price.");
      else if (pricePerKilogram1 > pricePerKilogram2) System.out.print("Package 2 has a better price.");
      else System.out.print("Both packages have the same price per kilogram.");
   }
}