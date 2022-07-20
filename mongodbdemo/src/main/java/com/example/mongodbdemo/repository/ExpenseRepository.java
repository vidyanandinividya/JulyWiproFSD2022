package com.example.mongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongodbdemo.model.Expense;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String>{

}
