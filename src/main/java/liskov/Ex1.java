package liskov;
class Base {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub extends Base {
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }
  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}
public class Ex1 {
}
