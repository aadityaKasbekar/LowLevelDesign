from Subjects.EventTypes import EventTypes
from Observers.EventObserver import EventObserver

class EmailService(EventObserver):

  def __init__(self, emailId : str) -> None:
    super().__init__()
    self.emailId : str = emailId

  def actionOnEvent(self, event : EventTypes, fileName : str):
    print(f"""{event} action is taken on the file: {fileName}. Email Sent to "{self.emailId}".""")