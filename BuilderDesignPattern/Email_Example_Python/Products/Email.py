import copy

from BuilderDesignPattern.Email_Example_Python.ProductTypes.EmailPriorityTypes import EmailPriorityTypes


class Email:

	def __init__(self, recipient: str, subject: str, cc: list[ str ], bcc: list[
		str ], body: str, attachment: str, priority: EmailPriorityTypes):
		self.__to: str = recipient
		self.__subject: str = subject
		self.__cc: list[ str ] = copy.deepcopy(cc)
		self.__bcc: list[ str ] = copy.deepcopy(bcc)
		self.__body: str = body
		self.__attachment: str = attachment
		self.__emailPriority: EmailPriorityTypes = priority

	def getRecipient(self) -> str:
		return self.__to

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
