# Getting into Practice – Java OOP & Exceptions

---

## 📘 OOP in Java – Loubna Aminou (2025/2026)

---

## 🟢 Exercice 1: Simulate the `ls` command

**Goal:** Simulate the Linux `ls` command using Java. The program lists files and directories of a given path.

**Requirements:**

- User enters a directory path
- Display:
  - `<DIR>` for directories
  - `<FILE>` for files
  - Permissions:
    - `r` → readable
    - `w` → writable
    - `h` → hidden

**Example output:**

```
..\\xampp\\htdocs\\tp1\\index.php <FILE> rw-
..\\xampp\\htdocs\\tp1\\images <DIR> rw-
```

### ✅ Solution (Java)

```java
import java.io.File;
import java.util.Scanner;

public class LsSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory");
            return;
        }

        for (File f : dir.listFiles()) {
            System.out.print(f.getAbsolutePath() + " ");
            System.out.print(f.isDirectory() ? "<DIR> " : "<FILE> ");
            System.out.print(f.canRead() ? "r" : "-");
            System.out.print(f.canWrite() ? "w" : "-");
            System.out.println(f.isHidden() ? "h" : "-");
        }
    }
}
```

---

## 🟢 Exercise 2: Object Serialization (`products.dat`)

**Goal:** Save and load a list of `Product` objects using Java serialization.

### ✅ Product class

```java
import java.io.Serializable;

public class Product implements Serializable {
    private long id;
    private String name, brand, description;
    private double price;
    private int stock;

    public Product(long id, String name, String brand, double price, String description, int stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    public long getId() { return id; }

    public String toString() {
        return id + " | " + name + " | " + brand + " | " + price + " | " + stock;
    }
}
```

### ✅ IProduitMetier Interface

```java
import java.util.List;

public interface IProduitMetier {
    void add(Product p);
    List<Product> getAll();
    Product findById(long id);
    void delete(long id);
    void saveAll();
}
```

### ✅ MetierProduitImpl

```java
import java.io.*;
import java.util.*;

public class MetierProduitImpl implements IProduitMetier {
    private List<Product> products = new ArrayList<>();
    private String fileName;

    public MetierProduitImpl(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            products = (List<Product>) ois.readObject();
        } catch (Exception e) {
            products = new ArrayList<>();
        }
    }

    public void add(Product p) { products.add(p); }
    public List<Product> getAll() { return products; }

    public Product findById(long id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }

    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Save error");
        }
    }
}
```

---

## 🟢 Handling Exceptions – Calculator

### ✅ Calculator class

```java
public class Calculator {
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero not possible.");
            return 0;
        }
        return a / b;
    }

    public static int convertToNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + text + "' is not a valid number");
            return 0;
        }
    }

    public static double calculate(char op, double a, double b) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return divide(a, b);
            default:
                System.out.println("Error: Operation '" + op + "' not supported");
                return 0;
        }
    }
}
```

---

## 🟢 Custom Exception – Vehicle Speed

### ✅ TooFastException

```java
public class TooFastException extends Exception {
    public TooFastException(int speed) {
        super("This is an exception of type TooFastException. Speed involved: " + speed);
    }
}
```

### ✅ Vehicle class (with main)

```java
public class Vehicle {

    public Vehicle() {}

    public void testSpeed(int speed) throws TooFastException {
        if (speed > 90) {
            throw new TooFastException(speed);
        }
        System.out.println("Speed OK: " + speed);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        try {
            v.testSpeed(70);
            v.testSpeed(120);
        } catch (TooFastException e) {
            e.printStackTrace();
        }
    }
}
```

---

## ✅ End of Practice

Good luck 🍀 — This README can be used directly in GitHub or a project folder.

