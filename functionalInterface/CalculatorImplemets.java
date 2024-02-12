interface hitler {
  // void shoot();
  // void shoot2(int a);
  int shoot3(int a, int b);
}

public class CalculatorImplemets {

  public static void main(String[] args) {
    // hitler h1 = () -> System.out.println("YES IM HITLER");
    // h1.shoot();

    // hitler h2 = i -> System.out.println("YES IM HITLER MY NO IS " + i);
    // h2.shoot2(1000);
    hitler h2 = (i, j) -> i + j;
    int sum = h2.shoot3(1000, 10);
    System.out.println(sum);
  }
}
