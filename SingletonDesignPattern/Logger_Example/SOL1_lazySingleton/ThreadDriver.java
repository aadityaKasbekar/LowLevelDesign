package SingletonDesignPattern.Logger_Example.SOL1_lazySingleton;

public class ThreadDriver {

  public static void main(String[] args) {

    Thread thread1 = new Thread(() -> {
      Logger logger1 = Logger.getInstance();
      logger1.Log("This is the Log from logger instance 1.");
    });

    Thread thread2 = new Thread(() -> {
      Logger logger2 = Logger.getInstance();
      logger2.Log("This is the Log from logger instance 2.");
    });

    thread1.start();
    thread2.start();
  }
}
