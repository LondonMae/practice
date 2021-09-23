import java.util.*;

public class ProblemFour {

  public static int findLowestMissing (int a[]) {
    int max = Collections.max(a);
    Set<Integer> set = new HashSet<Integer> ();
    int lowestmissing = max + 1;
    for (int i = a.indexOf(max)-1; i >= 0; i--) {
      set.add(a[i]);
      if (a[i] < lowestmissing && !set.contains(a[i] + 1)) {
        lowestmissing = a[i] + 1;
      }
    }
  }

  public static void main (String[] args) {
    System.out.println("PROBLEM FOUR");
  }
}
