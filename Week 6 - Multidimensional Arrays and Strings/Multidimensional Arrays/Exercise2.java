public class Exercise2 {   
   public static double[][] sub(double[][] a, double[][] b) {
      double[][] result = new double[a.length][a[0].length];
      
      for (int row = 0; row < a.length; row++)
         for (int col = 0; col < a[row].length; col++) 
            result[row][col] = a[row][col] - b[row][col];
         
      return result;
   }
}