import java.util.*;

class Node {
  int data;
  Node left;
  Node right;
  public Node(int d) {
    data = d;
    left = null;
    right = null;
  }
}

class BinaryTree {
  Node root;
  public BinaryTree() {root = null;}
}

public class Serialize {

  public static String serialize(Node root) {
    if (root == null) {
      return "";
    }
    String s = "";
    s += serialize(root.left);
    s += root.data;
    s += serialize(root.right);
    return s;
  }

  public static Node deserialize(String d) {
    int[] vals = new int[d.length()];
    String[] str = d.split("");
    for (int i = 0; i < str.length; i++) {
      vals[i] = Integer.valueOf(str[i]);
      System.out.println(vals[i]);
    }
    return deserialize(vals, 0, null);
  }

  private static Node deserialize(int[] a, int i, Node root) {
    // Base case for recursion
       if (i < a.length) {
           Node temp = new Node(a[i]);
           root = temp;

           // insert left child
           root.left = deserialize(a, 2 * i + 1,
                                      root.left );

           // insert right child
           root.right = deserialize(a, 2 * i + 2,
                                        root.right );
       }
       return root;
  }

  public static void main (String[] args) {
    BinaryTree tree = new BinaryTree();
    Node root = new Node(1);
    root.left = new Node(2);
    root.left.left = new Node(3);
    root.right = new Node(4);
    root.right.right = new Node(5);
    String s = serialize(root);
    System.out.println(s);
    root = deserialize(s);
    s = serialize(root);
    // System.out.println(serialize(deserialize(s)));
    System.out.println(s);
    System.out.println("SERIALIZE MY DATA");
  }
}
