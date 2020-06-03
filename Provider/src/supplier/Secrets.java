package supplier;

public class Secrets {
  public static String secretMessage = "This is a message";
  private static String hidden = "A secret!";
  public static void showHidden() {
    System.out.println("hidden message is " + hidden);
  }
}
