from typing import Final, Optional

class SQLQuery:

	class Builder:

		def __init__(self, table: str):
			self._table: Final[str] = table
			self._columns: list[str] = []
			self._conditions: list[str] = []
			self._orderBy: str = ""
			self._orderDirection: str = "ASC"
			self._limit: Optional[int] = None
			self._offSet: Optional[int] = None

		def select(self, *columns: str) -> "SQLQuery.Builder":
			self._columns.extend(columns)
			return self

		def where(self, condition: str) -> "SQLQuery.Builder":
			self._conditions.append(condition)
			return self

		def orderBy(self, column: str, direction: str) -> "SQLQuery.Builder":
			self._orderBy = column
			self._orderDirection = direction
			return self

		def limit(self, count: int) -> "SQLQuery.Builder":
			self._limit = count
			return self

		def offSet(self, offSet: int) -> "SQLQuery.Builder":
			self._offSet = offSet
			return self

		def build(self) -> "SQLQuery":
			return SQLQuery(self)

	def __init__(self, builder: "Builder"):
		self.__table: Final[str] = builder._table
		self.__columns: Final[ list[str] ] = builder._columns
		self.__conditions: Final[ list[str] ] = builder._conditions
		self.__orderBy: Final[ str ] = builder._orderBy
		self.__orderDirection: Final[ str ] = builder._orderDirection
		self.__limit: Final[ int ] = builder._limit
		self.__offSet: Final[ int ] = builder._offSet

	def __str__(self) -> str:
		# 1. Start with SELECT and handle columns
		# Accessing name-mangled __columns and __table
		column_part = ", ".join(self.__columns) if self.__columns else "*"
		query_parts = [ f"SELECT {column_part} FROM {self.__table}" ]

		# 2. Add WHERE conditions (from self.__conditions list)
		if self.__conditions:
			query_parts.append(f"WHERE {' AND '.join(self.__conditions)}")

		# 3. Add ORDER BY (from self.__orderBy and self.__orderDirection)
		if self.__orderBy:
			# Defaulting to ASC if not provided, though your builder sets a default
			direction = self.__orderDirection if self.__orderDirection else "ASC"
			query_parts.append(f"ORDER BY {self.__orderBy} {direction}")

		# 4. Add LIMIT
		# Check if limit is not None and greater than 0
		if self.__limit is not None and self.__limit > 0:
			query_parts.append(f"LIMIT {self.__limit}")

		# 5. Add OFFSET
		if self.__offSet is not None and self.__offSet > 0:
			query_parts.append(f"OFFSET {self.__offSet}")

		# Join with spaces and terminate with a semicolon
		return " ".join(query_parts) + ";"
