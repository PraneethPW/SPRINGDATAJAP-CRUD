# Spring Data JPA CRUD — One Shot Reference

This repository is a **quick reference** for implementing **CRUD (Create, Read, Update, Delete)** operations in **Spring Boot** using **Spring Data JPA**.  
It’s designed to be **straight-to-the-point**, with a clean and layered structure, so you can understand CRUD logic at a glance.

---

## 📌 Features
- **Create** → Insert new records
- **Read** → Fetch all or specific records
- **Update** → Modify existing records
- **Delete** → Remove records by ID or object
- **Layered Architecture** → Entity, Service, Repository, Application

---

## 📂 Project Structure

src/main/java
│
├── in.praneeth.Entity
│ └── Student.java # Entity class
│
├── in.praneeth.Service
│ ├── StudentServiceInterface.java # Service Interface
│ └── StudentServiceClass.java # Service Implementation
│
├── in.praneeth.SpringDataJpa
│ ├── SpringdatajpaoneshotApplication.java # Main Application
│ └── StudentRepoInterface.java # Repository Interface

---

## 🛠 Tech Stack
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **Maven**

---

## ▶️ How to Run
1. **Clone this repo**  

   git clone https://github.com/PraneethPW/spring-data-jpa-crud.git

   Open in IDE (Eclipse/IntelliJ)

2. Open in IDE (Eclipse/IntelliJ)

3. Configure Database in application.properties

4. **Run the Application**
         :: mvn spring-boot:run

  ## 🔍 CRUD Methods Overview
**Insert Record**

serve.InjectValues(student);

**Get All Records**

serve.findAll();
Get By ID

**Delete Record**

serve.findById(rollNo);
Delete By ID
serve.deleteById(rollNo);

**Delete Object**

serve.deleteObject(student);

## 📷 Output
  **INSERTION**
<img width="361" height="200" alt="Screenshot 2025-08-10 131620" src="https://github.com/user-attachments/assets/be3a941a-5ba0-4007-b59e-41d699fccceb" />

**DELETION**
<img width="359" height="152" alt="Screenshot 2025-08-10 131633" src="https://github.com/user-attachments/assets/d3ac2cfa-5400-4b3e-979c-2402440b192c" />


## 💡 Purpose

This repo is meant as a ready-to-use cheat sheet for anyone learning or revisiting Spring Data JPA CRUD operations without diving into a heavy project.

## 🤝 Contribution


If you think this could help more developers, feel free to:

Star ⭐ the repo

Fork 🍴 and improve it

Share it with fellow Java/Spring learners

## Author: Praneeth Reddy. J


