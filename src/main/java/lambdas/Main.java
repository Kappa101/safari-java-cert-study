package lambdas;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface Criterion<E> {
  /*public abstract*/boolean test(E s);
//  boolean bad(E s);
  /*public (can be private)*/ static void doStuff() {}
  /* public */ default void doOtherStuff() {}
}
//class SmartStudent implements Criterion<Student> {
class SmartStudent implements Predicate<Student> {
  @Override
  public boolean test(Student s) {
    return s.getGrade() > 60;
  }
}

//class FirstHalfStudent implements Criterion<Student> {
class FirstHalfStudent implements Predicate<Student> {
  @Override
  public boolean test(Student s) {
    return s.getName().charAt(0) <= 'M';
  }
}

public class Main {
  public static <E> List<E> filter(List<E> ls, Predicate<E> f) {
//  public static <E> List<E> filter(List<E> ls, Criterion<E> f) {
    List<E> out = new ArrayList<>();
    for (E s : ls) {
      if (f.test(s)) {
        out.add(s);
      }
    }
    return out;
  }

  public static void show(List<?> ls) {
    for (Object s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-----------------------");
  }
  public static void main(String[] args) {
    List<Student> ls = List.of(
        new Student("Fred", 69),
        new Student("Jim", 52),
        new Student("Sheila", 98)
    );

    show(ls);
    show(filter(ls, new SmartStudent()));
    show(filter(ls, new FirstHalfStudent()));
    // "E" must match at the caller
//    show(filter(List.of("Fred"), new FirstHalfStudent()));

    show(filter(ls, (Student s) -> { return s.getGrade() < 70; }));
    // what do we know about ???
    // 1) it MUST BE a Criterion ... MUST BE AN INTERFACE
    // 2) specifically an INSTANCE
    // 3) It MUST BE Criterion<STUDENT>
    // What do we really need to make this?
    // observation: Criterion interface
    // defines EXACTLY ONE abstract method
    // AND we are ONLY INTERESTED  in implementing
    // THAT method...
    /*
    class Something implements Criterion<Student> {
      public boolean test(Student s) { return s.getGrade() < 70; }
    }
    new Something()
     */
//    Criterion<String> testObject =
    Predicate<String> testObject =
        (String s) -> { return s.length() > 3; };
//    Object obj = (String s) -> { return s.length() > 3; };
    show(filter(
        List.of("Fred", "Jim", "Sheila"), testObject));

    System.out.println("Class of my lambda is "
        + testObject.getClass().getName());
    Method[] ma = testObject.getClass().getMethods();
    for (Method m :  ma) {
      System.out.println("method: " + m);
    }

//    Criterion<Student> cs = (Student s) -> { return s.getGrade() > 55; };
      // IFF argument types are unambiguous, can leave out types (ALL OR NOTHING)
//    Criterion<Student> cs = (s) -> { return s.getGrade() > 55; };
    // IFF have a SINGLE argument, and do NOT specify type, can leave off parens
//    Criterion<Student> cs = s -> { return s.getGrade() > 55; };

    // SEPARATE DISCUSSION (from argument list...)
//    Criterion<Student> cs = s -> { return s.getGrade() > 55; };
    // For lambdas with method body simply return <expr> ;
    // replace method body with <expr>
    Criterion<Student> cs = s -> s.getGrade() > 55 ;

    show(filter(ls, s -> s.getGrade() > 55));

    // lambdas with zero or multiple arguments
    // existing functional interfaces (43)
  }
}
