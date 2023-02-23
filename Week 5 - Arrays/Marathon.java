import java.util.Scanner;

public class Marathon { 
   public static void main (String[] arguments) {  
      String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", 
                        "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };  
      int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 }; 
      for (int i = 0; i < names.length; i++) {
         System.out.println(names[i] + ": " + times[i]);
      }
      System.out.println("The fastest runner is " + names[fastest(names, times)]);
      System.out.println("The second fastest runner is " + names[secondFastest(names, times)]);
   }
   
   public static int fastest (String[] names, int[] times) {
      if (names.length > 1) {
         int fastestIndex = 0;
         for (int i = 1; i < names.length; i++) {
            if (times[fastestIndex] > times[i]) fastestIndex = i;
         }
         return fastestIndex;
      }
      return -1;
   }  
   
   public static int secondFastest (String[] names, int[] times) {
      if (names.length > 1) {
         int fast = fastest(names, times);
         int secondIndex = 0;
         
         for (int i = 1; i < names.length; i++) {
            if (times[secondIndex] > times[i]) {
               if (i != fast) secondIndex = i;
            }
         }
         return secondIndex;
      }
      return -1;
   }
}  