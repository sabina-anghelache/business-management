# BUSINESS MANAGAMENT APPLICATION USING ELASTICSEARCH 

# OVERVIEW
The project aims to develop a comprehensive business management application for a better organization of the company's employees. The application will utilize REST services to efficiently handle various operations, providing
the best experience. 

# TECHNOLOGY SELECTION
For this application, the technology used is Elasticsearch, a scalable search engine. It will facilitate
efficient data indexing and retrieval, ensuring optimal performance for managing employee information. For the frontend, React will be used. 

# DESIGNING REST API

The REST API design revolves around three key entities: Employee. 
+ The employee will have: 
  - Capability to store employee information, allowing addition, modification, and retrieval of employee details.
  - Registration of new employees, modification of existing employer information, and retrieval of specific employee 
  information are integral functionalities.


These functionalities that the application will provide will be made using: 
1. GET METHOD
  - GET/employees - to retrieve a list of all employees
  - GET/employees/{id} - to retrieve details of a specific employee by ID
2. POST METHOD
  - POST/employees - to add new employee
3. PUT METHOD
  - PUT/employees/{id} - to modify an existing employee's information
4. DELETE METHOD
  - DELETE/employees/{id} - to delete an employee by ID
