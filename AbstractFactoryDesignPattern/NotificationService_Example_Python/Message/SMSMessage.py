from AbstractFactoryDesignPattern.NotificationService_Example_Python.Message.NotificationMessage import NotificationMessage

class SMSMessage(NotificationMessage):

	def __init__(self) -> None:
		self.toPhoneNum : str = ""
		self.body: str = ""

	def setContent(self, to : str, body : str) -> None:
		self.toPhoneNum = to
		self.body = body[:160]

	def formatMessage(self) -> str:
		return "SMS to " + self.toPhoneNum + ": " + self.body