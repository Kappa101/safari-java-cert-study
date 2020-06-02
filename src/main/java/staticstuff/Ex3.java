package staticstuff;
/*final */class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

/*final */class Sub extends Base {
  @Override
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}

class Sub2 extends Sub implements Runnable {
  @Override
  public void run() {
    System.out.println("Running my runnable!");
  }
}

public class Ex3 {
  public static void main(String[] args) {
    Base b = null;
//    Base b = new Sub();
//    Base b = new Sub2();
    // Cast "trust me, compiler, I'm an engineer...
    if (b instanceof Sub) {
      ((Sub) b).doOtherStuff();
    } else {
      System.out.println("Not a Sub!");
    }

//    Base aBase = new StringBuilder();

    // ((StringBuilder)b).length();

    ((Runnable)b).run();
    Runnable r = null;

    b = (Base)r;
  }
}
