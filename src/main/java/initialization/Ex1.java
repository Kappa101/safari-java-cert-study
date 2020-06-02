package initialization;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
  private static int fieldX;
  private String name;

  public static void main(String[] args) {
    int x; // Local variable do NOT have "default initialization"
    int y = 99;
//    if (y > 50) x = 10;
//    else x = 100;

//    try (FileReader fr = new FileReader("x");) {
//      x = 10;
//    } catch (IOException fnfe) {}
    if (true) x = 10;
    System.out.println("x is " + x);
    System.out.println("fieldX is " + Ex1.fieldX);
  }
}
