public class LambdaDemo {

  public static void main(String[] args) {
    Runnable r = () -> System.out.println("hiii");
    Thread tt = new Thread(r);
    tt.start();
  }
}

 * 
 * 
