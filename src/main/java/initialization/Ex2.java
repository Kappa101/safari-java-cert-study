package initialization;

class Base {
  int x;
  Base(int x) { this.x = x; }
//  Base() {}
}

class Sub extends Base { // line n1
  int p = 99;
  Sub() {super(1);}
//  // implicitly contains\
//  Sub() {
//    super(); <-- has nowhere to go!!!
//  }
//  Sub(int x, int y) {
//    super(x + y);
//  }
}

public class Ex2 {
  public static void main(String[] args) {
    Base b = new Sub(); // line n2
    System.out.println(b.x);
  }
}
