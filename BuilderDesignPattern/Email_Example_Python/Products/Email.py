import copy

from BuilderDesignPattern.Email_Example_Python.ProductTypes.EmailPriorityTypes import EmailPriorityTypes


class Email:
	__to: str
	__subject: str
	__cc: list[ str ]
	__bcc: list[ str ]
	__body: str
	__attachment: str
	__emailPriority: EmailPriorityTypes

	def __init__(self, recipient: str, subject: str, cc: list[ str ], bcc: list[
		str ], body: str, attachment: str, priority: EmailPriorityTypes):
		self.__to = recipient
		self.__subject = subject
		self.__cc = copy.deepcopy(cc)
		self.__bcc = copy.deepcopy(bcc)
		self.__body = body
		self.__attachment = attachment
		self.__emailPriority = priority

	def getRecipient(self) -> str:
		return self.___to

	def getSubject(self) -> str:
		return self.__subject

	def getCCList(self) -> list[ str ]:
		return self.__cc

	def getBCCList(self) -> list[ str ]:
		return self.__bcc

	def getBody(self) -> str:
		return self.__body

	def getAttachment(self) -> str:
		return self.__attachment

	def __str__(self) -> str:
		cc_str = "[" + ", ".join(self.__cc) + "]"
		bcc_str = "[" + ", ".join(self.__bcc) + "]"
		return f"Email{{to='{self.__to}', subject='{self.__subject}', cc={cc_str}, bcc={bcc_str}, body='{self.__body}', priority='{self.__emailPriority}', attachments={self.__attachment}}}"
