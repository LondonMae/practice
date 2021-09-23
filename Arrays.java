class Arrays {

  public static void main (String[] args) {

    MoveZeros moveZeros = new MoveZeros(new int[]{1,2,3,0,5,0,7,0,0,0});
    int[] movedArr = moveZeros.move();
    for (int i = 0; i < movedArr.length; i++) {
      System.out.println(movedArr[i]);
    }

    SumTwo sumTwo = new SumTwo(new int[]{1, 2, 3, 5, 5, 6});
    System.out.println(sumTwo.sum(3));
  }

}
