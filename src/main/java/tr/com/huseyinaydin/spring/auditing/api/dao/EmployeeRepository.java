package tr.com.huseyinaydin.spring.auditing.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.huseyinaydin.spring.auditing.api.model.Employee;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot JPA Auditing
 * 
 */

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
