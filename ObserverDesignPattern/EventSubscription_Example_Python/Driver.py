from Subjects.Editor import Editor
from Subjects.EventTypes import EventTypes
from Observers.EmailService import EmailService
from Observers.LoggerService import LoggerService

class Driver:

  @staticmethod
  def main():
    editor : Editor = Editor()
    editor.queue.registerObserver(EmailService("aadityakasbekar.com"), EventTypes.RENAME, EventTypes.DELETE, EventTypes.UPDATE)
    editor.queue.registerObserver(LoggerService("logs.txt"), *(event for event in EventTypes))

    editor.openFile("test.txt")
    editor.updateFile()
    # editor.saveFile()
    editor.renameFile("test.txt")
    editor.closeFile("test.txt")
    editor.deleteFile("test1.txt")

if __name__ == "__main__":
  Driver.main()