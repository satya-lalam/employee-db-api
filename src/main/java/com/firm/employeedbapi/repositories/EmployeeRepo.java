package com.firm.employeedbapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.firm.employeedbapi.beans.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String>{

}
