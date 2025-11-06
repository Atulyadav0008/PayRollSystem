<h1>💼 PayRollSystem</h1>
<br>
This is a mini Java project that I created during my 5th semester at Invertis University.
At that time, I used to feel a bit scared of OOPs concepts — like inheritance, polymorphism, and abstraction — so I decided to face that fear through a real project.

With the guidance of "Indian Programmer" (YouTube channel), I built this project step by step.
It not only helped me clear all my OOPs-related doubts but also boosted my confidence in Core Java.

📅 Completed on: 06 November 2025, 10:55 PM
<br>
<h1>
  💼 Payroll Management System (Core Java OOPs Project)
</h1>
<h2>
🧠 Overview

This project demonstrates the complete implementation of Core Java OOPs concepts through a simple yet practical Payroll System.
It handles both Full-time and Part-time employees, calculates their salaries, and manages their data using a Collection Framework (ArrayList).
<b>
🚀 Features

✅ Add new employees (Full-time or Part-time)
✅ Display all employees with details
✅ Remove employee by ID
✅ Automatically calculate salary (based on employee type)
✅ Demonstrates all major OOPs pillars — Abstraction, Encapsulation, Inheritance, Polymorphism
<br>
🧩 OOPs Concepts Used
Concept	Explanation	Example in Code
Abstraction	Abstract class hides implementation details and provides a base structure	abstract class Employee
Encapsulation	Private variables + public getters/setters	private String name; public String getName()
Inheritance	Child classes extend parent class	class FullTimeEmployee extends Employee
Polymorphism	Method overriding for dynamic behavior	calculateSalary() in child classes
Constructor Chaining	Using super() to call parent constructor	super(name, id)
Composition	PayrollSystem has a list of Employee objects	ArrayList<Employee> employeelist
Collection Framework	Dynamic storage for multiple employees	ArrayList

<br>

🛠️ Tech Stack

Language: Java

IDE: IntelliJ IDEA / Eclipse 
<b>
Concepts Covered:

Abstract Classes

Method Overriding

Constructor Chaining

Collection Framework (ArrayList)
<br>
📂 Project Structure
src/
 ├── Employee.java
 ├── FullTimeEmployee.java
 ├── PartTimeEmployee.java
 ├── PayrollSystem.java
 └── Main.java

<br>
📘 Example Output
🔹 Initial employee details:
Employee[name=Atul, id=101, salary=30000.0]
Employee[name=Ravi, id=102, salary=20000.0]

🔹 Removing employee with ID 102:
Employee with ID 102 removed successfully.

🔹 Updated employee details:
Employee[name=Atul, id=101, salary=30000.0]

🧩 How to Run

Clone this repository

git clone https://github.com/YourUsername/PayrollSystem.git


Open project in your IDE

Run the Main.java file
<br>
📖 What You’ll Learn

How to design classes using OOPs

How to use abstract classes and inheritance together

How to override methods properly

How to manage data dynamically using ArrayList

How super() and @Override work internally
</h2>

<br>
<h1>
👨‍💻 Author

Atul Yadav
🎓 B.Tech Student | 📘 Java Learner | ✍️ Published Writer on Amazon
📺 YouTube Channel – Lekhak_babu

🌱 Focused on self-growth, literature, and meaningful learning.
</h1>
