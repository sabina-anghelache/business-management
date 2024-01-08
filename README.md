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
  - GET/employees - to retrieve a list of all clients
  - GET/employees/{id} - to retrieve details of a specific client by ID
2. POST METHOD
  - POST/employees - to add new client
3. PUT METHOD
  - PUT/employees/{id} - to modify an existing client's information
  - PUT/products/{id} - to modify an existing product's information
  - PUT/sales/{id} - to modify an existing sale's information
4. DELETE METHOD
  - DELETE/clients/{id} - to delete a client by ID
  - DELETE/products/{id} - to delete a product by ID
  - DELETE/sales/{id} - to delete a sale by ID
