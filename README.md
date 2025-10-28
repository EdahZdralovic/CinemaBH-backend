# CinemaBH — Backend README file

**Project start date:** 27.10.2025
Intern: Edah Ždralović
Mentor: Ibrahim Efendić

## About the project
This is a study project: a web app for cinemas where users can view schedules and reserve or buy tickets. Right now it’s only a skeleton for future development.

## About this repository
This repository contains the **backend** part of the project.
**Alert - This is backend part of project - To have full project visit repository EdahZdralovic/CinemaBH-frontend**
  Link to the frontend part of project: (https://github.com/EdahZdralovic/CinemaBH-frontend/)
  Advice: Create one folder where you will keep CinemaBH-frontend and CinemaBH-backend folder for easyier start

## How to run project

  Firstly read Alert above -> you need **backend and frontend part** of project to be able to run it.

    **Requirements: **
      **Node.js** -> You can check  if you have already installed node.js in your terminal with comand ->"node -v"
          If you are missing node instalation zou can download it and install on link belove 
          Node download: ( https://nodejs.org/en/download )
      **Apache Maven** -> You can download Maven on link belove
          Maven download: ( https://maven.apache.org/download.cgi )
      **Java Software Development Kit (version 17. or above)** -> You can download it on link belove
          Javak SDK download: ( https://www.oracle.com/europe/java/technologies/downloads/ )
      **Nice to have - Intelijj or similar java code editor**
      **Most importantly - this repository is missing file called "application.properites"**
          This file is key file to conect backend to database, it is holding sensitive information like database password, api keys... 
          For project security I can't share this file but you can contact me via email for help.
         
      
## Technologies
    - Backend: **Spring Boot**
    - Frontend: **React.js**
    - Database: **PostgreSQL**

# Database 
   **ERD Diagram**
       My ERD diagram for this project zou can find on link belove where you can also export SQL code
       **Link to ERD Diagram** ( https://dbdiagram.io/d/68ff6111357668b732c911ab )


## Backend architecture
Main application code is under:
    "src/main/java/edahzdralovic/cinemabh"
    Also keep the main "@SpringBootApplication" class in the root package so component scanning finds controllers, services, repositories, and entities.

Layers (folders) and what they do:

  **controller** — REST endpoints, only request/response handling, no business logic. We will implement DTOs in future.
  **service** — Business logic and orchestration. Calls repositories; returns data to controllers.
  **model** — JPA entities that map to DB tables (one entity ≙ one table). Do not expose entities directly in controllers.
  **repository** — Spring Data JPA interfaces. Built-in CRUD/paging and derived queries.
  **dto** — Request/response classes for the API (separate from entities).
  **exception/** — Custom exceptions and a global handler for consistent JSON error responses.
  **util/** — Small, stateless helpers (formatting, parsing). No big logic.

## Dependencies (artifactId)
- spring-boot-starter-data-jpa  
- spring-boot-starter-web  
- flyway-core  
- flyway-database-postgresql  
- spring-boot-devtools  
- postgresql  
- spring-boot-starter-test  
- lombok  
- springdoc-openapi-starter-webmvc-ui  (Swagger UI / OpenAPI 3) :contentReference[oaicite:2]{index=2}

This README.md will be upadated for next 3 months (from 28.10.2025).

Thats all folks! 




