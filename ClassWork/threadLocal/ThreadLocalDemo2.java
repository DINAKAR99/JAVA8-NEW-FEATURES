package threadLocal;

public class ThreadLocalDemo2 {

  public static void main(String[] args) {
    ThreadLocal2 demo = new ThreadLocal2();
    Thread thread1 = new Thread(demo, "Thread-1");
    Thread thread2 = new Thread(demo, "Thread-2");

    thread1.start();
    thread2.start();
  }
}
