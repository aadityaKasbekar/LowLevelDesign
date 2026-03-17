from BuilderDesignPattern.Email_Example_Python.ProductTypes.EmailPriorityTypes import EmailPriorityTypes
from BuilderDesignPattern.Email_Example_Python.Products.Email import Email


class EmailBuilder:

	__to: str
	__subject: str
	__cc: list[ str ]
	__bcc: list[ str ]
	__body: str
	__attachment: str
	__emailPriority: EmailPriorityTypes

	def __init__(self, recipientAddr: str, subject: str):
		self.__to = recipientAddr
		self.__subject = subject
		self.__cc = []
		self.__bcc = []
		self.__body = ""
		self.__attachment = ""
		self.__emailPriority = EmailPriorityTypes.NORMAL

	def updateRecipientAddr(self, recipientAddr: str) -> "EmailBuilder":
		self.__to = recipientAddr
		return self

	def updateSubject(self, subject: str) -> "EmailBuilder":
		self.__subject = subject
		return self

	def addCCRecipients(self, *agrs_string: str) -> "EmailBuilder":
		if agrs_string:
			for recipients in agrs_string:
				self.__cc.append(recipients)
		return self

	def addBCCRecipients(self, *agrs_string: str) -> "EmailBuilder":
		if agrs_string:
			for recipients in agrs_string:
				self.__bcc.append(recipients)
		return self

	def addBody(self, body: str) -> "EmailBuilder":
		self.__body = body
		return self

	def addAttachment(self, location: str) -> "EmailBuilder":
		self.__attachment = location
		return self

	def updateEmailPriority(self, priority: EmailPriorityTypes) -> "EmailBuilder":
		self.__emailPriority = priority
		return self

	def build(self) -> Email:
		return Email(self.__to, self.__subject, self.__cc, self.__bcc, self.__body, self.__attachment, self.__emailPriority)
