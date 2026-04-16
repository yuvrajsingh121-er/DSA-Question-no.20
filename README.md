# 🚀 DSA Question No. 20: Largest & Smallest in Array

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java)
![Data Structures](https://img.shields.io/badge/Topic-Arrays-red?style=for-the-badge)

## 📝 Problem Description
Ek integer array mein se sabse badi (*Largest) aur sabse chhoti (Smallest*) value find karni hai. Ye problem array traversal aur comparison logic ko samajhne ke liye basic aur mahatvapurn hai.

### 💡 Logic Steps:
1. Do variables banayein: largest (jiski initial value Integer.MIN_VALUE ho) aur smallest (jiski initial value Integer.MAX_VALUE ho).
2. Array par loop chalayein (0 se lekar n-1 tak).
3. Har element ko compare karein:
   - Agar current element largest se bada hai, toh use update karein.
   - Agar current element smallest se chhota hai, toh use update karein.
4. Loop khatam hone par dono values print karein.

---

## 💻 Java Code Snippet

```java
import java.util.*;

public class Array {
    public static int get_Largest(int array[]) {
        int largest = Integer.MIN_VALUE; // -Infinity
        int smallest = Integer.MAX_VALUE; // +Infinity

        // Corrected Loop: index starts from 0 to length-1
        for(int i = 0; i < array.length; i++) {
            if(largest < array[i]) {
                largest = array[i];
            }
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int result = get_Largest(array);
        System.out.println("Largest value is: " + result);
    }
}
