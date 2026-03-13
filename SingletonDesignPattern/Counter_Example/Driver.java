package SingletonDesignPattern.Counter_Example;

public class Driver {
  public static void main(String[] args) {

    Thread thread1 = new Thread(() -> {
      Counter counter1 = Counter.getInstance();
      for (int i = 0; i < 5; i++) {
        counter1.increament();
      }
      System.out.printf("Count value using counter1: %d\n", counter1.getCount());
    });

    Thread thread2 = new Thread(() -> {
      Counter counter2 = Counter.getInstance();
      for (int i = 0; i < 10; i++) {
        counter2.increament();
      }
      System.out.printf("Count value using counter2: %d\n", counter2.getCount());
    });

    thread1.start();
    thread2.start();
  }
}
