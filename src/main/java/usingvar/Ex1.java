package usingvar;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
//  var s = "Hello"; // NO NO NO. ONLY LOCAL VARIABLES

  public static void useMany(Object [] ia) {}

  public static void useMany(int [] ia) {}

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
    var ss = "Tree";
    doStuff(ss);

    var var = "Hello";

//    int ia [];
//    var [] ia = new int[10]; // var cannot be used as array's "base type"
    var ia = new int[10];
//    var ia2 = {};  // Right side--the arrary, has INFERRED base type.
//    var ia2 = { // cannot use "inference" on right side, even here
//        3,
//        2,
//        1,
//    };
    var ia2 = new int[]{
        3,
        2,
        1,
    };
//    int [] ia = new int[10];

//    useMany({1, 2, 3, 4});
    useMany(new int[]{1, 2, 3, 4});
    String [] oa = new String[]{"Fred", "Jim"};
    useMany(oa);

    // NO using var for exception parameters
//    try {
//      if (Math.random() > 0.5) throw new SQLException();
//    } catch (var sqle) {
//
//    } catch (var sqle) {
//    }
  }
}
