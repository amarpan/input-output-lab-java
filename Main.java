import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws FileNotFoundException
  {
    File file = new File("records.txt");


       Scanner input = new Scanner(file);

       input.useDelimiter("[;]");
       while(input.hasNext())

       {
          String current = input.next();
          System.out.println(current);
       }

  }
}