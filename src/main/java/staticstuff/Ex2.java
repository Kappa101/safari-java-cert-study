package staticstuff;

class Y {
  private int x;
  static String sayHi() { return "Y-Hello"; }
  String sayHi2() { return "Y-Hello2"; }
}

class Z extends Y {
  // x exists in every Z, but is not accessible, and it's not called "inherited"
  static String sayHi() { return "Z-Hello"; }
  @Override // Compiler, please tell me if this is NOT actaully an override
  String sayHi2() { return "Z-Hello2"; }
//  String sayHi2(int x) { return "Z-Hello2"; }
}

public class Ex2 {
  public static void main(String[] args) {
    Y y = new Z();
    System.out.println(y.sayHi() + ", " + y.sayHi2());
  }
}
