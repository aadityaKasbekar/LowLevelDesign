import threading

class Counter():

  _instance = None
  _lock = threading.Lock()
  _count: int
  _countLock: threading.Lock
  _isInternalCallFlag: bool = False
  _intilizationErrorString: str = """The Class whose object is being created is a Singleton Class.
                                      Constructor of the class cannot be used for creating objects.
                                      Use the cls.getInstance() for object creation."""

  def __new__(cls):
    if not cls._isInternalCallFlag:
      raise RuntimeError(cls._intilizationErrorString)
    if cls._instance is None:
      with cls._lock:
        if cls._instance is None:
          cls._instance = super(Counter, cls).__new__(cls)
          cls._instance._count = 0
          cls._instance._countLock = threading.Lock()
    return cls._instance

  @staticmethod
  def getInstance() -> 'Counter':
    Counter._isInternalCallFlag = True
    return Counter()

  def increment(self) -> None:
    with self._countLock:
      self._count += 1

  def getCount(self) -> int:
    with self._countLock:
      return self._count