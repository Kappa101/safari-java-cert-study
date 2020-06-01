package usingvar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
//  var s = "Hello"; // NO NO NO. ONLY LOCAL VARIABLES

  public static void doStuff(/*var*/String s) { // NO VAR HERE (what type??)
    System.out.println("Stuffing with " + s);
  }
  public static void main(String[] args) {
//    String s = "Hello";
    /*final */var s = "Hello";
//    s = 99; // NO Java is STILL STRONGLY, STATICALLY, TYPED

    List<String> l = new ArrayList<String>();
//    var l = new ArrayList<String>();
//    var l = new ArrayList<>();

//    var cs = "Hello";
//    cs = new StringBuilder(cs);

//    var t; // var MUST be immediately initialized,
//    in the declaration statement
//    t = "Goodbye";

//    List<String> names = Arrays.asList("Fred", "Jim", "Shiela");
    List<String> names = List.of("Fred", "Jim", "Shiela");
    for (var name : names) {
      System.out.println("Name is " + name);
    }

    doStuff("Tree");
  }
}
