### Static Nested Class

***Analogy:*** Think of a `Computer` with a `Specifications` class.
Specs are general for the model and `don’t depend on a specific computer instance.`

---

**Code:**

```java

public class Computer {

    // Static nested class
    public static class Specifications {
        public void showSpecs() {
            System.out.println("16GB RAM, 512GB SSD");
        }
    }

    public static void main(String[] args) {
        Computer.Specifications specs = new Computer.Specifications();
        specs.showSpecs();
    }
}
```

Output: `16GB RAM, 512GB SSD`
