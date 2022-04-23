package LabAss1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

      System.out.println ("please enter positive number between 1 and 100 ");
      Scanner input = new Scanner(System.in);
      int w ;
      w=input.nextInt();
      if (w>2 && w%2 ==0) {
          System.out.println("Yes it is correct division");
      }
          else
          {
              System.out.println("NO it is not correct division");
      }

    }
}
