//Write a program to remove element from specified index of ArrayList

package Collection;
import java.util.ArrayList;

public class RemovingElementArrayList {

	public static void main(String[] args) {
		 // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Mustard Oil");
        arrayList.add("Rice");
        arrayList.add("Butter");
        arrayList.add("Bread");
        arrayList.add("Milk");
        arrayList.add("Cake");
        arrayList.add("Soap");

        // Displaying the ArrayList before removal
        System.out.println("ArrayList before removal: " + arrayList);

        // Index of the element to be removed
        int indexToRemove = 4;
     // Removing the element at the specified index
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            arrayList.remove(indexToRemove);
            System.out.println("Element at index " + indexToRemove + " removed.");
        } else {
            System.out.println("Invalid index. Element not removed.");
        }

        // Displaying the ArrayList after removal
        System.out.println("ArrayList after removal: " + arrayList);
		

	}

}
