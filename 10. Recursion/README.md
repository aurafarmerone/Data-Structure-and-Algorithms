# Recursion

Recursion is a method where the solution to a problem depends on solutions to smaller instances of the same problem. In programming, it simply means **a function calling itself**.

### 📖 Simple Analogy
Imagine a set of **Russian Matryoshka dolls**. 
- You open the biggest doll to find a smaller one inside.
- You keep opening them until you find the tiniest doll that cannot be opened anymore.
- That tiniest doll is your **Base Case** (where you stop).
- The act of opening each doll to find the next one is the **Recursive Call**.

### 🔑 Key Components
1. **Base Case**: The condition where the recursion stops. Without this, the function will call itself forever (Stack Overflow).
2. **Recursive Call**: The function calls itself with a smaller/modified input to move towards the base case.
3. **Processing (Work)**: The actual operation or calculation performed (e.g., printing, adding).

---

## 💻 Code Examples

Here are the code examples in this directory, ordered from basics to more advanced concepts.

### 1. Basic Recursion Structure
**File:** `basicRec.java`
Demonstrates printing numbers in decreasing and increasing order.
```java
public class basicRec {
    public static void main(String[] args) {
        // RECURSION
        /* 
        1.BASE CASE
        2.WORK
        3.SMALL FUNCTION CALL(TRUST)
        */
        
        // PRINT NUM IN DECRESING ORDER (n to 1)
        printNaturalDec(10);
        System.out.println();
        printNaturalInc(10);
    }

    public static void printNaturalDec(int n){
       // BASE CASE
        if(n==0){
            return;
        }
        // WORK TO PRINT NUMBER
        System.out.print(n+" ");
        
        // TRUST THE FUNCTION
        printNaturalDec(n-1);
    }

     public static void printNaturalInc(int n){
       // BASE CASE
        if(n==0){
            return;
        }
        // TRUST THE FUNCTION
        printNaturalInc(n-1);

        // WORK TO PRINT NUMBER
        System.out.print(n+" ");
        
        
    }
}
```

### 2. Factorial
**File:** `fact.java`
Calculates the factorial of a number (n!).
```java
public class fact {
    public static void main(String[] args) {
        // RECURSION
        int n = 5;
        System.out.print(" Factorial of "+n+ " is : "+ factorial(5));
        
        
        
    }

    public static int factorial(int n){
       // BASE CASE
        if(n==0){
            return 1;
        }
        
        //WORK + TRUST THE FUNCTION
        return n * factorial(n-1);
    }

     
}
```

### 3. Fibonacci Number (Nth term)
**File:** `fibo.java`
Finds the Nth term in the Fibonacci sequence.
```java
public class fibo {
    public static void main(String[] args) {
        // RECURSION
        int n = 7;
        System.out.print(" Fibo of "+n+ "th term is : "+ fiboN(n));
        
        
    }

    public static int fiboN(int n){
       // BASE CASE
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
        //WORK + TRUST THE FUNCTION >>> fibo(n=2) = fibo(n=1) + fibo(n=0)
        return fiboN(n-1) + fiboN(n-2);
    }

    

     
}
```

### 4. Print Fibonacci Series
**File:** `printfibo.java`
Prints the Fibonacci series up to N terms.
```java
public class printfibo {

    public static void main(String[] args) {
        int n = 7;

        // print first two numbers
        System.out.print("0 1 ");
        printfiboN(n - 2, 0, 1);
    }

    public static void printfiboN(int n, int a, int b) {
        // Base case
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");

        // Recursive call
        printfiboN(n - 1, b, c);
    }
}
```

### 5. Sum of Numbers
**File:** `sumofNum.java`
Calculates the sum of numbers from 0 to N.
```java
public class sumofNum {
    public static void main(String[] args) {
        // RECURSION
        int n = 5;
        System.out.print(" Sum till "+n+ "th term is : "+ sum(5));
        
        
        
    }

    public static int sum(int n){
       // BASE CASE
        if(n==0){
            return 0;
        }
        
        //WORK + TRUST THE FUNCTION
        return n + sum(n-1);
    }

     
}
```

### 6. Power of N (x^n)
**File:** `xpown.java`
Calculates x to the power of n.
```java
class xpown{
    public static void main(String args[]){
        int x = 3;
        int n = 12;
        int res = pow(x,n);
        System.out.println(x +"^"+n+" = "+res);
    }

    public static int pow(int x , int n){
        if(n == 1){
            return x;
        }
        return x * pow(x,n-1);
    }
}
```

### 7. Print Digits
**File:** `printDigit.java`
Prints each digit of a number recursively.
```java
class printDigit {
    public static void main(String args[]){
        int n = 12345;
        // O/P 1 2 3 4 5
        printn(n);
    }

    public static void printn(int n){
        if(n==0){
            return;
        }
        printn(n/10);
        System.out.println(n%10);

    } 
}
```

