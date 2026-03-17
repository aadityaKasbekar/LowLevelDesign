from BuilderDesignPattern.Email_Example_Python.Builders.EmailBuilder import EmailBuilder
from BuilderDesignPattern.Email_Example_Python.Director.Director import Director
from BuilderDesignPattern.Email_Example_Python.ProductTypes.EmailPriorityTypes import EmailPriorityTypes
from BuilderDesignPattern.Email_Example_Python.Products.Email import Email


class Driver:

	@staticmethod
	def main():
		director: Director = Director()
		builder: EmailBuilder = EmailBuilder("sudhanvapaturkar49@gmail.com", "Hi testing the new method.")

		email1: Email = director.outOfOfficeEmail("akshaychavan30@gmail.com")
		email2: Email = (builder.addCCRecipients("akshaykasbekar34@gmail.com")
						 .addBCCRecipients("sakshiwadaskar28@gmail.com")
						 .addAttachment("/importantDocuments/veyImportantFile")
						 .updateEmailPriority(EmailPriorityTypes.HIGH)
						 .build())

		print(email1)
		print(email2)


if __name__ == '__main__':
	Driver.main()
