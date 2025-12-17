# Java Basics – Revision Notes 📘


## 1. Hello World Program (`Hello1.java`)

### 📌 Theory
- This is the **basic structure of a Java program**.
- Every Java program:
  - Has a **class**
  - Contains the `main()` method
- `main()` is the **entry point** of execution.

### 🧠 Important Points
- `public` → accessible everywhere
- `static` → no object needed to call `main()`
- `void` → no return value

### 💻 Code
```java
public class Hello1 {
    public static void main(String[] args) {
        byte a = 127; // -128 to 127(range of byte)
        System.out.println(a);
    }
}
```


## 2. Data Types in Java (`datatypes.java`)

### 📌 Theory
Java data types define **what kind of data** a variable can store.

### 🔹 Primitive Data Types
| Data Type | Size | Example |
|----------|------|---------|
| byte | 1 byte | -128 to 127 |
| short | 2 bytes | Small integers |
| int | 4 bytes | Whole numbers |
| long | 8 bytes | Large integers |
| float | 4 bytes | Decimal values |
| double | 8 bytes | Precise decimals |
| char | 2 bytes | Single character |
| boolean | 1 bit | true / false |

### 🔹 Non-Primitive
- `String`
- Arrays
- Classes

### 💻 Code
```java
public class Hello1 {
    public static void main(String[] args) {
        int a = 10;
        float b = 20.5f;
        double c = 30.56;
        char ch = 'A';
        boolean flag = true;
        String str = "Hello "; // not fixed bytes
     }
}
```



## 3. Type Conversion & Type Casting (`typeconversion.java`)

### 📌 Theory
Type conversion means **changing one data type into another**.

### 🔹 Types
1. **Widening (Automatic)**
   - Small → Large
   - byte → int → float → double

2. **Narrowing (Manual Casting)**
   - Large → Small
   - Data loss possible

### 💻 Code
```java
public class typeconversion {
    public static void main(String[] args) {
        byte b = 50;
        
        // Type casting example
        byte a = (byte) (b * 2);
        
        /*
         OR
         int a = b * 2;
        */
    }
}
```

### ⚠️ Note
- Arithmetic operations convert byte/short into `int` automatically.



## 4. Taking Input from User (`input.java`)

### 📌 Theory
Java uses the **Scanner class** to take input from the user.

### 🔹 Steps
1. Import `java.util.Scanner`
2. Create Scanner object
3. Use methods like `nextInt()`, `nextLine()`

### 💻 Code
```java
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        
        System.out.println(a);
    }
}
```



## 5. Operators in Java (`opr.java`)

### 📌 Theory
Operators are used to **perform operations on variables**.

### 🔹 Types of Operators
- Arithmetic: `+ - * / %`
- Relational: `> < >= <= == !=`
- Logical: `&& || !`
- Assignment: `= += -=`
- Unary: `++ --`

### 💻 Code
```java
public class opr {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        x++;
        y--;
        
        System.out.println("x : " + x + "\n" + "y : " + y);
    }
}
```



## 6. Switch Case Statement (`switchone.java`)

### 📌 Theory
The `switch` statement is used to **execute one case from many choices**.

### 🔹 Syntax
```java
switch(expression) {
    case value1: statement; break;
    case value2: statement; break;
    default: statement;
}
```

### 💻 Code
```java
import java.util.*;

public class switchone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ch = sc.nextInt();
        
        switch(ch) {
            case 1: System.out.print(a + b); break;
            case 2: System.out.print(a - b); break;
            case 3: System.out.print(b / a); break;
        }
    }
}
```



## ✅ Quick Revision Summary
- Java program starts from `main()`
- Data types define memory and value range
- Type casting is needed for narrowing
- Scanner is used for input
- Operators perform calculations
- Switch is an alternative to multiple `if-else`

