package staticstuff;
class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

class Sub extends Base {
  @Override
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}

public class Ex3 {
  public static void main(String[] args) {
    Base b = new Sub();
    // Cast "trust me, compiler, I'm an engineer...
    if (b instanceof Sub) {
      ((Sub) b).doOtherStuff();
    } else {
      System.out.println("Not a Sub!");
    }

//    Base aBase = new StringBuilder();

    // ((StringBuilder)b).length();
    
  }
}
