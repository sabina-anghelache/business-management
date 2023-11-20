# BUSINESS MANAGAMENT APPLICATION USING ELASTICSEARCH 

# OVERVIEW
The project aims to develop a comprehensive business management application for an online sales 
company. The application will utilize REST services to efficiently handle various operations, providing
the best experience for both the company and its customers. 

# TECHNOLOGY SELECTION
For this application, the technology used is Elasticsearch, a scalable search engine. It will facilitate
efficient data indexing and retrieval, ensuring optimal performance for managing customer information,
product details and sales transactions. For the frontend, React will be used. 

# DESIGNING REST API

The REST API design revolves around three key entities: Client, Product and Sale. 
+ The client will have: 
  - Capability to store customer information, allowing addition, modification, and retrieval of customer details.
  - Registration of new customers, modification of existing customer information, and retrieval of specific customer 
  information are integral functionalities.
+ The product will have: 
  - Storage of product information, including name, price, available stock, and other relevant details.
  - Operations such as adding a new product, modifying existing product information, accessing specific product details
and updating available stock are essential.
+ The sale will have: 
  - Logging information related to sales, encompassing the product sold, the customer involved, quantity,
selling price, and other pertinent details.
  - Functions include registering a new sale, retrieving information about a specific sale, obtaining all sales 
for a particular product, and retrieving all purchases made by a specific customer.

These functionalities that the application will provide will be made using: 
1. GET METHOD
  - GET/clients - to retrieve a list of all clients
  - GET/clients/{id} - to retrieve details of a specific client by ID
  - GET/products - to retrieve a list of all products
  - GET/products/{id} - to retrieve details of a specific product by ID
  - GET/sales - to retrieve a list of all sales
  - GET/sales/{id} - to retrieve details of a specific sale by ID
  - GET/sales/{productID} - to retrieve all sales for a particular product
  - GET/sales/{custumerID} - to retrieve all purchases made by a specific customer
2. POST METHOD
  - POST/clients - to add new client
  - POST/products - to add a new product
  - POST/sales - to add a new sale
3. PUT METHOD
  - PUT/clients/{id} - to modify an existing client's information
  - PUT/products/{id} - to modify an existing product's information
  - PUT/sales/{id} - to modify an existing sale's information
4. DELETE METHOD
  - DELETE/clients/{id} - to delete a client by ID
  - DELETE/products/{id} - to delete a product by ID
  - DELETE/sales/{id} - to delete a sale by ID
