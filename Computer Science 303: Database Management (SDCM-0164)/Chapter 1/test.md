# Database Concepts – 15 Question Review

This document contains **15 database concepts questions** with correct answers and **comprehensive explanations** for each.  
It is designed as a **study and reference guide** for understanding the fundamentals of database management systems (DBMS).

---

## Questions, Answers, and Explanations

### 1. What makes a relational database so effective?
**Answer:** Multiple tables can be linked together  
**Explanation:**  
Relational databases store data in multiple tables connected through **primary** and **foreign keys**, allowing flexible queries without duplicating data. This reduces redundancy, maintains data integrity, and enables complex relationships to be represented efficiently.

---

### 2. Which of the following is an advantage of a hierarchical data model?
**Answer:** Conceptual simplicity  
**Explanation:**  
The hierarchical model organizes data in a **tree-like structure** with clear parent-child relationships. This one-to-many format is intuitive for representing naturally hierarchical data such as organizational charts or file systems.

---

### 3. Which of the following DBMS models would be used to manage a collection of audio files?
**Answer:** Object-oriented  
**Explanation:**  
Object-oriented databases can store **complex data types** like audio, images, and video along with their associated methods, making them ideal for multimedia management.

---

### 4. Which of the following database models uses parent-child relationships where each child can have multiple parents?
**Answer:** Network database model  
**Explanation:**  
The network model allows **many-to-many** relationships through sets or pointers, enabling each child record to be linked to multiple parent records.

---

### 5. What does a database model provide?
**Answer:** A systematic way to organize data  
**Explanation:**  
A database model defines how data is **structured, related, and manipulated**, ensuring consistency, efficiency, and integrity.

---

### 6. The database administrator has already set permissions for several people to use the system. Three of the users need to be able to use the database at the same time. What function does the administrator need to set?
**Answer:** Concurrency  
**Explanation:**  
Concurrency control allows multiple users to **access and modify** data simultaneously while preventing conflicts like lost updates or inconsistent reads.

---

### 7. What does the acronym DBMS stand for?
**Answer:** Database Management System  
**Explanation:**  
A DBMS is software that enables the creation, modification, retrieval, and administration of databases, ensuring security, concurrency, and data integrity.

---

### 8. Where is a multi-user database typically located?
**Answer:** On a server  
**Explanation:**  
Hosting the database on a server provides centralized access, security, backup, and scalability for multiple simultaneous users.

---

### 9. Which of the following is NOT a potential advantage of a database management system (DBMS)?
**Answer:** Reducing data storage needs  
**Explanation:**  
While a DBMS can reduce **data redundancy**, it is not always focused on reducing **overall storage needs**. In some cases, databases may actually require more storage because of indexes, logs, and backups that ensure performance, integrity, and recovery. The main benefits of a DBMS include multi-user access, data consistency, security, and automation—not minimizing storage.

---

### 10. What are the three fundamental elements of a database management system?
**Answer:** Physical database, database engine, and database schema  
**Explanation:**  
- **Physical database**: The stored data.  
- **Database engine**: The core service that processes queries and manages transactions.  
- **Database schema**: The logical blueprint defining structure and relationships.

---

### 11. Fill in the blank: When duplicate versions of the same data appear in different places, _____.
**Answer:** Data redundancy occurs  
**Explanation:**  
Data redundancy wastes storage space and can cause inconsistencies when changes are not reflected in all copies. Normalization reduces redundancy.

---

### 12. Fill in the blank: A database management system is _____.
**Answer:** Software application that allows the creation and editing of a database while allowing multiple concurrent access of users  
**Explanation:**  
A DBMS enables creating, modifying, and managing databases while supporting multiple users simultaneously with security and integrity controls.

---

### 13. Fill in the blank: Data redundancy results from _____.
**Answer:** Storing the same data in multiple places  
**Explanation:**  
Duplicate storage leads to inconsistencies and higher maintenance effort. Relational design and normalization minimize redundancy.

---

### 14. Fill in the blank: Data integrity restrictions serve to _____.
**Answer:** Control data input formats and ensure data entry validity  
**Explanation:**  
Integrity constraints enforce rules on data entry to keep it accurate and consistent, such as domain, entity, and referential constraints.

---

### 15. Fill in the blank: Database security comprises protection of the data within the database from _____.
**Answer:** Users accessing restricted areas in the database and from unauthorized external access  
**Explanation:**  
Database security prevents both **internal misuse** and **external threats**. Internally, it ensures users can only access data for which they have permission. Externally, it blocks unauthorized access through measures like authentication, encryption, firewalls, and intrusion detection systems.

---

## How to Use This Guide
- Review **questions and explanations** to strengthen your understanding of DBMS concepts.
- Use the explanations to connect theory with real-world applications.
- Ideal for **exam preparation** or **database fundamentals review**.

---
