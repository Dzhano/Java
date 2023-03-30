import java.util.Scanner;
import java.util.ArrayList;

public class Exercise2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (int i = 0; i < 10; i++) {
         list.add(input.nextInt());
      }
      removeDuplicate(list);
   }
   
   public static void removeDuplicate(ArrayList<Integer> list) {
      ArrayList<Integer> temp = new ArrayList<Integer>();
      for (int i = 0; i < list.size(); i++) 
         if (!temp.contains(list.get(i))) 
            temp.add(list.get(i));
      
      list.clear();
      
      for (int i = 0; i < list.size(); i++) list.add(temp.get(i));
   }
}