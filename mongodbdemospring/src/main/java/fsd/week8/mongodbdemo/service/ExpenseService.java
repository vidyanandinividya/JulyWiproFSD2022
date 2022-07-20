package fsd.week8.mongodbdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fsd.week8.mongodbdemo.entity.Expense;
import fsd.week8.mongodbdemo.repository.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	ExpenseRepository expenseRepository;
	
	public void addExpense(Expense expense)
	{
		expenseRepository.insert(expense);
	}
	public List<Expense> getAllExpense()
	{
		return expenseRepository.findAll();
	}

}
