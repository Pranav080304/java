import java.util.*;
class Demo
{
 public static void main(String[] args)
 {
 // Creating an ArrayList
 ArrayList< String> fruits = new ArrayList< String>();

 // Displaying Arraylist
 System.out.println(fruits);
 // Adding elements to ArrayList
 fruits.add("Mango");
 fruits.add("Apple");
 fruits.add("Berry");
 // Displaying Arraylist
 System.out.println(fruits);
// Removing Elements
 fruits.remove("Apple");
 System.out.println("After Deleting Elements: \n"+fruits);
 // Removing Second Element
 fruits.remove(1);
 System.out.println("After Deleting Elements: \n"+fruits);
// Traversing ArrayList
 for(String element : fruits) {
 System.out.println(element);
 }
//Get size of ArrayList
System.out.println("Total Elements: "+fruits.size());
// Sorting elements
 Collections.sort(fruits);
 }
}