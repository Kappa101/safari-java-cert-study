package reflection;

import java.lang.reflect.Field;

public class BreakSecret {
  public static void main(String[] args) throws Throwable {
    Secret.showMessage();
//    Secret.secretMessage = "Haha I hacked you";
    Field f = Secret.class.getDeclaredField("secretMessage");
//    System.setSecurityManager(new SecurityManager());
    f.setAccessible(true);
    f.set(null, "Haha I hacked you");
    Secret.showMessage();
  }
}
