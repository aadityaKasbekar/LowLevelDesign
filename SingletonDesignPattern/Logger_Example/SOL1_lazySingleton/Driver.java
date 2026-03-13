package SingletonDesignPattern.Logger_Example.SOL1_lazySingleton;

public class Driver {

  public static void main(String[] args) {
    Logger logger1 = Logger.getInstance();
    Logger logger2 = Logger.getInstance();

    logger1.Log("This is the Log from logger instance 1.");
    logger2.Log("This is the Log from logger instance 2.");
  }
}
