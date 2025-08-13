# Chapter 8 – Priority Queues and Heaps (Java)

This README contains **15 quiz questions** from Chapter 8 of *Java Data Structures & Algorithms* along with their **answers** and **explanations**.

---

## Questions, Answers, and Explanations

### 1. Which method can we use to sort a priority queue by multiple elements?
**Answer:** `compareTo`  
**Explanation:**  
In Java, you can define multi-element sorting rules inside the `compareTo` method (from the `Comparable` interface). This method compares two objects and can check multiple fields in sequence (for example, severity first, then name). `PriorityQueue` uses this method by default for ordering if no custom `Comparator` is provided.

---

### 2. What is the default sort order for priority queues?
**Answer:** natural order  
**Explanation:**  
If no custom `Comparator` is provided, a `PriorityQueue` orders elements in their natural order. For numbers, this means ascending numeric order; for strings, lexicographic (alphabetical) order. The `compareTo` method from `Comparable` defines this natural order.

---

### 3. Which interface requires the compareTo method to be overridden?
**Answer:** `Comparable`  
**Explanation:**  
The `Comparable<T>` interface defines the `compareTo(T other)` method. A class implementing `Comparable` must override this method to specify its natural ordering, which allows it to be used in sorted collections and priority queues without a separate comparator.

---

### 4. Which statement is true?  
**Answer:** Regular queues use the first-in, first-out structure while priority queues remove elements based on priority.  
**Explanation:**  
A regular queue follows FIFO rules, removing elements in the order they were inserted. A priority queue instead removes the highest-priority element first, regardless of insertion order.

---

### 5. What does the remove method do in regard to priority queues?  
**Answer:** It removes the element with the highest priority from the queue.  
**Explanation:**  
Calling `remove()` with no arguments deletes the head element (the highest-priority element) from the queue. If the queue is empty, it throws a `NoSuchElementException`.

---

### 6. Which of the following statements is true about an unsorted list?  
**Answer:** Elements in an unsorted list are not stored in any particular order.  
**Explanation:**  
Unsorted lists do not enforce any ordering. When used for a priority queue, insertions are fast but finding the highest-priority element requires scanning the whole list.

---

### 7. What are the two types of heap data structure?  
**Answer:** Min-heap and Max-heap  
**Explanation:**  
A min-heap has the smallest value at the root, with each child greater than or equal to its parent. A max-heap has the largest value at the root, with each child less than or equal to its parent. Both must be complete binary trees.

---

### 8. Which of the following is an important property of heap data structure?  
**Answer:** Heap data structure does not require the right child to be greater than the left child.  
**Explanation:**  
A heap only enforces the heap property (min-heap or max-heap) relative to the parent-child relationship. The order between left and right children is irrelevant. This is different from a binary search tree.

---

### 9. What is the difference between 'merge' and 'meld' operations of the heap?  
**Answer:** Merge joins two heaps but preserves the originals; meld joins two heaps and destroys the originals.  
**Explanation:**  
Both operations combine elements of two heaps into one. `Merge` creates a new heap containing all elements while leaving the originals intact. `Meld` produces a single heap and discards the original heaps.

---

### 10. What type of data can a priority queue contain?  
**Answer:** any type of data  
**Explanation:**  
A `PriorityQueue` can hold any type as long as the elements are mutually comparable. This can be via implementing `Comparable` or by providing a custom `Comparator` at construction.

---

### 11. What is the compareTo method used for? Select the most complete answer.  
**Answer:** To compare the current object with another object to determine their ordering, returning a negative, zero, or positive value.  
**Explanation:**  
`compareTo` defines the natural ordering of objects. Negative means the current object is less than the other, zero means equal, and positive means greater. Priority queues use it to determine which element has higher priority.

---

### 12. What is natural order?  
**Answer:** A sort order such as numeric or alphabetic.  
**Explanation:**  
Natural order is the default way Java sorts elements, defined by their `compareTo` method. Numbers are sorted numerically; strings are sorted alphabetically.

---

### 13. Which method retrieves and removes the highest priority item of a priority queue?  
**Answer:** `poll()`  
**Explanation:**  
`poll()` returns and removes the head element (the highest-priority element) from the queue, or `null` if the queue is empty.

---

### 14. What method is used to populate a priority queue?  
**Answer:** `add()`  
**Explanation:**  
`add()` inserts a new element into the queue, positioning it according to its priority. `offer()` can also be used; it returns `false` instead of throwing an exception if the element cannot be inserted.

---

### 15. Which of the following is a property of max-heap?  
**Answer:** The value of the root element is the greatest of all other nodes in max-heap.  
**Explanation:**  
In a max-heap, the largest value is stored at the root. Each parent’s value is greater than or equal to its children, ensuring that removing the root always removes the maximum element.

