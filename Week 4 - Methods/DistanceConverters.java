public class DistanceConverters {
   public static void main(String[] args) {
      System.out.printf("%.3f \n", mileToKilometer(1));
      System.out.printf("%.3f", kilometerToMile(20));
   }
   
   // 1 mile = 1.6 kilometers
   
   public static double mileToKilometer(double mile) {
      return mile * 1.6;
   }
   
   public static double kilometerToMile(double kilometer) {
      return kilometer / 1.6;
   }
}