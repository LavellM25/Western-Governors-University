1. Examine the following code. Which variable CANNOT be used in the parent class of Benefit?

java
Copy
Edit
public class Benefit {
    private String planCode;
    private double HIPAAcode;
}

public class HealthPlan extends Benefit {
    private int coverageOption;
    private float employeePremium;
}
Answer: coverageOption (also employeePremium)
Explanation: A superclass (Benefit) cannot access subclass (HealthPlan) members, because the superclass has no knowledge of them. Variables declared in HealthPlan are unique to that class and are not visible to Benefit.

2. Fill in the blank: Code that catches an exception and performs other code is called a(n) _____.
Answer: exception handler
Explanation: In Java, code inside a catch block is an exception handler. It responds to a thrown exception by handling it (logging, recovery actions, etc.).

3. A parent class called SoftDrink has a brew() method. RootBeer and Beer classes inherit from SoftDrink. Each uses the brew() method differently. Which aspect of OOP does this best describe?
Answer: polymorphism
Explanation: This is runtime polymorphism (method overriding). Each subclass has its own implementation of the same method, and the actual method called depends on the object type at runtime.

4. Examine the following code: Which of the following correctly creates an instance of both the Product and the ProductDetail (non-static inner) class?

java
Copy
Edit
public class Product {
    public class ProductDetail { }
}
Answer:

java
Copy
Edit
Product product = new Product();
Product.ProductDetail detail = product.new ProductDetail();
Explanation: Non-static inner classes require an instance of their outer class. The syntax outer.new Inner() associates the inner instance with a specific outer instance.

5. Which Java language construct is commonly used to create abstract data types?
Answer: interfaces
Explanation: Interfaces define what methods a class must implement without specifying how. This matches the idea of an abstract data type (ADT), which focuses on behavior, not implementation.

6. What best describes abstraction?
Answer: Running functions without knowing the code
Explanation: Abstraction means you work with an object through its public interface without knowing its internal workings. You know what it does, not how it does it.

7. Fill in the blank: Sally is writing code for a vehicle that has attributes (manufacturer, color, price) and methods (start, drive, park). To do this, she needs to create a _____ for vehicles.
Answer: class
Explanation: A class is the blueprint for creating objects with those attributes and behaviors.

8. Fill in the blank: Java doesn't allow _____, meaning one class cannot inherit from more than one parent class.
Answer: multiple inheritance
Explanation: Java supports single inheritance to avoid ambiguity (diamond problem). Multiple inheritance of classes is not allowed, but multiple interface implementation is allowed.

9. What is the output of this code?

java
Copy
Edit
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
Answer: The number is 5
Explanation: The Bar class’s add method takes the passed number (4) and returns 4 + 1.

10. Which phrase accurately describes the relationship between the subclass BlueChip and the parent Stock?
Answer: BlueChip is a Stock
Explanation: Inheritance creates an is-a relationship. A BlueChip object is also a Stock object.

11. Java keeps a list of exceptions and will know what exception has occurred. Where are these stored?
Answer: exception class
Explanation: Java has a hierarchy of exception classes in its API. The JVM matches thrown exceptions against these classes to determine type and handling.

12. Fill in the blank: You are designing a program for vehicles. Some of the class names include Semi, Compact, and SUV. If we create a new semi, it is said that the semi is a(n) _____ of a(n) _____.
Answer: instance, semi class
Explanation: An instance is a specific object created from a class. Here, a new semi is an instance of the Semi class.

13. In the following code, what is the name of the inner class?

java
Copy
Edit
public class Periodical {
    long ISBN;
    public class Book {
        public long getISBN() {
            return ISBN;
        }
    }
}
Answer: Book
Explanation: Book is the non-static inner class inside Periodical.

14. What keyword is used when creating a class that uses an interface?
Answer: implements
Explanation: The implements keyword tells Java the class will provide method definitions for all methods in the interface.

15. Which of the following would violate representational independence in an abstract data type?
Answer: a deck data type having a coin flip method
Explanation: Representational independence means methods should be relevant to the ADT’s intended purpose. Coin flipping has nothing to do with a deck’s core operations, so it breaks that principle.


