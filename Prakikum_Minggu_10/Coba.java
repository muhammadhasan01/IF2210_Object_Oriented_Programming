public class ExceptionTest {

  public static void PrintArray(int[] arr, int len) {
    if (len > arr.length)
      throw new RuntimeException("Index out of bound");
    for (int i = 0; i < len; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String args[]) {
    int[] x = new int[2];
    PrintArray(x, 3);
  }
}