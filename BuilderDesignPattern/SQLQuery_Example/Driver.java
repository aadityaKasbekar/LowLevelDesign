package BuilderDesignPattern.SQLQuery_Example;

import BuilderDesignPattern.SQLQuery_Example.Products.SQLQuery;

public class Driver {
	static void main(String[] args) {
		SQLQuery query1 = new SQLQuery.Builder("users")
								  .select("name", "email")
								  .where("age > 18")
								  .where("active = true")
								  .orderBy("name", "ASC")
								  .limit(10)
								  .build();

		SQLQuery query2 = new SQLQuery.Builder("orders")
								  .select("id", "total", "created_at")
								  .where("status = 'completed'")
								  .where("total > 100")
								  .orderBy("created_at", "DESC")
								  .limit(20)
								  .offset(40)
								  .build();

		System.out.println(query1.toSQL());
		System.out.println(query2.toSQL());
	}
}
