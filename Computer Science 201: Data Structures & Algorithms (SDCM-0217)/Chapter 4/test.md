# Quiz 4 – Analyzing Algorithms (Computer Science DSA – Study.com)

This README contains **15 practice questions** from the “Analyzing Algorithms” chapter test, along with their **correct answers** and **detailed explanations** for study and review.

---

## Questions, Answers, and Explanations

### 1. In algorithm analysis, space complexity describes _____.
**Answer:** `the total memory space consumed` ✅  
**Explanation:** Space complexity refers to the total amount of memory an algorithm needs to run to completion. This includes memory for variables, data structures, function calls, and any temporary storage, but not execution time.

---

### 2. In loop variants, the relationship between the variables _____.
**Answer:** `changes upon each iteration` ✅  
**Explanation:** Loop variant variables update each time the loop executes, ensuring that the algorithm progresses toward termination and avoids infinite loops.

---

### 3. The ingredients in an algorithm are called:
**Answer:** `inputs` ✅  
**Explanation:** The “ingredients” of an algorithm are its inputs — the data or values provided so the algorithm can process and produce outputs.

---

### 4. An algorithm is written down as:
**Answer:** `a list of steps` ✅  
**Explanation:** Algorithms are expressed as ordered sequences of steps that describe exactly how to solve a problem or perform a task.

---

### 5. For a linear function, what would be its time complexity?
**Answer:** `O(N)` ✅  
**Explanation:** A linear function’s runtime grows proportionally with input size \( N \), meaning doubling the input roughly doubles the runtime.

---

### 6. If an algorithm runs in quadratic time, what is its time complexity using Big-O?
**Answer:** `O(N²)` ✅  
**Explanation:** Quadratic time complexity means the runtime grows with the square of the input size. Doubling \( N \) increases runtime about fourfold.

---

### 7. Which of the following would result in an exponential Big-O complexity?
**Answer:** `fibonacci sequence` ✅  
**Explanation:** A naive recursive Fibonacci implementation without memoization grows exponentially \( O(2^N) \) because each call spawns two new calls.

---

### 8. Of the following, which is the least efficient algorithm?
**Answer:** `bubble sort` ✅  
**Explanation:** Bubble sort is inefficient with \( O(N^2) \) performance, especially compared to algorithms like binary search \( O(\log N) \) or constant-time operations \( O(1) \).

---

### 9. An algorithm tests the air pressure on a slope at different altitudes. Given that the pressure depends on the altitude, what is the optimal algorithmic function to use?
**Answer:** `linear` ✅  
**Explanation:** If pressure changes directly and proportionally with altitude (or can be approximated as such), a linear function is the simplest and most efficient choice.

---

### 10. Out of a random bunch of last year's holiday greeting cards, Clara wants to find the one her mother sent her. The optimal algorithm to use will be _____.
**Answer:** `Linear` ✅  
**Explanation:** In an unsorted collection, the only option is to check each card sequentially, which is a linear search \( O(N) \).

---

### 11. If f(n) is the function then O(f(n)) = { g(n) : there exists c > 0 and n0 such that f(n) ≤ c.g(n) for all n > n0. } is true for which of the following asymptotic notations?
**Answer:** `Big Oh` ✅  
**Explanation:** This is the formal definition of Big-O notation, which gives an **upper bound** on the growth rate of a function beyond some threshold \( n_0 \).

---

### 12. An experimental analysis depends on the _____ results, so an algorithm cannot be measured unless an _____ is implemented.
**Answer:** `output; equivalent program` ✅  
**Explanation:** Experimental analysis requires a working implementation (equivalent program) to produce outputs and measure performance.

---

### 13. Contrapositive and contradiction fall under which category of algorithm analysis?
**Answer:** `contra attack` ✅  
**Explanation:** In this quiz’s terminology, contrapositive and contradiction are grouped under “contra attack” — logical proof methods applied to algorithm analysis.

---

### 14. Instead of a list of steps, algorithms can be written using:
**Answer:** `flowcharts with arrows to illustrate the journey` ✅  
**Explanation:** Flowcharts visually represent the steps in an algorithm and use arrows to show the flow of control, making the logic easier to follow.

---

### 15. What is the time complexity of the following code?
```java
i = 0;
while (i < n) { 
    j = i;
    while (j < n && j < i + 5) { 
        /* code */
        j++;
    }
    i = j;
}
```
**Answer:** `O(N)`
