import java.util.ArrayList;
import java.util.Iterator;

//Boris Wrabel
//Student ID: 2206447w

public class JavaExercise1<E> {

	/****************************************************************
	 * ArrayList Implement the following methods Display the elements of an
	 * ArrayList using different methods after add and remove operations Total
	 * marks: 5
	 *
	 **************************************************************/

	// Display elements using iterator loop. Make sure you print out the section's
	// title "Title - Original ArrayList" before displaying the elements. mba (from
	// mbaList) are my initials, use yours.
	public static <E> Iterator<E> MyListIterator(ArrayList<E> bwList) {

		Iterator<E> iterator = bwList.iterator();

		System.out.println("Title - Original ArrayList\n");

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		return iterator;
	}

	// Add two elements at given index. Display elements after add operation. Use
	// the "Enhanced For Loop" (new way to loop) for this section.
	public static void MyEnhancedLoop(ArrayList<String> bwList) {
		bwList.add(0, "Peterhead Prison Museum");
		bwList.add(1, "Wick Heritage Museum");

		System.out.println("\nTitle - ArrayList after adding elements\n");

		for (String museumName : bwList) {
			System.out.println(museumName);
		}
	}

	// Display elements after remove operation of "Camera Obscura and World of
	// Illusions". Use the While Loop for this section.
	public static <E> void MyWhileLoop(ArrayList<E> bwList) {
		int counter = 0;

		bwList.remove("Camera Obscura and World of Illusions");

		System.out.println("\nTitle - ArrayList after remove operation\n");
		while (bwList.size() > counter) {
			System.out.println(bwList.get(counter));
			counter++;
		}
	}

	// Remove an element from a specified index. Displaying elements after remove
	// operation. Use the regular "For Loop"for this section.
	public static <E> void MyForLoop(ArrayList<E> bwList) {
		bwList.remove(4);

		System.out.println("\nTitle - Final ArrayList\n");
		for (int i = 0; i < bwList.size(); i++) {
			System.out.println(bwList.get(i));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		/*
		 * Create an ArrayList (type safety) called "your_initials"List for example
		 * mbaList Here mba stands for my initials Mireilla Bikanga Ada. For each of the
		 * output, make sure there is a space between the title and the elements
		 * displayed. Also, ensure there is a space between your outputs to increase
		 * readability. File_museums.txt contains the museums that need to be added to
		 * the ArrayList.
		 */

		// Create ArrayList and add elements to your ArrayList one by one. (1 mark)
		ArrayList<String> bwList = new ArrayList<String>();
		bwList.add("Kelvingrove Art Gallery and Museum");
		bwList.add("National Museum of Scotland");
		bwList.add("Royal Yacht Britannia");
		bwList.add("Camera Obscura and World of Illusions");
		bwList.add("Morayvia");
		bwList.add("Montrose Air Station Heritage Centre");

		// Display elements using iterator loop. Make sure print out the section's title
		// "Title - Original ArrayList" before displaying the elements. (1 mark)
		MyListIterator(bwList);

		// Add element at the given index. (1 mark)
		// Add element "Peterhead Prison Museum" at first position.
		// Add element "Wick Heritage Museum" at second position.
		// Displaying elements after add operation. Use the "Enhanced For Loop" (new way
		// to loop) for this section.
		// Make sure it prints out the section's title "Title - ArrayList after adding
		// elements" before displaying the elements.
		MyEnhancedLoop(bwList);

		// Remove elements from ArrayList. (1 mark)
		// Remove "Camera Obscura and World of Illusions" from ArrayList.
		// Display elements using a "while loop".
		// Make sure print out the section's title "Title - ArrayList after remove
		// operation" before displaying the elements.
		MyWhileLoop(bwList);

		// In this section, you are required to remove an element from the specified
		// index. (1 mark)
		// Task: Remove the fifth element.
		// Task: Display elements using a "For Loop" (regular for loop).
		// Make sure print out the section's title "Title - Final ArrayList" before
		// displaying the elements.
		MyForLoop(bwList);

	}
}
