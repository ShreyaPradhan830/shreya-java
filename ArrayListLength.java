//Write a program to find the length of the ArrayList
package Collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListLength {

	public static void main(String[] args) {
		// Creating an ArrayList using the List interface
        List<String> arrayList = new ArrayList<String>();

        // Adding elements to the ArrayList
        arrayList.add("Kolkata");
        arrayList.add("Howrah");
        arrayList.add("38");
        arrayList.add("Odisha");
        arrayList.add("Hyderabad");
        arrayList.add("Chennai");
        arrayList.add("101");

        // Finding the length (size) of the ArrayList using the List interface
        int length = arrayList.size();

        // Printing the length
        System.out.println("Length of the ArrayList:" + length);
    
		

	}

}
