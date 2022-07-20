package com.example.mongodbdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodbdemo.model.Expense;
import com.example.mongodbdemo.repository.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	public ExpenseRepository expenseRepository;
	public void addExpense(Expense expense)
	{
		expenseRepository.insert(expense);
	}
	public List<Expense> getAllExpense()
	{
		return expenseRepository.findAll();
	}
}
