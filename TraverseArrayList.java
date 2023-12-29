//Write a program to traverse(or iterate) ArrayList

package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class TraverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

        // Adding elements to the ArrayList
        arrayList.add("Mango");
        arrayList.add("Banana");
        arrayList.add("Lichi");
        arrayList.add("Peach");
        arrayList.add("Guava");
       // Traversing the ArrayList using Iterator
        traverseArrayList(arrayList);
    }
	// Method to traverse ArrayList using Iterator
    private static void traverseArrayList(ArrayList<String> arrayList) {
        // Getting an iterator for the ArrayList
        Iterator<String> iterator = arrayList.iterator();

        // Using the iterator to traverse the ArrayList
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
		
	}

}
