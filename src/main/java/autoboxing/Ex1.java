package autoboxing;

public class Ex1 {
  public static void main(String[] args) {
    Integer i = 3; // Autoboxing
    Integer i1 = Integer.valueOf(3);
    int j = i; // autounboxing
    int j1 = i.intValue();
  }
}
