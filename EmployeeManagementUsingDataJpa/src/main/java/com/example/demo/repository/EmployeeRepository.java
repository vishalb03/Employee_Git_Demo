package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;
													//(model class, data type of primary key)
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{ // persist()-save , merge()- update, remove()- delete, find() ---) 1 row
										// operation
										// createQuery() --> for multi row operations
	@Query("Select e from Employee e where e.empDesg=?1")
	public abstract List<Employee> getEmployeesByDesg(String empDesg);
	
	@Query("Select e from Employee e where e.empSal between ?1 and ?2")
	public abstract List<Employee> getEmployeesBetweenSal(int intialSal, int finalSal);

}
//CrudRepository
//JpaRepository

