# Chapter 3 – Database Fundamentals (Study.com)

---

## Questions, Answers, and Explanations

### 1. What, at its core, does a relational database allow?
**Answer:** `data to be linked to other tables by relationships in the data`  
**Explanation:** A relational database stores data in multiple tables that can be linked using primary keys and foreign keys. This connection allows efficient organization, reduces redundancy, and enables complex queries.

---

### 2. Why is a relational database useful in government intelligence?
**Answer:** `limit who can see what information`  
**Explanation:** Relational databases support granular access control, letting administrators control who can view or modify certain tables, fields, or records. In government intelligence, this ensures classified data is only available to authorized personnel.

---

### 3. When normalizing data, what statement describes an accurate step to take?
**Answer:** `each tuple is reliant only on a primary key`  
**Explanation:** Normalization ensures each row (tuple) is uniquely identified by the primary key and that all non-key attributes depend solely on that key. This removes redundancy and improves data integrity.

---

### 4. Each database row must have which of the following?
**Answer:** `key`  
**Explanation:** Every row must have a unique identifier, typically a primary key, to allow accurate retrieval, updates, and deletion without confusion.

---

### 5. Ultimately, what is at the 'top' of a hierarchical database?
**Answer:** `a single parent table`  
**Explanation:** A hierarchical database uses a tree structure with a single root or parent record at the top. All other records branch downward as children.

---

### 6. How many child records or tables can a parent table have?
**Answer:** `unlimited`  
**Explanation:** In a hierarchical database, a parent can have any number of children. The only restriction is that each child has exactly one parent.

---

### 7. I have a flat-file table with seven records for a customer. Her name changes. How do I update the data?
**Answer:** `fix each record`  
**Explanation:** Flat-file systems store all data in one table without relationships. If the same value appears in multiple records, each occurrence must be updated manually.

---

### 8. Flat-file databases can become _____.
**Answer:** `all are correct`  
**Explanation:** Flat-file databases can be complicated, unwieldy, and huge due to redundancy and difficulty managing large amounts of repetitive data.

---

### 9. A field in a database table whose values are the same as the primary key of another table is called:
**Answer:** `a foreign key`  
**Explanation:** A foreign key links a field in one table to the primary key of another table, establishing a relationship between them and ensuring referential integrity.

---

### 10. _____ refers to how many records in a table are related to the number of records in another table.
**Answer:** `cardinality`  
**Explanation:** Cardinality describes the numerical relationship between rows in two tables, such as one-to-one, one-to-many, or many-to-many.

---

### 11. How many tables are in a given hierarchical database?
**Answer:** `as many as you need`  
**Explanation:** A hierarchical database can have as many record types (similar to tables) as required. The structure is tree-based, but the number of record types depends on the design.

---

### 12. Which of these is most like a hierarchical database?
**Answer:** `family tree`  
**Explanation:** A family tree mirrors the hierarchical model, with a single root and branching parent-child relationships.

---

### 13. Which of the following statements is false with respect to distributed databases?
**Answer:** `data at any site is only available to users that are at site`  
**Explanation:** Distributed databases allow data stored at one site to be accessed from other locations over the network. The DBMS hides the complexity so users may not even realize data is coming from multiple sites.

---

### 14. Where is a multi-user database typically located?
**Answer:** `on a server`  
**Explanation:** Multi-user databases are stored on a server so multiple users can access them simultaneously over a network, with the DBMS managing concurrent operations.

---

### 15. What would a company most likely use a relational database for?
**Answer:** `managing customer and sales information`  
**Explanation:** Relational databases are ideal for linking and managing related data such as customer profiles, sales transactions, and inventory, enabling efficient updates and analysis.

---

## Summary
This set of questions covers:
- Relational databases and their advantages  
- Normalization principles  
- Flat-file vs. hierarchical vs. distributed databases  
- Keys, cardinality, and database design principles  
- Real-world applications in business and government  

These concepts are essential for understanding how databases store, organize, and protect data.

