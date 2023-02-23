public class DuplicateValuesRemover {
   public static void main(String[] args) {
      int[] array = {1, 45, 63, 22, 1, 34, 54, 45};
      int[] newArray = remDup(array);
      for (int number: newArray){
         System.out.print(number + " ");
      }
   }
   
   public static int[] remDup(int[] array) {
      int[] distinctList = new int[array.length];
      int i = 0;
      for (int e: array) {
         if (linearSearch(distinctList, e) == -1) {
            distinctList[i] = e;
            i++;
         }
      }
      return distinctList;
   }
   
   public static int linearSearch(int[] list, int key) {
      for (int i = 0; i < list.length; i++)
         if (key == list[i]) return i;
      return -1;
   }
}