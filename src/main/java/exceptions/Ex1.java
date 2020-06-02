package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1 {
  //  public static void useFile(String name) {
//    try {
//      FileReader fr = new FileReader(name);
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    }
//  }
  public static void useFile(String name) throws FileNotFoundException {
    FileReader fr = new FileReader(name);
  }

  public static void divideByZero() {
    int x = 5;
    int y = 0;
    System.out.println("x / y is " + (x / y));
  }
  public static void main(String[] args) {
    try {
      useFile("Bad.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Bad broke");
    }

    int [] nums = {};
    System.out.println("nums zero is " + nums[0]);

    divideByZero();
  }
}
