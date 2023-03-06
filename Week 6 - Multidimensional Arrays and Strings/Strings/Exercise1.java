public class Exercise1 {
   public static void main(String[] args) {
      int[] digits = count("");
      
      for (int i = 0; i < digits.length; i++) {
         System.out.println(i + " = " + digits[i]);
      }
   }

   public static int[] count(String s) {
      int[] digits = new int[10];
      
      for (int i = 0; i < s.length(); i++) {
         if (Character.isDigit(s.charAt(i))) {
            //digits[s.charAt(x) - '0']++;
            switch (s.charAt(i)) {
               case '0':
                  digits[0]++;
                  break;
               case '1':
                  digits[1]++;
                  break;
               case '2':
                  digits[2]++;
                  break;
               case '3':
                  digits[3]++;
                  break;
               case '4':
                  digits[4]++;
                  break;
               case '5':
                  digits[5]++;
                  break;
               case '6':
                  digits[6]++;
                  break;
               case '7':
                  digits[7]++;
                  break;
               case '8':
                  digits[8]++;
                  break;
               case '9':
                  digits[9]++;
                  break;
            }
         }
      }
      
      return digits;
   }
}