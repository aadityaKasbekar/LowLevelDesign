from Subjects.EventTypes import EventTypes
from Observers.EventObserver import EventObserver

class EventsManager:
  def __init__(self, *events: EventTypes) -> None :
    self.eventsBook : dict[EventTypes, list[EventObserver]] = { event: [] for event in events}

  def registerObserver(self, observer : EventObserver, *events : EventTypes) -> None :
    for event in events:
      if event not in self.eventsBook:
        self.eventsBook[event] = []
      elif observer in self.eventsBook[event]:
        print(f"The Observer {observer} is already been added to the event {event.name} notification list.")
        return
      self.eventsBook[event].append(observer)
      print(f"The Observer {observer} has been added to the event {event.name} notification list.")

  def removeObserver(self, event : EventTypes, observer : EventObserver) -> None :
    if event not in self.eventsBook:
      print("Invalid Input. The Event Doesnt Exist in EventsBook.")
      return
    elif observer not in self.eventsBook[event]:
      print(f"The Observer {observer} doesnt exist in notification list of event {event.name}.")
      return
    self.eventsBook[event].remove(observer)

  def notifyObservers(self, event : EventTypes, fileName : str) -> None :
    for observer in self.eventsBook[event]:
      observer.actionOnEvent(event, fileName)
