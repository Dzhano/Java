public class Exercise3 {   
   public static int[] smallest(double[][] arr) {
      int[] position = {0, 0};
      double smallest = arr[0][0];
      
      for (int row = 0; row < arr.length; row++)
         for (int col = 0; col < arr[row].length; col++) {
            if (smallest > arr[row][col]) {
               smallest = arr[row][col];
               position[0] = row;
               position[1] = col;
            }
         }
      
      return position;
   }
}