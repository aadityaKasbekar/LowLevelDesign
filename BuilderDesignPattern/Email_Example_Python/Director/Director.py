from BuilderDesignPattern.Email_Example_Python.Builders.EmailBuilder import EmailBuilder
from BuilderDesignPattern.Email_Example_Python.Products.Email import Email


class Director:

	def outOfOfficeEmail(self, latestSender: str) -> Email:
		return (EmailBuilder(latestSender, "Out of Office till 30th March.")
				.addCCRecipients("aadityakasbekar2@gmail", "kartikraut98@gmail.com")
				.addBody(f"""
				Hi,

				Thanks for reaching out. I hope you are doing well. Currently, I am out of office till 30th March 2026.
				I will get back to you as soon as possible after my return. 

				If this issue requires urgent attention, please contact my teammate Kartik Raut (kartikraut98@gmail.com).

				Thanks & Regards,
				Aaditya Kasbekar
				""")
				.build())
