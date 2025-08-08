# 📚 Java Logical Frameworks – Data Structures & Algorithms  
**Chapter Test Study Sheet**  
*Course: Computer Science 201*

This study guide contains 15 questions with answers and explanations from the chapter test.  
Use it to review Java basics, loops, pseudocode, and IDE features.

---

## 1. Which pseudocode is appropriate to compute the area of a triangle?
**Answer:**
```java
START
INPUT base
INPUT height
area ← 0.5 * base * height
OUTPUT "Area of the triangle is", area
END
```

Copy
**Why:** Follows the correct formula `area = 0.5 × base × height` and includes inputs, calculation, and output.

---

## 2. Fill in the blank  
**Question:** The main method declaration contains the keyword void to indicate the main method _____ returns a value.  
**Answer:** `never`  
**Why:** `void` means the method does not return anything.

---

## 3. How is a single-line comment created in Java?  
**Answer:**
```java
// This is a single-line comment
Why: // tells the compiler to ignore everything on that line. Two forward slashes
```

---

## 4. Which is NOT a typical component of an IDE?

**Answer:** `grammar checking`.
**Why: Grammar checking applies to human language, not programming syntax.**

---

## 5. Which is the parameter in the main method?
**Answer:** ```java String[] args```

* **Why:** Stores command-line arguments passed to the program.

---

## 6. What will be the result of this code?
```java

int j = 0;
while (j < 1000) {
    j = j - 1;
}
```
* **Answer:** Infinite loop
* **Why:** `j decreases forever, so j < 1000 is always true.`

---

## 7. A Java statement can be thought of as which one?
* **Answer:** instruction
* **Why:** `A statement tells the computer to perform a specific action.`

---

## 8. How to get the number of strings in args?
* **Answer:** ``` args.length```
* **Why:** `.length gives the size of an array.`

---

## 9. Example of a multi-line comment:
Answer:

java
Always show details

Copy
/*
 This is a multi-line comment.
 It can span several lines.
*/
Why: Everything between /* and */ is ignored by the compiler.

---

## 10. How does a debugger in an IDE help?
Answer: Lets you pause execution, inspect variables, step through code, and find logic errors.
Why: Improves debugging accuracy and efficiency.


---

## 11. What does this method return?
java
Always show details

Copy
public void subtractNumbers(int m, int n) {
    System.out.println(p);
    p = m - n;
}
Answer: Nothing (void)
Why: void methods don’t return values, they only perform actions.

---

## 12. Fill in the blank
Question: A while loop is considered _____ if you don't know when the condition will be true.
Answer: indefinite
Why: Runs until the condition is met, but iterations are unknown in advance.

---

## 13. Single-line comment effect
Answer: Creates a note in code ignored by the compiler.
Why: Useful for documentation without affecting execution.

---

## 14. Purpose of main method’s parameter
Answer: Holds command-line arguments.
Why: Enables passing data into the program at runtime.

---

## 15. Why is grammar checking not part of an IDE?
Answer: It checks human language, not programming language syntax.
Why: IDEs focus on code correctness, not English grammar.



