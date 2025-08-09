### Shadowing

***Analogy:*** If you have a school with a variable `students = 100`,
and inside a `Classroom` you also have `students = 25`,
when you say `students` in the classroom, you mean `25`, not `100`.

```java

public class School {
    int students = 100;

    public class Classroom {
        int students = 25;

        public void printStudents() {
            System.out.println("School students: " + School.this.students);
            System.out.println("Classroom students: " + this.students);
        }
    }

    public static void main(String[] args) {
        School school = new School();
        School.Classroom classroom = school.new Classroom();
        classroom.printStudents();
    }
}
```

---

## Output: 
`School students: 100
Classroom students: 25`

Key Points
- Inner variable shadows outer variable.

- Use `OuterClass.this.variableName` to refer to the outer one.
