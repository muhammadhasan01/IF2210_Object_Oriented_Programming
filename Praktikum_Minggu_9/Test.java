import java.util.List;
import java.time.Instant;

public class Test {
  private List<Integer> l;
  private int n;

  public Test(List<Integer> l, int n) {
    this.l = l;
    this.n = n;
  }

  public void reset() {
    l.clear();
    for (int i = 0; i < n; i++) {
      l.add(0);
    }
  }

  public long get(int idx) {
    reset();
    long start = Util.getTime();
    l.get(idx);
    long finish = Util.getTime();
    return finish - start;
  }

  public long del(int idx, int t) {
    reset();
    long start = Util.getTime();
    for (int i = 0; i < t; i++) {
      l.remove(idx);
    }
    long finish = Util.getTime();
    return finish - start;
  }
}