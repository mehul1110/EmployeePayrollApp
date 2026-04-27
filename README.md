# Employee Payroll Application

## 📄 Project Overview
This repository implements a **Spring Boot** based **Employee Payroll Management System**. The application demonstrates clean‑architecture principles, layered design, and a collection of incremental **Use Cases (UC)** that progressively add features such as DTOs, service layers, Lombok integration, robust logging, environment‑based configuration, validation, custom exception handling, and MySQL persistence.

---

## 🛠️ Technologies & Tools
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL** (production) & **H2** (in‑memory for tests)
- **Lombok** – boilerplate reduction
- **MapStruct** – DTO mapping
- **Validation API (Hibernate Validator)**
- **Logback** – logging with profiles
- **Maven** (wrapper provided)
- **JUnit 5 & Mockito** – unit testing
- **Git** – branch‑by‑feature workflow

---

## 📚 Use Cases Implemented


**UC1 – Setup Spring Boot Employee Payroll Project**
Initial project bootstrap with Maven wrapper, basic `Employee` entity, and starter REST controller.

**UC2 – REST Controller**
Exposes CRUD endpoints (`/employees`) for creating, retrieving, updating, and deleting employees.

**UC3 – Introducing DTO Model**
Adds Data Transfer Objects (`EmployeeDto`) and uses MapStruct to decouple API contracts from persistence entities.

**UC4 – Introducing Services Layer**
Implements `EmployeeService` to encapsulate business logic, keeping the controller thin.

**UC5 – Service‑Layer Storage**
Refactors repository usage into the service layer, introducing `EmployeeRepository` with Spring Data JPA.

**UC6 – Add Lombok to Employee Payroll App**
Annotates entities and DTOs with Lombok (`@Getter`, `@Setter`, `@Builder`, `@NoArgsConstructor`, `@AllArgsConstructor`).

**UC7 – Use Lombok for Logging**
Adds `@slf4j` to service and controller classes for consistent logging.

**UC8 – Logging Levels and Profiles**
Configures Logback profiles (`dev`, `prod`) with different logging levels and file appenders.

**UC9 – Database Settings as Environment Variable**
Moves DB credentials to environment variables (`SPRING_DATASOURCE_URL`, `USERNAME`, `PASSWORD`) for secure configuration.

**UC10 – Validation – Name Field**
Adds `@NotBlank` and `@Size` constraints on employee name with appropriate error messages.

**UC11 – Custom Exception Handler**
Implements a `@ControllerAdvice`‑based global handler to translate validation and runtime exceptions into meaningful API responses.

**UC12 – Employee‑Not‑Found Exception**
Defines a specific `EmployeeNotFoundException` and returns HTTP 404 with a descriptive payload.

**UC13 – Expand Data Models**
Introduces additional fields (e.g., `department`, `salary`, `joinDate`) and updates DTOs/validation accordingly.

**UC14 – Implement Validations**
Completes validation suite for all new fields, including custom validators for salary range and date formats.

**UC15 – MySQL Persistence**
Switches the persistence layer from H2 to MySQL, includes Flyway migrations, and updates `application‑dev.yml` / `application‑prod.yml`.

---

## 🚀 Getting Started

**Build and Run**

```bash
./mvnw clean install   # Windows: mvnw.cmd
./mvnw spring-boot:run # Windows: mvnw.cmd spring-boot:run
```

The application starts on `http://localhost:8080`. Swagger UI is available at `/swagger-ui.html` to explore the API.

---

## 🏗️ Architecture Overview
```
src/main/java/com/example/payroll
│   ├── controller        // REST endpoints
│   ├── service           // Business logic
│   ├── repository        // Spring Data JPA interfaces
│   ├── model             // JPA entities
│   ├── dto               // Data Transfer Objects
│   ├── exception         // Custom exceptions & handler
│   └── mapper            // MapStruct mappers
```
The design follows **Layered Architecture** (Controller → Service → Repository) and **Domain‑Driven Design** principles, making the codebase easy to extend with new use cases.

---

## ✅ Testing
- Unit tests reside in `src/test/java` and cover service and controller layers.
- Run tests with:
  ```bash
  ./mvnw test
  ```

---

