package liskov;

class Base2 {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub2 extends Base2 {
  // inherits void doBaseStuff() ...
  void doBaseStuff(int x) {
    System.out.println("doSubStuff");
  }
}

public class Ex2 {
}
