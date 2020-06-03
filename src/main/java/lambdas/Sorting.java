package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.ToIntBiFunction;

public class Sorting {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(List.of(
        "Fred", "Jim", "Alison", "William", "Sheila", "Arnold", "Bill"
    ));

//    names.sort((String s1, String s2) -> s2.compareTo(s1));
//    names.sort((@Deprecated var s1, var s2) -> s2.compareTo(s1));
    names.sort((s1, s2) -> s2.compareTo(s1));
    Consumer<String> printer = s -> System.out.println("> " + s);
    names.forEach(printer);

    ToIntBiFunction<String, String> c = (s1, s2) -> s2.compareTo(s1);
    BiFunction<String, String, Integer> c1 = (s1, s2) -> s2.compareTo(s1);
    Comparator<String> c2 = (s1, s2) -> s2.compareTo(s1);
  }
}
