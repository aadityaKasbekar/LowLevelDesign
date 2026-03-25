from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.NotificationMessage import NotificationMessage

class EmailMessage(NotificationMessage):

	def __init__(self) -> None:
		self.toEmailID : str = ""
		self.body : str = ""

	def setContent(self, to : str, body : str) -> None:
		self.toEmailID = to
		self.body = body

	def formatMessage(self) -> str:
		return "Email to <" + self.toEmailID + ">: " + self.body