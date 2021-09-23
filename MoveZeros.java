class MoveZeros {
  private int[] arr;
  private int n;

  public MoveZeros(int[] a) {
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

  public int[] move() {
    int writeIndex = n-1;
    int readIndex = n-1;
    if (n <= 1) {
      return arr;
    }
    while (readIndex >= 0) {
      if (arr[readIndex] != 0) {
        arr[writeIndex] = arr[readIndex];
        writeIndex--;
      }
      readIndex--;
    }

    while (writeIndex >= 0) {
      arr[writeIndex] = 0;
      writeIndex--;
    }

    return arr;
  }



}
