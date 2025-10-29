# **CinemaBH-backend README file**

**Project start date:** 27.10.2025  
**Intern:** Edah Ždralović  
**Mentor:** Ibrahim Efendić  

---

## **About the project**
This is a study project: a web app for cinemas where users can view schedules and reserve or buy tickets.  
Right now, it’s only a skeleton for future development.

---

## **About this repository**
This repository contains the **backend** part of the project.  
**⚠️ Alert – This is the backend part of the project. To have the full project, visit the repository [EdahZdralovic/CinemaBH-frontend](https://github.com/EdahZdralovic/CinemaBH-frontend).**

**Advice:** Create one folder where you will keep both **CinemaBH-frontend** and **CinemaBH-backend** folders for an easier start.

---

## **How to run the project**

Firstly, read the alert above → you need **both the backend and frontend parts** of the project to be able to run it.

### **Requirements**
- **Node.js**  
  You can check if you already have Node.js installed by running this command in your terminal:  
      node -v
  
  If you don’t have Node.js installed, download and install it from the link below:  
  [Node.js download](https://nodejs.org/en/download)

- **Apache Maven**  
  You can download Maven from the link below:  
  [Maven download](https://maven.apache.org/download.cgi)

- **Java Software Development Kit (version 17 or above)**  
  You can download it from the link below:  
  [Java SDK download](https://www.oracle.com/europe/java/technologies/downloads/)

- **Nice to have:** IntelliJ IDEA or a similar Java code editor  
- **Important:** This repository is missing a file called `application.properties`.  
  This file is key to connecting the backend to the database. It holds sensitive information such as database passwords, API keys, etc.  
  For project security, I can’t share this file publicly, but you can contact me via email for help.

---

### **How to start the project**

(First check the requirements above.)

1. Open the terminal and navigate to the folder **CinemaBH-backend**.  
2. Run the command:  

       ./mvnw spring-boot:run
   
   After this, you can check if everything works via http://localhost:8080/api/movies
   (Port 8080 is defined in  application.properties.)
4. In a second terminal, navigate to the folder **CinemaBH-frontend**.  
5. Run:  

       npm install
  
7. Then run:  

       npm start
   
9. Visit http://localhost:3000

---

## **Technologies**
- **Backend:** Spring Boot  
- **Frontend:** React.js  
- **Database:** PostgreSQL

---

## **Database**
**ERD Diagram:**  
My ERD diagram for this project can be found at the link below, where you can also export the SQL code:  
[**Link to ERD Diagram**](https://dbdiagram.io/d/68ff6111357668b732c911ab)

---

## **Backend architecture**
Main application code is under:  src/main/java/edahzdralovic/cinemabh

Also, keep the main "@SpringBootApplication" class in the root package so component scanning finds controllers, services, repositories, and entities.

### **Layers (folders) and what they do:**
- **controller** — REST endpoints, only request/response handling, no business logic. (DTOs will be implemented in the future.)  
- **service** — Business logic and orchestration. Calls repositories and returns data to controllers.  
- **model** — JPA entities that map to DB tables (one entity ≙ one table). Do not expose entities directly in controllers.  
- **repository** — Spring Data JPA interfaces. Built-in CRUD/paging and derived queries.  
- **dto** — Request/response classes for the API (separate from entities).  
- **exception/** — Custom exceptions and a global handler for consistent JSON error responses.  
- **util/** — Small, stateless helpers (formatting, parsing). No big logic.

---

## **Dependencies (artifactId)**
- spring-boot-starter-data-jpa  
- spring-boot-starter-web  
- flyway-core  
- flyway-database-postgresql  
- spring-boot-devtools  
- postgresql  
- spring-boot-starter-test  
- lombok  
- springdoc-openapi-starter-webmvc-ui *(Swagger UI / OpenAPI 3)*

---

## **Maintenance**
This README.md will be **updated** for the next 3 months **(from 28.10.2025)**.

---

That’s all, folks!
