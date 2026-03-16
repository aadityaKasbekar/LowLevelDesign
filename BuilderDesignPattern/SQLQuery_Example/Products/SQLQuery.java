package BuilderDesignPattern.SQLQuery_Example.Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQLQuery {
	private final String table;
	private final List<String> columns;
	private final List<String> conditions;
	private final String orderBy;
	private final String orderDirection;
	private final int limit;
	private final int offset;

	public SQLQuery(Builder builder) {
		this.table = builder.table;
		this.columns = List.copyOf(builder.columns);
		this.conditions = List.copyOf(builder.conditions);
		this.orderBy = builder.orderBy;
		this.orderDirection = builder.orderDirection;
		this.limit = builder.limit;
		this.offset = builder.offset;
	}

	public static class Builder {
		private final String table;
		private List<String> columns = new ArrayList<String>();
		private List<String> conditions = new ArrayList<String>();
		private String orderBy;
		private String orderDirection = "ASC";
		private int limit;
		private int offset;

		public Builder(String table) {
			this.table = table;
		}

		public Builder select(String... columns) {
			this.columns.addAll(Arrays.asList(columns));
			return this;
		}

		public Builder where(String condition) {
			this.conditions.add(condition);
			return this;
		}

		public Builder orderBy(String column, String direction) {
			this.orderBy = column;
			this.orderDirection = direction;
			return this;
		}

		public Builder limit(int limit) {
			this.limit = limit;
			return this;
		}

		public Builder offset(int offset) {
			this.offset = offset;
			return this;
		}

		public SQLQuery build() {
			return new SQLQuery(this);
		}
	}

	public String toSQL() {
		StringBuilder query = new StringBuilder("SELECT ");
		query.append(columns.isEmpty() ? "*" : String.join(", ", columns));
		query.append(" FROM ").append(table);
		if (!conditions.isEmpty()) {
			query.append(" WHERE ").append(String.join(" AND ", conditions));
		}
		if (orderBy != null) {
			query.append(" ORDER BY ").append(orderBy).append(" ").append(orderDirection);
		}
		if (limit > 0) {
			query.append(" LIMIT ").append(limit);
		}
		if (offset > 0) {
			query.append(" OFFSET ").append(offset);
		}
		query.append(";");
		return query.toString();
	}
}
