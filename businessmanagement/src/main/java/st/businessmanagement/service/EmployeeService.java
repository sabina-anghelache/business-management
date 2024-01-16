package st.businessmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import st.businessmanagement.entity.Employee;
import st.businessmanagement.repository.EmployeeRepository;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // method for creating an employee
    public Employee createEmployee(Employee client) {
        return employeeRepository.save(client);
    }

    // method for getting all the employees
    public Iterable<Employee> getClients() {
        return employeeRepository.findAll();
    }

    // method for getting an employee by id

    public Employee getEmployeeById(int employeeId) {
        // Logic to get an employee by ID
        // You'll need to implement this based on your data source
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);

        // Check if the employee with the given ID exist
        return optionalEmployee.get();
    }

    // method for modifying the information for a specific employee
    public Employee updateEmployee(int employeeId, Employee updatedEmployee) {
        // Logic to update an employee by ID
        // You'll need to implement this based on your data source
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        Employee existingEmployee = optionalEmployee.get();

        // Update the fields you want to modify
        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setPosition(updatedEmployee.getPosition());
        existingEmployee.setHire_date(updatedEmployee.getHire_date());
        existingEmployee.setSalary(updatedEmployee.getSalary());
        existingEmployee.setAddress(updatedEmployee.getAddress());
        existingEmployee.setEmail(updatedEmployee.getEmail());

        // Save the updated employee
        return employeeRepository.save(existingEmployee);
    }
    // method for deleting an employee
    public void deleteEmployee(int employeeId) {
        // Logic to delete an employee by ID
        // You'll need to implement this based on your data source
        employeeRepository.deleteById(employeeId);
    }


        }
