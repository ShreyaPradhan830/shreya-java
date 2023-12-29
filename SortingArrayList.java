//Write a program to sort ArrayList in descending order

package Collection;
import java.util.ArrayList;
import java.util.Collections;


public class SortingArrayList {

	public static void main(String[] args) {
		// Creating an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        arrayList.add(18);
        arrayList.add(40);
        arrayList.add(72);
        arrayList.add(5);
        arrayList.add(94);

        // Sorting the ArrayList in descending order
        Collections.sort(arrayList, Collections.reverseOrder());

        // Displaying the sorted ArrayList
        System.out.println("Sorted ArrayList in descending order:" + arrayList);
    
		
	}

}
