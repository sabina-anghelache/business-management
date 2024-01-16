package st.businessmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import st.businessmanagement.entity.Employee;
import st.businessmanagement.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employees")
public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

        // create employee
        @PostMapping
        public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
            Employee createdEmployee = employeeService.createEmployee(employee);
            return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
        }

        // get all the employees
        @GetMapping
        Iterable<Employee> findAll() {
            return employeeService.getClients();
        }

        // get employee by id
        @GetMapping("/{id}")
        public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int employeeId) {
            Employee employee = employeeService.getEmployeeById(employeeId);
            return ResponseEntity.ok(employee);
        }

        // update the employee information
        @PutMapping("/{id}")
        public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
            Employee employee = employeeService.updateEmployee(id, updatedEmployee);
            return ResponseEntity.ok(employee);
         }

         // deleting the employee
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
            employeeService.deleteEmployee(id);
            return ResponseEntity.noContent().build();
    }
}
