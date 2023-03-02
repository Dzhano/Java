public class Exercise1 {
   public static int sum(int[][][] a) {
      int total = 0;
      for (int i = 0; i < a.length; i++)
         for (int y = 0; y < a[i].length; y++)
            for (int z = 0; z < a[i][y].length; z++) {
               total += a[i][y][z];
            }
      return total;
   }
}