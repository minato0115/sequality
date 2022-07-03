package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int sum, int n) {
    return sum / n;
  }

  public void odd_eve(int a, int b,int add,int eve) {
    for (int i = a; i <= b; i++) {
      if (i % 2 == 0) {
        add = add + i;
      } else {
        eve = eve + i;
      }
    }
  }
}
