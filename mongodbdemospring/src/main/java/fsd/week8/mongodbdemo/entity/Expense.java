package fsd.week8.mongodbdemo.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
@Data
@Document("expenses")
public class Expense {
	@Id
	private String id;
	@Field(name="name")
	@Indexed(unique = true)
	private String expense_name;
	@Field(name="category")
	private ExpenseCategory expenseCategory;
	@Field(name="amount")
	private BigDecimal expenseAmount;

}
