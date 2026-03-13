package SingletonDesignPattern.Logger_Example.SOL2_ThreadSafeSingleton;

public class Logger {

  private static Logger loggerInstance = null;
  private static int numInstances = 0;

  private Logger() {
    numInstances++;
    System.out.printf("Logger Instance Initialized.\nNumber of Instances Active: %d\n", numInstances);
  }

  /* 
    This Method Only lets one Instance creation of Logger class at all times. Even beyond multiple Threads.
    But this way of locking methods across threads leads to low performance because after first instance need to lock the instance creation for every thread.
  */
  // public static synchronized Logger getInstance() {
  //   if (loggerInstance == null) {
  //     loggerInstance = new Logger();
  //   }
  //   return loggerInstance;
  // }

  /*
    This does same as above method.
    This Method Only lets one Instance creation of Logger class at all times. Even beyond multiple Threads.
    But this way of locking methods across threads leads to low performance because after first instance need to lock the instance creation for every thread.
  */
  // public static Logger getInstance() {
  //   synchronized (Logger.class) {
  //     if (loggerInstance == null) {
  //       loggerInstance = new Logger();
  //     }
  //   }

  //   return loggerInstance;
  // }

  /*
    Double-checked locking reduces the performance overhead by only synchronizing during the first object creation. After the instance exists, threads skip the lock entirely.
  */
  public static Logger getInstance() {
    if (loggerInstance == null) {

      synchronized (Logger.class) {

        if (loggerInstance == null) {
          loggerInstance = new Logger();
        }
      }
    }

    return loggerInstance;
  }

  public void Logs(String message) {
    System.out.printf("%s\n", message);
  }
}
