//Given an element write a program to check if element(value) exists in ArrayList

package Collection;
import java.util.ArrayList;

public class CheckValue {

	public static void main(String[] args) {
		// Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();

        // Adding elements to the ArrayList
        arrayList.add("Sunflower");
        arrayList.add("Rose");
        arrayList.add("Orange");
        arrayList.add("Tulip");
        arrayList.add("Lavender");
     

        // Checking if the element exists in the ArrayList
        boolean exists = arrayList.contains("Orange");

        // Displaying the result
        if (exists) {
            System.out.println("Orange exists in the ArrayList");
        } else {
            System.out.println("Orange does not exist in the ArrayList");
        }
        
        exists = arrayList.contains("Banana");
        if (exists) {
            System.out.println("Banana exists in the ArrayList");
        } else {
            System.out.println("Banana does not exist in the ArrayList");
        }
		

	}

}
