import java.util.Scanner;

public class URLWordCount {
  public static void main(String[] args) {
    String URLString = "https://edition.cnn.com/world"; // Sample URL. Btw, the number of words can change depending on the ads.
       
    try {
      java.net.URL url = new java.net.URL(URLString); 
      int count = 0;
      try (Scanner input = new Scanner(url.openStream())) {
        while (input.hasNext()) {
          String word = input.next();
          if (word.trim().length() > 0)
            count += 1;
        } 
      }
      System.out.println("The number of words is " + count);
    }
    catch (java.net.MalformedURLException ex) {
      System.out.println("Invalid URL");
    }
    catch (java.io.IOException ex) {
      System.out.println("IO Errors: no such file");
    }
  }
}   
