# Trrying code

```sql
SELECT Customers.CustomerName, Orders.OrderID, Orders.OrderDate, Orders.TotalAmount
FROM Customers
INNER JOIN Orders
ON Customers.CustomerID = Orders.CustomerID
WHERE Orders.TotalAmount > 100
ORDER BY Orders.OrderDate DESC;
```

```java
import java.util.ArrayList;
import java.util.Scanner;

// Student class with fields for storing student details
class Student {
    private int id;
    private String name;
    private int age;
    private String course;

public Student(int id, String name, int age, String course) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.course = course;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getCourse() {
    return course;
}

public void setCourse(String course) {
    this.course = course;
}

@Override
public String toString() {
    return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Course: " + course;
}

}

// Main class to handle the student system
public class StudentManagementSystem {
    // ArrayList to store students
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);``

public static void main(String[] args) {
    while (true) {
        System.out.println("\n*** Student Management System *



```
