from BuilderDesignPattern.SQLQuery_Example_Python.Products.SQLQuery import SQLQuery


class Driver:

	@staticmethod
	def main():
		queryBuilder1: SQLQuery.Builder = SQLQuery.Builder("users")
		query1: SQLQuery = (queryBuilder1.select("name", "email")
							.where("age > 18")
							.where("active = true")
							.orderBy("name", "ASC")
							.limit(10)
							.build())

		query2: SQLQuery = (SQLQuery.Builder("orders")
							.select("id", "total", "created_at")
							.where("status = 'completed'")
							.where("total > 100")
							.orderBy("created_at", "DESC")
							.limit(20)
							.offSet(40)
							.build())

		print(query1)
		print(query2)

if __name__ == "__main__":
	Driver.main()