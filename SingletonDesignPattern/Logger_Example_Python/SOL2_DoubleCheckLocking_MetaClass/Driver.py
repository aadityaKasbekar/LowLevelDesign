# import threading
from Logger import Logger

class Driver():

  @staticmethod
  def main():

    logger1 = Logger()
    logger2 = Logger()

    logger1.Log("This is the log from the object logger1")
    logger2.Log("This is the log from the object logger2")

    print(logger1 == logger2)

    # thread1 = threading.Thread(target=lambda: Logger().Log("This is the log from the LoggerObject created by Thread1 "))
    # thread2 = threading.Thread(target=lambda: Logger().Log("This is the log from the LoggerObject created by Thread2 "))
    # thread1.start()
    # thread2.start()
    # thread1.join()
    # thread2.join()

if __name__ == "__main__":
  Driver.main()