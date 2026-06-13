# Design & Modelling in Java

A collection of Design Principles, Design Patterns, and Object-Oriented Design concepts implemented in Java.

---

## 📌 Topics Covered

### Design Principles

* DRY (Don't Repeat Yourself)
* YAGNI (You Aren't Gonna Need It)
* KISS (Keep It Simple, Stupid)
* SOLID Principles

### SOLID Principles

* Single Responsibility Principle (SRP)
* Open Closed Principle (OCP)
* Liskov Substitution Principle (LSP)
* Interface Segregation Principle (ISP)
* Dependency Inversion Principle (DIP)

### Creational Design Patterns

* Singleton Pattern
* Factory Method Pattern
* Abstract Factory Pattern
* Builder Pattern

### Structural Design Patterns

* Adapter Pattern
* Decorator Pattern
* Facade Pattern

### Behavioral Design Patterns

* Observer Pattern
* Strategy Pattern
* Command Pattern

---

# DRY Principle

## Definition

Avoid code duplication by placing common logic in a single reusable location.

## Benefits

* Improved maintainability
* Reduced code duplication
* Easier updates and bug fixes

## Example

```java
class DiscountUtil {

    public static double calculateDiscount(double price) {
        return price * 0.10;
    }
}
```

---

# YAGNI Principle

## Definition

Implement only what is currently required.

## Benefits

* Less complexity
* Faster development
* Easier maintenance

## Example

```java
class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }
}
```

---

# SOLID Principles

## S - Single Responsibility Principle (SRP)

### Definition

A class should have only one reason to change.

### Example

```java
class StudentService {

    public void saveStudent() {
        System.out.println("Student Saved");
    }
}

class ReportService {

    public void generateReport() {
        System.out.println("Report Generated");
    }
}
```

---

## O - Open Closed Principle (OCP)

### Definition

Software entities should be open for extension but closed for modification.

### Example

```java
interface Payment {
    void pay();
}

class UpiPayment implements Payment {

    public void pay() {
        System.out.println("UPI Payment");
    }
}
```

---

## L - Liskov Substitution Principle (LSP)

### Definition

Derived classes should be replaceable by their base classes.

### Example

```java
class Bird {

    public void eat() {
        System.out.println("Bird Eating");
    }
}

class Sparrow extends Bird {
}
```

---

## I - Interface Segregation Principle (ISP)

### Definition

Clients should not be forced to implement methods they do not use.

### Example

```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}
```

---

## D - Dependency Inversion Principle (DIP)

### Definition

Depend on abstractions, not concrete implementations.

### Example

```java
interface Database {
    void connect();
}

class MySQLDatabase implements Database {

    public void connect() {
        System.out.println("Connected MySQL");
    }
}
```

---

# Project Structure

```text
src/
│
├── principles/
│   ├── DRY
│   ├── YAGNI
│   └── SOLID
│
├── creational/
│   ├── Singleton
│   ├── FactoryMethod
│   ├── AbstractFactory
│   └── Builder
│
├── structural/
│   ├── Adapter
│   ├── Decorator
│   └── Facade
│
└── behavioral/
    ├── Observer
    ├── Strategy
    └── Command
```

---

# Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Design Principles
* Design Patterns

---

# Learning Outcomes

By completing this repository, you will understand:

* Object-Oriented Design
* SOLID Principles
* DRY and YAGNI
* Creational Design Patterns
* Structural Design Patterns
* Behavioral Design Patterns
* Real-world Java Design Practices

---

# Author

Sakshi Singh

B.Tech Computer Science Engineering

Java | DSA | Design Patterns | System Design
