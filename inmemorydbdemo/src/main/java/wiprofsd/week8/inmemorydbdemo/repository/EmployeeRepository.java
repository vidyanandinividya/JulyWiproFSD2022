package wiprofsd.week8.inmemorydbdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wiprofsd.week8.inmemorydbdemo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
