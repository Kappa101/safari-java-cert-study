package client;

import supplier.Secrets;

import java.lang.reflect.Field;

public class UseSecrets {
  public static void main(String[] args) throws Throwable {
    System.out.println(Secrets.secretMessage);
    Secrets.showHidden();
    Class<?> theClass = Secrets.class;
    Field field = theClass.getDeclaredField("hidden");
    field.setAccessible(true);
    field.set(null, "Haha, I hacked you");
    Secrets.showHidden();
  }
}
