import java.util.*;
import java.util.Arrays;
public class ProblemOne {

  // Given a list of numbers, return
  // whether any two sums to k. For example,
  // given [10, 15, 3, 7] and k of 17, return
  // true since 10 + 7 is 17.

  // O(n) time complexity

  public static boolean sumsTo(int[] a, int k) {
    Set <Integer> set = new HashSet <Integer>();
     for (Integer t:a){
         set.add(t);
     }
    for (int i = 0; i < a.length; i++) {
      set.remove(a[i]);
      if (set.contains(k-a[i])) {
        return true;
      }
    }
    return false;
  }

  public static void main (String[] args) {
    System.out.println("test");

    //test case
    System.out.println(sumsTo(new int[] {1, 2, 5, 4}, 4));
  }

}
