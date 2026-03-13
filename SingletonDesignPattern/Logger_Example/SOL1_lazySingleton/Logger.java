package SingletonDesignPattern.Logger_Example.SOL1_lazySingleton;

public class Logger {
  private static Logger loggerInstance;
  private static int numInstances = 0;

  private Logger() {
    numInstances++;
    System.out.printf("Logger Instance Initialized.\nNumber of Logger Instances Active: %d\n", numInstances);
  }

  public static Logger getInstance() {
    if (loggerInstance == null) {
      loggerInstance = new Logger();
    }
    return loggerInstance;
  }

  public void Log(String message) {
    System.out.printf("%s\n", message);
  }
}
