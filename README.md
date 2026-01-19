## 📘 TP Java – Input / Output & Exception Handling

This practical work focuses on strengthening fundamental Java skills related to **Input/Output**, **object serialization**, and **exception handling** through a set of structured exercises.

---

## 🟦 PART 1: Practice with Input / Output

### 🔹 Exercise 1: Simulating the `ls` Command

#### 🧩 Problem Description

The objective of this exercise is to create a Java program that **simulates the Linux `ls` command**.

The program must:

- Ask the user to enter the **absolute path of a directory**
- Display all files and subdirectories contained in the given directory
- Indicate for each element:
  - `<DIR>` if it is a directory
  - `<FILE>` if it is a file
  - Access permissions:
    - `r` → readable
    - `w` → writable
    - `h` → hidden

#### 💡 Solution Overview

This solution relies on the `java.io.File` class to explore directory content and retrieve file properties using built-in methods such as `isDirectory()`, `canRead()`, and `isHidden()`.

#### ▶️ Program Execution

<img width="1188" height="527" alt="Program execution - ls simulation" src="https://github.com/user-attachments/assets/c3c9c2a2-a1ae-4c2a-b68f-bde95bbcc796" />

---

## 🟩 PART 2: Object Serialization – `products.dat`

### 🔹 Exercise 2: Product Management System

#### 🧩 Problem Description

This exercise involves developing a Java application that **manages a list of products** and **persists data using object serialization**.

Each product is defined by the following attributes:

- id
- name
- brand
- price
- description
- quantity in stock

The application provides a menu allowing the user to:

1. Display all products
2. Search for a product by its ID
3. Add a new product
4. Delete a product by its ID
5. Save products to `products.dat`
6. Exit the application

#### 💡 Solution Overview

Serialization is implemented using `ObjectOutputStream` and `ObjectInputStream`. The design follows object-oriented principles using interfaces and implementation classes.

#### ▶️ Program Execution

<img width="917" height="256" alt="Product management execution" src="https://github.com/user-attachments/assets/2934c11d-e7a7-4b97-835b-3e1067639a6d" />

---

## 🟨 PART 3: Exception Handling Practice

### 🔹 Exercise 1: Calculator Error Handling

#### 🧩 Problem Description

Create a `Calculator` class capable of:

- Performing arithmetic operations (`+`, `-`, `*`, `/`)
- Handling division by zero
- Converting string inputs into numbers

The program must display **clear and user-friendly error messages** when exceptions occur.

#### 💡 Solution Overview

The solution uses `try / catch` blocks to handle `ArithmeticException` and `NumberFormatException`, ensuring safe and robust execution.

#### ▶️ Program Execution

<img width="735" height="382" alt="Calculator execution" src="https://github.com/user-attachments/assets/ae35a8f7-861c-4d64-bb59-e79e2e2f61af" />

---

### 🔹 Exercise 2: Custom Exception – `TooFastException`

#### 🧩 Problem Description

Create a custom exception named `TooFastException`, which is thrown when a vehicle exceeds a speed of **90 km/h**.

#### 💡 Solution Overview

- Define a custom exception class extending `Exception`
- Implement a `Vehicle` class with a speed-checking method
- Throw the exception when the speed limit is exceeded
- Display the stack trace for debugging purposes

#### ▶️ Program Execution

<img width="1347" height="197" alt="TooFastException execution" src="https://github.com/user-attachments/assets/8ce80f52-3e12-495d-bd15-aa8269a37f19" />

---

## ✅ Conclusion

This TP provided hands-on experience with Java file handling, serialization, and exception management, while reinforcing clean code structure and object-oriented design principles.

**Academic Year:** 2025–2026

