package classstuff;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyClass {
  private int x;
  private String y;
  public void doStuff(int x) {}
  public String getText() { return "Hello"; }

  public static void main(String[] args) {
    MyClass mc = new MyClass();
    Class<?> mcc = mc.getClass();
    System.out.println("class of MyClass is called " + mcc.getName());
    Field [] fields = mcc.getDeclaredFields();
    for (Field f : fields) {
      System.out.println("Found a field: " + f);
    }

    Method[] ma = mcc.getMethods();
    for (Method m : ma) {
      System.out.println("Found a method: " + m);
    }
  }
}
