public class Methods {   
   public static double saleCommision(int sales, double commisionRate) {
      return sales * commisionRate;
   }
   
   public static void calendar(int month, int year) {
      int days = 0;
      switch (month) {
         case 1: case 3: case 5: case 7: case 8: case 10: case 12:
             days = 31;
            break;
         case 4: case 6: case 9: case 11:
             days = 30;
            break;
         case 2:
             if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) days = 29;
             else days = 28;
            break;
      }
      System.out.println(days);
   }
   
   public static double squareRoot(double number)
   
   public static boolean even(double number)
   
   public static void displayMessage(int n)

   public static double monthlyPayment(double loan, int years, double annualInterestRate)
   
   public static char uppercaseLetter(char lowercaseLetter)
}