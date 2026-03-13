import threading

class Logger():

  _loggerInstance = None
  _isInternalCallFlag = False
  _lock = threading.Lock()

  def __new__(cls):
    if not cls._isInternalCallFlag:
      raise RuntimeError("""The Class whose object is being created is a Singleton Class.
                        Constructor of the class cannot be used for creating objects.
                        Use the cls.getInstance() fro object creation.""")
    if cls._loggerInstance == None:
      with cls._lock:
        if cls._loggerInstance == None:
          cls._loggerInstance = super(Logger, cls).__new__(cls)
          print("First and only one Logger Instance is created.")
          print(f"{cls._loggerInstance}")
          cls._isInternalCallFlag = False
    else:
      cls._isInternalCallFlag = False
    return cls._loggerInstance

  @staticmethod
  def getInstance() -> 'Logger':
    Logger._isInternalCallFlag = True
    return Logger()

  def Log(self, message: str) -> None:
    print(message)
    print(f"""The Logger instance used for printing the above log message is:
          {Logger._loggerInstance}""")