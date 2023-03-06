public class Exercise3 {
   public static void main(String[] args) {
      Stock stock = new Stock('$', "Chocolate money", 5, 4);
      System.out.print("The change of the price of the stock is " + stock.getChangePercent() + "%");
   }
}

class Stock {
   char symbol;
   String name;
   double previousPrice;
   double currentPrice;
   
   Stock(char s, String n, double prPrice, double price) {
      symbol = s;
      name = n;
      previousPrice = prPrice;
      currentPrice = price;
   }
   
   public double getChangePercent() {
      double percent = (currentPrice * 100) / previousPrice;
      
      if (percent < 100) percent = 0 - (100 - percent);
      else percent = percent - 100;
      
      return percent;
   }
}