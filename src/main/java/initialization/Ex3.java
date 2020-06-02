package initialization;
class Base2 {
  private Base2() { /* implicit super() */ }
  class Sub2 extends Base2 {
    Sub2() {
      super();
    }
  }
  public static Base2 getOne() {
    return new Base2();
  }
}


public class Ex3 {
  public static void main(String[] args) {
//    new Base2();
    Class<?> bClass = Base2.class;
  }
}
