public class fib {
  public static int fib(int n) {
    int sum = 0;
    if (n<2) {
      return n;
    }
    else {
      sum += fib(n-1) + fib(n-2);
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(8 == fib(6));
    System.out.println(13 == fib(7));
  }
}
