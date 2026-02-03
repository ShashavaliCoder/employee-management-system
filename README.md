# Employee Management System – Spring Boot Backend

A backend RESTful application built using Spring Boot that performs CRUD operations
(Create, Read, Update, Delete) on Employee data stored in a relational SQL database.

This project demonstrates real-world backend development practices including
layered architecture, REST APIs, database integration, and exception handling.

---

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- SQL Database (MySQL)
- Maven
- RESTful APIs
- Postman (for API testing)

---

## Project Features

- Create a new employee
- Get all employees
- Get employee by ID
- Update employee details
- Delete employee
- Proper HTTP status codes
- Global exception handling
- Clean layered architecture

---

## Project Architecture

src/main/java/com/shaikshashavali/employeemanagement
│
├── controller → REST Controllers
├── service → Business Logic
├── repository → JPA Repositories
├── model → Entity Classes
├── exception → Custom Exceptions & Handlers
└── EmployeeManagementApplication.java


This separation ensures maintainability, scalability, and testability.

---

## Database Schema (Employee)

| Column Name | Type |
|-----------|------|
| id | Long (Primary Key) |
| name | String |
| email | String |
| department | String |
| salary | Double |

---

## API Endpoints

### Create Employee
POST /api/employees


### Get All Employees
GET /api/employees


### Get Employee by ID
GET /api/employees/{id}


### Update Employee
PUT /api/employees/{id}


### Delete Employee
DELETE /api/employees/{id}


---

## Sample JSON Request

```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "department": "Engineering",
  "salary": 60000
}
application.properties (Example)
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
How to Run the Project
Clone the repository

Create a MySQL database named employeedb

Update database credentials in application.properties

Run the application:

mvn spring-boot:run
Test APIs using Postman

What This Project Demonstrates
Real-world Spring Boot backend structure

REST API design

SQL database integration

CRUD operations using JPA

Backend interview readiness

Future Enhancements
DTO implementation

Pagination and sorting

Authentication (JWT)

Role-based access control

Unit and integration testing

Author
Shaik Shasha Vali
Backend Developer | Java | Spring Boot.
