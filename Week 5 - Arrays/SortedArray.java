public class SortedArray {
   public static void main(String[] args) {
      int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8};
      System.out.println(isSorted(numbers1));
      
      int[] numbers2 = {1, 2, 3, 4, 3, 6, 7};
      System.out.println(isSorted(numbers2));
   }
   
   public static boolean isSorted(int[] array){
      if (array.length > 1) {
         for (int i = 0; i < array.length - 1; i++) 
            if (array[i] >= array[i + 1]) return false;
         return true;
      }
      return true;

   }
}