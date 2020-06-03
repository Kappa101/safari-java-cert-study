package reflection;

public class Secret {
  private static String secretMessage = "I am a secret";
  public static void showMessage() {
    System.out.println(secretMessage);
  }
}
