package SingletonDesignPattern.Counter_Example;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

  private static final AtomicInteger count = new AtomicInteger(0);
  private static int numCounterInt = 0;
  private static volatile Counter counterInstance = null;

  private Counter() {
    numCounterInt++;
    System.out.printf("Counter Instance Created.\nNumber of Counter Instances Active: %d\n", numCounterInt);
  }

  public static Counter getInstance() {

    if (counterInstance == null) {
      synchronized (Counter.class) {
        if (counterInstance == null) {
          counterInstance = new Counter();
        }
      }
    }

    return counterInstance;
  }

  public void increament() {
    count.incrementAndGet();
  }

  public int getCount() {
    return count.get();
  }
}
