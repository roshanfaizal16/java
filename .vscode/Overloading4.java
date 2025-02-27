
public class Overloading4 {
  public static void main(String[] args) {
    calculate(10);
    calculate(3, 10);
  }

  static void calculate(int n) {
    int value = n;
    for (int i = n - 1; i >= 1; i--) {
      value = value * i;
    }
    System.out.println("Factorial is:" + value);
  }

  static void calculate(int i, int n) {
    int a = i;
    int b = i + 1;
    for (int j = i; j < n; j++) {
      System.out.println(a + " ");
      int c = a + b;
      a = b;
      b = c;

    }
  }
}
