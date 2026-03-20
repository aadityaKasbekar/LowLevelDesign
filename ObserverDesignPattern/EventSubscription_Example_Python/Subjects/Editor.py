from EventsManager.EventsManager import EventsManager
from Subjects.EventTypes import EventTypes

class Editor:

  def __init__(self) -> None :
    self.queue : EventsManager = EventsManager(*(event for event in EventTypes))
    self.filePath : str = ""

  def openFile(self, fileName : str) -> None :
    self.filePath = fileName
    self.queue.notifyObservers(EventTypes.OPEN, fileName)
  
  def closeFile(self, fileName : str) -> None :
    self.filePath = ""
    self.queue.notifyObservers(EventTypes.CLOSE, fileName)

  def updateFile(self) -> None :
    if self.filePath != "":
      self.queue.notifyObservers(EventTypes.UPDATE, self.filePath)
      self.saveFile()
    else:
      print(f"No file is open in the editor to update. Please open a file first.")

  def saveFile(self) -> None :
    if self.filePath != "":
      self.queue.notifyObservers(EventTypes.SAVE, self.filePath)
    else:
      print(f"No file is open in the editor to save. Please open a file first.")

  def renameFile(self, newFileName: str) -> None :
    if self.filePath != "":
      self.queue.notifyObservers(EventTypes.RENAME, newFileName)
      self.filePath = newFileName
      self.saveFile()
    else:
      print(f"No file is open in the editor to rename. Please open a file first.")

  def deleteFile(self, fileName : str) -> None :
    if self.filePath == fileName:
      print(f"Cannot delete the file that is open. Please first close {self.filePath}.")
    else:
      self.queue.notifyObservers(EventTypes.DELETE, fileName)