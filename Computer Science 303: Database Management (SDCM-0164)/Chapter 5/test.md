# Chapter 5 – Database Design Processes

---

## 1. In the following table (artist), which fields have a transitive dependency?

**Table:**  
| artistID | artistName | countryCode | genreCode | dateAdded |

**Answer:** `countryCode` and `genreCode`

**Explanation:**  
A transitive dependency exists when a non-key attribute depends on another non-key attribute instead of directly on the primary key. In this case:
- `countryCode` can determine additional country details.
- `genreCode` can determine additional genre details.  
Both depend on `artistID` but also determine other data, making them transitive dependencies.

---

## 2. Which of the following statements is true about an attribute?

**Answer:** An attribute describes some aspect of an entity and is represented as a column in a table.

**Explanation:**  
An **attribute** is a property or characteristic of an entity (e.g., `artistName`, `countryCode`). In a database table, attributes are represented as columns that store specific types of data for each row.

---

## 3. Which of the following would be a good choice for data found in a primary key?

**Answer:** A system-generated unique ID, such as `artistID` or a customer account number.

**Explanation:**  
Primary keys must:
- Be unique
- Never change
- Always be present (not null)  
System-generated IDs meet these requirements, unlike phone numbers or emails that can change.

---

## 4. Reducing redundancy, complexity, and table size is part of the _____ process in database administration.

**Answer:** normalization

**Explanation:**  
**Normalization** organizes data into well-structured tables to:
- Reduce redundancy
- Minimize complexity
- Improve storage efficiency and data integrity  
This is achieved through normal forms (1NF, 2NF, 3NF, etc.).

---

## 5. What is the main purpose of a database index?

**Answer:** To improve the speed of data retrieval.

**Explanation:**  
A **database index** allows the DBMS to quickly locate rows without scanning the entire table, similar to a book’s index. It speeds up SELECT queries but can slow down data modification operations due to index updates.

---

## 6. The basic database element is the _____.

**Answer:** table

**Explanation:**  
The **table** is the fundamental element of a database:
- Stores rows (records) of related data.
- Each row contains fields (columns) where data is stored.
- Field attributes define data types and rules (e.g., constraints, key definitions).

---

## 7. In the following class diagram, what are the items that have double parentheses, such as `setSpecies()`, called?

**Answer:** methods

**Explanation:**  
In UML or database-related diagrams, items with parentheses are **methods** (operations).  
- Methods define actions or behaviors for the entity/class.  
- Fields (attributes) are shown without parentheses.

---

## 8. The normal form in DBMS that does not preserve partial attribute dependencies is:

**Answer:** Second Normal Form (2NF)

**Explanation:**  
2NF removes **partial dependencies** where a non-key attribute depends on only part of a composite primary key. This ensures all non-key attributes depend on the whole primary key.

---

## 9. Which of the following is the lowest design level (the least detail) for an ERD?

**Answer:** conceptual level

**Explanation:**  
ERDs can be:
- **Conceptual:** High-level, entities and relationships only (least detail)
- **Logical:** Includes attributes, keys, relationships (DBMS-independent)
- **Physical:** Full implementation details for a specific DBMS

---

## 10. Based on the tables below, how should the tables be related?

**Answer:** `tblCustomer` to `tblOrders` and `tblProducts` to `tblOrders`

**Explanation:**  
- **Customer → Orders:** One-to-many (a customer can place multiple orders).  
- **Products → Orders:** Often part of a many-to-many relationship resolved by an order details table.

---

## 11. Can the third normal form go too far?

**Answer:** Yes

**Explanation:**  
While 3NF removes transitive dependencies and improves data integrity, over-normalization can split data into too many tables, making queries complex and slower due to excessive JOINs. Designers may denormalize for performance in some cases.

---

## 12. We are developing a sales database. Customer orders are represented in invoices. Invoices can be comprised of one or more products. How would you define the relationship between the customer, orders, and products?

**Answer:**  
- Customer to Orders: One-to-many  
- Orders to Products: Many-to-many (via a junction table like `OrderDetails`)

**Explanation:**  
- A customer can have many invoices.  
- An invoice can include multiple products, and products can appear on multiple invoices.  
This requires a junction table to track product quantities, prices, etc.

---

## 13. Which of the following is not an essential component of the database table?

**Answer:** relationship

**Explanation:**  
A table’s essential components are:
- Fields (columns)
- Records (rows)
- Primary key  
**Relationships** exist between tables, not within a single table.

---

## 14. Which table is in first normal form (1NF)?

**Answer:**  ID Customer State Website
1025 Jane Doe AZ shop.com

**Explanation:**  
This table meets 1NF because:
- Each field contains atomic values.
- No repeating groups.
- Each row is unique (identified by `ID`).

---

## 15. Where is information stored in a clustered index?

**Answer:** The information is physically stored in the index.

**Explanation:**  
A clustered index stores data rows directly within the index structure, ordering them by the index key. This contrasts with non-clustered indexes, which store pointers to data instead.


