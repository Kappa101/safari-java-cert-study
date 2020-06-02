package liskov;
class X {
  public int getValue() {return 1;}
}

class Y extends X {
//  public int getValue(int x) {return 1;}
//  public String getValue() {return "Hello";}
//  public String getValue(int x) {return "Hello";}
//  public int getValue() { return 3; }
  float getValue(int x) { return 3.14F; }
}

public class Ex3 {
}
