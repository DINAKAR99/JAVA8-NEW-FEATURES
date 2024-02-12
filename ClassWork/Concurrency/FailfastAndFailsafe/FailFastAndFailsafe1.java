package Concurrency.FailfastAndFailsafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailsafe1 {

  private static void failFastIteratorDemo() {
    // Map<String, String> phoneMap = new HashMap<>();
    Map<String, String> phoneMap = new ConcurrentHashMap<>();
    phoneMap.put("Apple", "iPhone");
    phoneMap.put("HTC", "HTC One");
    phoneMap.put("Samsung", "S6");

    Set<String> keySet = phoneMap.keySet();

    Iterator<String> iterator = keySet.iterator();

    while (iterator.hasNext()) {
      String model = iterator.next();
      phoneMap.put("Sony", "Xperia Z");
      System.out.println("brand :" + model + " model  :" + phoneMap.get(model));
    }
  }

  public static void main(String[] args) {
    failFastIteratorDemo();
  }
}
