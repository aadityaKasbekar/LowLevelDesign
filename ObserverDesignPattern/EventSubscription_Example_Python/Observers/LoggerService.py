from Subjects.EventTypes import EventTypes
from Observers.EventObserver import EventObserver

class LoggerService(EventObserver):

  def __init__(self, logFileName : str) -> None:
    super().__init__()
    self.logFile : str = logFileName

  def actionOnEvent(self, event: EventTypes, fileName: str):
    print(f""" The action {event} has been taken on the file {fileName}. Action has been logged to file "{self.logFile}".""")