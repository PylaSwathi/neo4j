package com.example.neo4j_example.repo;

import com.example.neo4j_example.model.Employee;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends Neo4jRepository<Employee, Long> {
}
