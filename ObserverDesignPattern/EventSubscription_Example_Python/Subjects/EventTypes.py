from enum import Enum, auto

class EventTypes(Enum):
  OPEN = auto()
  CLOSE = auto()
  UPDATE = auto()
  SAVE = auto()
  DELETE = auto()
  RENAME = auto()