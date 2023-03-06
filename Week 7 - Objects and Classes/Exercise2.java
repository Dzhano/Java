import java.util.Random;

public class Exercise2 {
   public static void main(String[] args) {
      RandomWeekDay randomDay = new RandomWeekDay();
      System.out.println(randomDay.GetDayOfWeek());
   }
}

class RandomWeekDay {
   static String GetDayOfWeek() {
      Random random = new Random();
      switch (random.nextInt(7)) {
         case 0:
            return "Monday";
         case 1:
            return "Tuesday";
         case 2:
            return "Wednesday";
         case 3:
            return "Thursday";
         case 4:
            return "Friday";
         case 5:
            return "Saturday";
         case 6:
            return "Sunday";
         default:
            return "";
      }
   }
}