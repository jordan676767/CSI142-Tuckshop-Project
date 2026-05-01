 Tuckshop Inventory System (CSI142 Mini Project)

 Project Overview
This is a Java console-based tuckshop management system developed for the CSI142 Object-Oriented Programming mini project.  

The system allows users to manage products, record sales, and view inventory and sales reports through a simple menu-driven interface.

The project demonstrates key OOP principles such as:
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
- Composition
- Use of Collections (ArrayList)

---

 Features

The system provides the following functionality:

1. Add new products to inventory  
2. View all available products  
3. Buy products (reduces stock and records sales)  
4. View all sales records  
5. Continuous menu system until exit  
6. Input validation and error handling  

---
 Object-Oriented Design

Key Classes:
- `Product` → Represents items in the tuckshop
- `Sale` → Represents a completed transaction
- `Item` → Superclass for shared product properties
- `Inventory` → Handles product management and purchasing
- `Sales` → Stores and displays sales records
- `Menu` → Displays system menu
- `Main` → Runs the application

 OOP Concepts Used:
- **Inheritance** → `Product extends Item`
- **Abstraction** → `Displayable` interface
- **Polymorphism** → Objects handled through "Displayable`
- **Encapsulation** → Private fields with getters/setters
- **Composition** → Inventory contains Products, Sales contains Sale records

---

 How to Compile and Run

javac app/*.java model/*.java service/*.java
java app.Main
