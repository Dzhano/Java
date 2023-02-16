public class PentagonalNumber {
   public static void main(String[] args) {
      for (int i = 1; i <= 100; i++) {
         System.out.printf("%7d ", getPentagonalNumber(i));
      }
   }
   
   public static int getPentagonalNumber(int n) {
      return (n * (3 * n - 1)) / 2;
   }
}