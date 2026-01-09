package com.example.employee.service;


	
	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.example.employee.entity.Employee;
	import com.example.employee.repository.EmployeeRepository;

	@Service
	public class EmployeeServiceImpl implements EmployeeService {

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    @Override
	    public Employee saveEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    @Override
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    @Override
	    public Employee getEmployeeById(Long id) {
	        return employeeRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Employee updateEmployee(Long id, Employee employee) {
	        Employee existing = employeeRepository.findById(id).orElse(null);

	        if (existing != null) {
	            existing.setName(employee.getName());
	            existing.setEmail(employee.getEmail());
	            existing.setDepartment(employee.getDepartment());
	            existing.setSalary(employee.getSalary());
	            return employeeRepository.save(existing);
	        }
	        return null;
	    }

	    @Override
	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }
	}


