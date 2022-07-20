package fsd.week8.mongodbdemo.controller;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fsd.week8.mongodbdemo.entity.Expense;
import fsd.week8.mongodbdemo.service.ExpenseService;

@RestController
@RequestMapping("api/expense")
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	@PostMapping
	public ResponseEntity addExpense(@RequestBody Expense expense)
	{
		expenseService.addExpense(expense);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@GetMapping
	public ResponseEntity<List<Expense>> getAllExpense()
	{
		return ResponseEntity.ok(expenseService.getAllExpense());
	}

}
