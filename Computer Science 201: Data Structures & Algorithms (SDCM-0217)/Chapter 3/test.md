# Chapter 3 – Core Data Structures (Java)

This README contains **15 practice questions** from *Core Data Structures* (Java, Data Structures & Algorithms) along with **answers** and **explanations**.

---

## Questions, Answers, and Explanations

### 1. What is Range sorting?
**Answer:** it is used when only need some part of an array is sorted  
**Explanation:** Range sorting refers to sorting only a specified portion of an array rather than the entire array. For example, sorting elements from index 5 to 15 while leaving others untouched can save time when you only need a subset ordered.

---

### 2. In a singly linked list, the tail node points to what?
**Answer:** null  
**Explanation:** The tail node is the last node in a singly linked list, so it has no `next` node. Its reference is set to `null`.

---

### 3. Which of the following correctly appends a new value specifically to the tail of the linked list?
**Answer:** `l.addLast("K");`  
**Explanation:** In Java’s `LinkedList`, `addLast()` explicitly appends to the end (tail). While `add()` without an index also appends by default, `addLast()` makes the intention clear.

---

### 4. What type of an array is this? `char[] enterCustomerName;`
**Answer:** character  
**Explanation:** The `char[]` type is an array of characters, often used to store strings or manipulate characters individually.

---

### 5. If you had a Java class called `myDll`, how would you create a new doubly linked list instance?
**Answer:** `myDll dll = new myDll();`  
**Explanation:** The `new` keyword calls the constructor of `myDll` to create a new instance and assigns it to the variable `dll`.

---

### 6. The number that references the row/column in a multidimensional array is called a(n) _____
**Answer:** index  
**Explanation:** Indices specify the position of elements in multidimensional arrays, such as `[row][column]`.

---

### 7. When you add a new element to the tail of a circularly linked list, what is true of the current tail?
**Answer:** it connects to the head  
**Explanation:** In a circular linked list, the tail node’s `next` points to the head node, maintaining a circular structure.

---

### 8. What is the result of executing the provided `Arrays.equal` program?
**Answer:** it throws an error on the line where the 2 arrays are being compared because the s is missing on Array.equals  
**Explanation:** The correct method is `Arrays.equals(...)`. Using `Arrays.equal` causes a compile-time error due to the method not existing.

---

### 9. If a program needed to create a copy of an array with new references to an object, what type of copy would be performed?
**Answer:** deep copy  
**Explanation:** A deep copy duplicates the array and also creates new instances of each object, ensuring no shared references with the original.

---

### 10. How does Insertion-Sort work?
**Answer:** finding if each item is in the right position of the array according to the criteria  
**Explanation:** Insertion sort builds a sorted portion of the array one element at a time by placing each element into its correct position relative to the already sorted elements.

---

### 11. When compared to an array, why is a linked list less efficient?
**Answer:** you need to traverse each node  
**Explanation:** Linked lists do not provide direct access by index, requiring O(n) traversal to reach specific elements.

---

### 12. When would it be most appropriate to create a linked list in Java?
**Answer:** storing elements in a dynamic array  
**Explanation:** Linked lists are suited for collections where the size changes frequently and insertions/deletions are common.

---

### 13. Give an example of the correct way to declare and fill an int array.
**Answer:**
```java
int[] numbers = {1, 2, 3, 4, 5};
