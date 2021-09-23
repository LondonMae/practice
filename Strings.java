import java.util.*;

public class Strings {
  public static void main (String[] args) {
    Set<String> strings = new HashSet<String>();
    strings.add("apple");
    strings.add("pie");
    String s = "applepie";
    System.out.println(segments(strings, s));
    ArrayList<String> pals = palindromes("helloolleh");
    for (int i = 0; i < pals.size(); i++) {
      System.out.println(pals.get(i));
    }
  }

  public static boolean segments(Set<String> strings, String s) {
    String currString = "";
    for (char c : s.toCharArray()) {
      if (strings.contains(currString)) {
        currString = "";
      }
      currString += c;
    }
    if (strings.contains(currString)) {
      return true;
    }
    return false;
  }

  public static ArrayList<String> palindromes (String s) {
    palHelper(s);
  }

  public static boolean palHelper (String s) {
    for (int i = 1; i<=s.length();i++) {

    }
  }

}
