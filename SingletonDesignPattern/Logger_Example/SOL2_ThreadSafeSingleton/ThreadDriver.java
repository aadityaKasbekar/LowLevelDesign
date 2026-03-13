package SingletonDesignPattern.Logger_Example.SOL2_ThreadSafeSingleton;

public class ThreadDriver {

  public static void main(String[] args) {

    Thread thread1 = new Thread(() -> {
      Logger logger1 = Logger.getInstance();
      logger1.Logs("This is log message 1 from thread 1, logger1.");
    });

    Thread thread2 = new Thread(() -> {
      Logger logger2 = Logger.getInstance();
      logger2.Logs("This is log message 1 from thread 2, logger2.");
    });

    thread1.start();
    thread2.start();
  }
}
