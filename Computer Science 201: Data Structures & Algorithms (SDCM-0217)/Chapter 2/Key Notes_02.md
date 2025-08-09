### Local Class

***Analogy:***
Inside a restaurant's `kitchen method` `(prepareMeal()),` you might create a `MealTicket `class that exists only while preparing a meal. It doesn’t exist outside.

```java

public class Restaurant {

    public void prepareMeal() {
        String mealName = "Pasta";

        // Local class inside a method
        class MealTicket {
            public void printTicket() {
                System.out.println("Meal Ticket: " + mealName);
            }
        }

        MealTicket ticket = new MealTicket();
        ticket.printTicket();
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.prepareMeal();
    }
}
```
---

### Output: 
```Meal Ticket: Pasta```

**Key Points:**
- Defined inside a method, not at the class level.

- Exists only inside that method.

- Can access local variables (mealName) if they are effectively final.

