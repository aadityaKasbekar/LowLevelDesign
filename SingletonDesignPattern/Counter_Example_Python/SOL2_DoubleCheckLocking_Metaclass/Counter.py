import threading
from SingletonMeta import SingletonMeta

class Counter(metaclass=SingletonMeta):

  def __init__(self):
    self._count = 0
    self._countLock = threading.Lock()

  def increment(self):
    with self._countLock:
      self._count += 1

  def getCount(self):
    with self._countLock:
      return self._count