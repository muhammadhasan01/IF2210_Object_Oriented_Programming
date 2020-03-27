public class Utility {
  public static <T extends Number> double getMidpoint(T[] arr) {
    int len = arr.length;
    if (len % 2 == 1) {
      return arr[len / 2].doubleValue();
    } else {
      return ((arr[len / 2 - 1].doubleValue() + arr[len / 2].doubleValue()) / 2.0);
    }
  }

  public static <T> T getMidpoint(T[] arr) {
    return arr[arr.length / 2];
  }

  public static <T> T getLast(T[] arr) {
    return arr[arr.length - 1];
  }

  public static <T extends Number> double getAverage(T[] arr) {
    double len = arr.length;
    double retAverage = 0;
    for (int i = 0; i < arr.length; i++) {
      retAverage += arr[i].doubleValue();
    }
    return (retAverage / len);
  }
}