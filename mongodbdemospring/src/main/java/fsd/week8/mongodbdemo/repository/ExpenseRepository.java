package fsd.week8.mongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fsd.week8.mongodbdemo.entity.Expense;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {

}
