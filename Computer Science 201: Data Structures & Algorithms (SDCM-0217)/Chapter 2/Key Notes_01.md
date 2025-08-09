### Non-Static Inner Class

***Analogy***: Think of a `Car` that has an `Engine.` The engine only works as part of a specific car, so it makes sense to keep it inside the car class.

```java
public class Car {
    String brand = "Toyota";

    // Non-static inner class
    public class Engine {
        public void start() {
            System.out.println("Starting " + brand + "'s engine...");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine(); // Must use an instance of Car
        engine.start();
    }
}
```

---
### Output: 

```Starting Toyota's engine...```
- Think of a Car that has an Engine. The engine only works as part of a specific car, so it makes sense to keep it inside the car class.
- Must create an outer class instance first.
- Can directly access outer class variables (brand in this case).
