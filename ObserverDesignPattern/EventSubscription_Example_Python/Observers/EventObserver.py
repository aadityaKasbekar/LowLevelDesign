from abc import ABC, abstractmethod
from Subjects.EventTypes import EventTypes

class EventObserver(ABC):

  @abstractmethod
  def actionOnEvent(self, event : EventTypes, fileName : str):
    pass