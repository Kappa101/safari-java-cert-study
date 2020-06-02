package liskov;

class Q23Base {
  public Q23Base get() { return null; }
  public int getInt() { return 1; }
}
class Q23Sub extends Q23Base {
//    public Q23Base get() { return null; }
//    public Q23Sub get() { return null; }
//    public Runnable get() { return null; }
//    public long getInt() { return 1; }
//    public short getInt2() { return (short)1; }
//    public short getInt2() { int x = 1; return (short)x; }
//    public Integer getInt() { return Integer.valueOf(1); }
}
public class Ex4 {
}
