# Custom Data Structures in Java

This project demonstrates the implementation of **Custom Stack** and **Custom List** in Java without relying on built-in `Stack` or `ArrayList` classes.  
An **Implementation class** provides a simple console menu for interacting with both data structures.

---

## 📂 Project Structure
Tasks/
│
├── CIEStack.java # Custom stack implementation
├── CustomList.java # Custom generic list implementation
└── Implementation.java # Main driver class with user interface

---

## 🛠 Features

### 🔹 CIEStack (Custom Stack)
- Push an element
- Pop an element
- Peek the top element
- Check if empty / full
- Display stack elements

### 🔹 CustomList (Custom Generic List)
- Add elements dynamically (auto-resizing array)
- Get element at index
- Remove element at index (with shifting)
- Clear all elements
- Get current size

---

## ▶️ How to Run

1. Clone or download this project.
2. Open the project in your IDE (like IntelliJ, Eclipse, or VS Code with Java).
3. Make sure the `Tasks` package structure is correct.
4. Compile and run the **Implementation** class:
   ```bash
   javac Tasks/*.java
   java Tasks.Implementation
📌 Usage
When you run the program, you will see a menu:

vbnet
Copy code
Choose which to test:
1. Custom Stack
2. Custom List
✅ If you choose Custom Stack
You’ll get a menu like:

markdown
Copy code
1. Push
2. Pop
3. Peek
4. isEmpty
5. isFull
6. Display
7. Exit
✅ If you choose Custom List
You’ll first add elements.

Then you can optionally remove an element by index.

The list resizes automatically when full.

💡 Example Run
markdown
Copy code
Choose which to test:
1. Custom Stack
2. Custom List
Choice: 1

Enter size of stack: 3

Choose operation:
1. Push
2. Pop
3. Peek
4. isEmpty
5. isFull
6. Display
7. Exit
Choice: 1
Enter value to push: 10
Pushed: 10
📖 Learning Outcomes
Implementing custom stack using arrays.

Creating a generic list with dynamic resizing.

Designing a menu-driven console app.

Understanding encapsulation and modularization in Java.

👩‍💻 Author
Sai Sujitha Rangisetti