### 8. Sum of Digits
**File:** `printDigitSum.java`
Calculates the sum of digits of a number.
```java
class printDigitSum {
    public static void main(String args[]){
        int n = 12345;
        // O/P 1 2 3 4 5
        printsum(n,0);
    }

    public static void printsum(int n , int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum = sum + n%10;
        printsum(n/10,sum);

    } 
}
```

### 9. Armstrong Number
**File:** `armstrong.java`
Checks if a number is an Armstrong number.
```java
class armstrong {
    public static void main(String args[]){
        int n = 143;
        // O/P 1 2 3 4 5
        checkArm(143,0,143);
    }

    public static void checkArm(int n , int armValue, int org){
        if(n==0){
            if (org == armValue){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        return;
        }

        armValue = armValue + (int)Math.pow(n%10 , 3) ;
        checkArm(n/10,armValue,org);
    } 
}
```

### 10. Check if Array is Sorted
**File:** `ArraySorted.java`
Checks if an array is sorted in ascending order.
```java
// check if array is sorted or not using recursion

public class ArraySorted {
    public static void main(String[] args) {
        // RECURSION
        int nums[] = new int[]{1,2,3,4,5};
        boolean res = isSorted(nums,0);
        System.out.print(res);
    }

    public static boolean isSorted(int arr[], int i){
       // BASE CASE
        if(i==arr.length-1){
            return true;
        }
        // WORK
        if(arr[i]>arr[i+1]){
            return false;
        }
        // TRUST FUNCTION
        return isSorted(arr,i+1);
    }

     
}
```

### 11. First Occurrence in Array
**File:** `firstOccur.java`
Finds the index of the first occurrence of a key in an array.
```java
// find first occurance of a number in array using recursion

public class firstOccur {
    public static void main(String[] args) {
        // RECURSION
        int nums[] = new int[]{7,3,6,1,9,0,1,2,2,3,4,5,4,4,1};
        int res = firstoccurance(nums,0, 8);
        System.out.print("idx is" + res);
    }

    public static int firstoccurance(int arr[], int i, int key){
       // BASE CASE
        if(i==arr.length-1){
            return -1; // not found
        }
        // WORK
        if(arr[i] == key){
            return i;
        }
        // TRUST FUNCTION
        return firstoccurance(arr,i+1,key);
    }

     
}
```

### 12. Last Occurrence in Array
**File:** `LastOccurance.java`
Finds the index of the last occurrence of a key in an array.
```java
// find last occurance of a number in array using recursion

public class LastOccurance {
    public static void main(String[] args) {
        // RECURSION
        int nums[] = new int[]{4,7,3,6,1,9,0,1,2,2,3,4,5,4,1,4};
        int res = Last_Occurance(nums,0, 4,-1);
        System.out.print("idx is " + res);
    }

    public static int Last_Occurance(int arr[], int i, int key, int last_idx){
       // BASE CASE
        if(i==arr.length){
            return last_idx; 
        }
        // WORK
        if(arr[i] == key){
             last_idx = i;
        }
        // TRUST FUNCTION
        return Last_Occurance(arr,i+1,key,last_idx);
    }


    // approach 2: check from backward like base case i==0 Last_Occurance(arr,arr.length - 1,key)
    public static int lastoccurance(int arr[], int n, int key){ // n = arr.length-1
       // BASE CASE
        if(i == -1){ // Note: 'i' needs to be defined or 'n' used
            return -1; // not found
        }
        // WORK
        if(arr[i] == key){
            return i;
        }
        // TRUST FUNCTION
        return lastoccurance(arr, n - 1,key);
    }
}
```

### 13. Count Even and Odd Numbers
**File:** `CountEvenOdd.java`
Counts even and odd numbers recursively (example uses variable passing).
```java
class CountEvenOdd {
    public static void main(String args[]){
        int n = 100;
        // O/P 1 2 3 4 5
        count(n,0,0);
    }

    public static void count(int n , int even , int odd){
        if(n==-1){
            System.out.println("Total Even = "+ even);
            System.out.println("Total Odd = "+ odd);
            return;
        }
        
        if(n%2 == 0){
            even++;
        }
        else{
            odd++;
        }

        count(n-1,even,odd);

    } 
}
```

### 14. Remove Duplicates from String
**File:** `RemoveDuplicate.java`
Removes duplicate characters from a string.
```java
public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "aaabbbccccdddd";
        StringBuilder res = new StringBuilder("");
        boolean arr[] = new boolean[26]; // map , all value = false
        rem(str,0,res,arr);


    }

    public static void rem(String str, int idx , StringBuilder res , boolean arr[] ){
        if(idx == str.length()-1){
            System.out.print(res);
            return;
        }

        char currChar = str.charAt(idx);
        if(arr[currChar - 'a'] == true){
            // ignore because already appear before
            rem(str,idx+1,res,arr);
        }
        else{
            arr[currChar - 'a'] = true;
            rem(str,idx+1,res.append(currChar),arr);
        }


    }
}
```
