public class RunnableDemo {

  public static void main(String[] args) {
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("my runnable");
      }
    };

    Thread t = new Thread(runnable);
    t.start();
  }
}
