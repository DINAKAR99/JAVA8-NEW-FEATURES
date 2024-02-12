package threadLocal;

public class Threadlocall {

  public static void main(String[] args) {
    // ThreadLocal<String> threadLocal = new ThreadLocal<>();
    // threadLocal.set("This is local thread variable");
    // String value = threadLocal.get();
    // System.out.println(value);

    ThreadlocalDemo r = new ThreadlocalDemo();

    Thread thread1 = new Thread(r, "Thread1");
    Thread thread2 = new Thread(r, "Thread2");
    Thread thread3 = new Thread(r, "Thread3");

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
