## Node Registration API:

Node Registration API is a Spring Boot REST application used to register and manage monitoring nodes. The project follows a layered architecture with controller, service, repository, DTO, and exception handling.

#Features:

Register a node using REST API
Input validation using @Valid
Global exception handling using @RestControllerAdvice
Automatic timestamp (createdAt)
Database integration using Spring Data JPA
Tested using Postman

Technology Stack:
Java 17, Spring Boot, Spring Data JPA, H2/MySQL, Maven

API:
POST /api/nodes/register

#Sample Request:
{
"nodeName": "Node-1",
"ipAddress": "192.168.1.1",
"status": "ACTIVE"
}

#Sample Success Response:
{
"id": 1,
"nodeName": "Node-1",
"ipAddress": "192.168.1.1",
"status": "ACTIVE",
"createdAt": "2026-05-05T10:30:00"
}

#Validation:
If invalid data is sent, API returns 400 with field-level errors.

#Exception Handling:
Custom exception (NodeNotFoundException) and global exception handler are used to return proper error messages.

How to Run:

Clone the repository
Open project in IDE
Run Spring Boot application
Test API using Postman

#Author:
Mahesh Kumar