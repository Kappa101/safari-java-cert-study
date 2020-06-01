package staticstuff;
class X {
  static int MAX_VAL = 100;
  static String name;
  int value = 99;
  public void setVal(int x) {
    if (x <= MAX_VAL) value = x;
  }
}
public class Ex1 {
  public static void main(String[] args) {
    X a = new X();
//    X b = new X();
    X b = null;
    a.setVal(120);
    System.out.print(a.value + ", ");
    b.MAX_VAL = 150; // EXACTLY EQUIVALENT TO X.MAX_VAL
    a.setVal(140);
    System.out.println(a.value);

    System.out.println(a.getClass().getName());

    // generate NPE using static field
//    System.out.println("Length of name in X is " + X.name.length());
  }
}
