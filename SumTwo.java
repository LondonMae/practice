import java.util.*;

class SumTwo {
  private int[] arr;
  private int n;

  public SumTwo(int[] a) {
    arr = a;
    n = a.length;
  }

  public void setArray(int[] a) {
    arr = a;
    n = a.length;
  }

  public int getLength() {
    return n;
  }

  public boolean sum(int c) {

    Set<Integer> foundValues = new HashSet<Integer>();
    for (int a : arr) {
      if (foundValues.contains(c - a)) {
        return true;
      }

      foundValues.add(a);
    }
    return false;

}
}
