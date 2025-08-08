# Chapter 2 – Object-Oriented Design Fundamentals (Java)

This README contains **15 practice questions** from Chapter 2 of *Object-Oriented Design Fundamentals* (Java, Data Structures & Algorithms) along with **answers** and **explanations**.

---

## Questions, Answers, and Explanations

### 1. Which variable **CANNOT** be used in the parent class of `Benefit`?

```java
public class Benefit {
    private String planCode;
    private double HIPAAcode;
}

public class HealthPlan extends Benefit {
    private int coverageOption;
    private float employeePremium;
}
```

**Answer:** `coverageOption` (also `employeePremium`)

* **Explanation:** A superclass cannot access subclass-specific fields. Variables declared in `HealthPlan` are invisible to `Benefit`.

---

### 2. Fill in the blank: Code that catches an exception and performs other code is called a(n) **\_\_\_\_\_**.

**Answer:** `exception handler`

* **Explanation:** Code inside a `catch` block is the exception handler — it responds to and manages thrown exceptions.

---

### 3. A parent class `SoftDrink` has a `brew()` method. `RootBeer` and `Beer` override it. Which OOP concept is this?

**Answer:** `polymorphism`

* **Explanation:** This is runtime polymorphism (method overriding) — the same method name has different behaviors in subclasses.

---

### 4. How do you correctly create an instance of both `Product` and its non-static inner class `ProductDetail`?

```java
public class Product {
    public class ProductDetail { }
}
```

**Answer:**

```java
Product product = new Product();
Product.ProductDetail detail = product.new ProductDetail();
```

* **Explanation:** Non-static inner classes require an instance of the outer class to be created.

---

### 5. Which Java construct is commonly used to create abstract data types?

**Answer:** `interfaces`

* **Explanation:** Interfaces define *what* an ADT should do without specifying *how*, matching the ADT concept.

---

### 6. What best describes abstraction?

**Answer:** `Running functions without knowing the code`

* **Explanation:** Abstraction hides the internal implementation, letting you focus on what an object does.

---

### 7. Fill in the blank: Sally is writing code for a vehicle with attributes and methods. To do this, she needs to create a **\_\_\_\_\_** for vehicles.

**Answer:** `class`

* **Explanation:** A class is the blueprint for objects with defined attributes and behaviors.

---

### 8. Fill in the blank: Java doesn't allow **\_\_\_\_\_**, meaning one class cannot inherit from more than one parent class.

**Answer:** `multiple inheritance`

* **Explanation:** Java allows only single inheritance for classes to avoid ambiguity (diamond problem).

---

### 9. Output of the following code?

```java
public class Foo {
    int number = 3;
    int add(int number) {
        return this.number + 6;
    }
    static class Bar {
        int add(int number) {
            return number + 1;
        }
    }
    public static void main(String[] args) {
        Foo.Bar bar = new Foo.Bar();
        System.out.println("The number is " + bar.add(4));
    }
}
```

**Answer:** `The number is 5`

* **Explanation:** `bar.add(4)` in `Bar` returns `4 + 1`.

---

### 10. Which phrase accurately describes the relationship between subclass `BlueChip` and parent `Stock`?

**Answer:** `BlueChip is a Stock`

* **Explanation:** Inheritance creates an *is-a* relationship — a `BlueChip` object is also a `Stock` object.

---

### 11. Java keeps a list of exceptions and will know what exception has occurred. Where are these stored?

**Answer:** `exception class`

* **Explanation:** Java’s exception hierarchy contains predefined exception classes used by the JVM to identify errors.

---

### 12. Fill in the blank: You are designing a program for vehicles. Some of the class names include `Semi`, `Compact`, and `SUV`. If we create a new semi, it is said that the semi is a(n) **\_\_\_\_\_** of a(n) **\_\_\_\_\_**.

**Answer:** `instance, semi class`

* **Explanation:** An instance is a specific object of a given class.

---

### 13. In the following code, what is the name of the inner class?

```java
public class Periodical {
    long ISBN;
    public class Book {
        public long getISBN() {
            return ISBN;
        }
    }
}
```

**Answer:** `Book`

* **Explanation:** `Book` is a non-static inner class inside `Periodical`.

---

### 14. What keyword is used when creating a class that uses an interface?

**Answer:** `implements`

* **Explanation:** The `implements` keyword signals that a class will provide definitions for all interface methods.

---

### 15. Which of the following violates representational independence in an ADT?

**Answer:** `a deck data type having a coin flip method`

* **Explanation:** The method is unrelated to a deck’s purpose, mixing in unrelated behavior.

---

## Usage

This document can be used as a **study guide** or **reference** for understanding Java OOP fundamentals and common exam/training questions.
