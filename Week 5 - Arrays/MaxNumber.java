public class MaxNumber {
   public static void main(String[] args) {
      double[] numbers = {12, 32.2, 1.006, 16, 76.4, 23};
      System.out.print(max(numbers));
   }
   
   public static double max(double[] array){
      int length = array.length;
      if (length > 1) {
         double max = array[0];
         for (int i = 1; i < length; i++) {
            if (max < array[i]) max = array[i];
         }
         return max;
      }
      return 0;
   }
}