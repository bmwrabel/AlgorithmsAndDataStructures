import java.util.*;

//Boris Wrabel
//Student ID: 2206447w

public class MySets {

	/******
	 * @param args
	 */

	public static void main(String args[]) {
		/***********************************************************************
		 * SET OPERATIONS/MANIPULATION Total marks: 9 (breakdown of mark below) You can
		 * test your code by calling your methods.
		 * 
		 ***********************************************************************/

		/*
		 * Create and display three Sets of type "String"called mbaSet1,mbaSet2 and
		 * mbaSet3; where mba stands for my initials (Mireilla Bikanga Ada). You must
		 * use YOUR OWN initials. File_veggies.txt contains 3 lists of vegetables.
		 * Members of mbaSet1 are vegetables grown in the UK in March. Members of
		 * mbaSet2 are April vegetables. The third set, "your_initials"Set3 (example
		 * mbaSet3), should contains the name of the vegetables produced in the UK in
		 * May. Ensure there is a space between your outputs to increase readability.
		 * add all the members of each set at once (not one by one) and the output
		 * should be sorted in ascending order for Set 1 and Set 2. The output of Set 3
		 * should be in no particular order. Display the 3 sets. (1 mark)
		 */

		// Create bwSet1 and add all elements into the set.
		Set<String> bwSet1 = new TreeSet<String>();
		bwSet1.addAll(Arrays.asList("Radishes", "Purple Sprouting Broccoli", "Artichoke", "Beetroot", "Cabbage",
				"Sorrel", "Spring Greens", "Carrots", "Spring Onions", "Watercress", "Chicory", "Cucumber", "Leeks",
				"Parsnip", "Rhubarb"));

		// Create bwSet2 and add all elements into the set.
		Set<String> bwSet2 = new TreeSet<String>();
		bwSet2.addAll(Arrays.asList("Beetroot", "Kale", "Spring Onions", "Morel Mushrooms", "Parsnips", "Radishes",
				"Rhubarb", "Rocket", "Cabbage", "Carrots", "Sorrel", "Spinach", "Chicory", "New Potatoes",
				"Spring Greens", "Watercress", "Artichoke"));

		// Create bwSet3 and add all elements into the set.
		Set<String> bwSet3 = new HashSet<String>();
		bwSet3.addAll(Arrays.asList("Beetroot", "Chillies", "Lettuce", "Marrow", "Rhubarb", "Rocket", "Pineapple",
				"Asparagus", "Aubergine", "Samphire", "Orange", "Spinach", "Banana", "Spring Onions", "Peppers",
				"Radishes", "Watercress"));

		// Display the above sets.
		System.out.println("bwSet1: " + bwSet1);
		System.out.println("bwSet2: " + bwSet2);
		System.out.println("bwSet3: " + bwSet3 + "\n");

		// Find the union called "union" of the first two sets - your_initialsSet1 and
		// your_initialSets2. Example, mbaSet1 and mbaSet2.
		// Title of this output should be "Union of your_initials"Set1 and
		// "your_initials"Set2". For example, Union of mbaSet1 and mbaSet2. (1 mark)
		Set<String> unionOfSet1Set2 = union(bwSet1, bwSet2);
		System.out.println("Union of bwSet1 and bwSet2" + "\n" + unionOfSet1Set2 + "\n");

		/*
		 * Find the union called "union1" of the last two sets - your_initialsSet2 and
		 * your_initialSets3. Title of output: Union of
		 * your_initials"Set2 and "your_initials"Set3. (0.5 mark)
		 */
		Set<String> unionOfSet2Set3 = union1(bwSet2, bwSet3);
		System.out.println("Union of bwSet2 and bwSet3" + "\n" + unionOfSet2Set3 + "\n");

		// Convert output of the union operation of mbaSet2 and mbaSet3 into a list
		// called "uList". Output with title:
		// Union of your_initials"Set2 and "your_initials"Set3 converted into a list
		// called uList (1 mark)
		ArrayList<String> uList = convSet(unionOfSet2Set3);
		System.out.println("Union of bwSet2 and bwSet3 converted into a list called uList:\n" + uList + "\n");

		// Find the size of the output above (it should be 27). No need to create a
		// separate method for this one but if you did, great!.Title: "Size of uList is
		// :" (0.25 mark)
		System.out.println("Size of uList is: " + uList.size() + "\n");

		/*
		 * Find intersection called "intersection1" between
		 * "your_initials"Set1,"your_initials"Set2 and "your_initial"Set3. Example,
		 * mbaSet1, mbaSet2 and mbaSet3 Title of this output should be
		 * "Intersection of your_initials"Set1, "your_initials"Set2 and
		 * "your_initials"Set3 is: ". For example, Intersection of mbaSet1, mbaSet2 and
		 * mbaSet3 is (1 mark)
		 */
		Set<String> intersection = intersection1(bwSet1, bwSet2, bwSet3);
		System.out.println("Intersection of bwSet1, bwSet2 and bwSet3 is:\n" + intersection + "\n");

		/*
		 * Find the difference called "diff" between "your_initials"Set1 and
		 * "your_initials"Set2. Example, mbaSet1 and mbaSet2. Title of this output
		 * should be "Difference of your_initials"Set1 and "your_initials"Set2". For
		 * example, Difference of mbaSet1 and mbaSet2 (1 mark)
		 */
		Set<String> diffOfSet1AndSet2 = diff(bwSet1, bwSet2);
		System.out.println("Difference of bwSet1 and bwSet2:\n" + diffOfSet1AndSet2 + "\n");

		/*
		 * Find the size of Your_initialsSet3 - it should be 17 - (0.25 mark). Check the
		 * presence of banana, pineapple, orange and strawberries in Your_initialsSet3
		 * using contains() method. Display results of checks with appropriate messages.
		 * For example "Is banana present in Your_initialsSet3: (1 mark) If set3
		 * contains these elements, remove them (0.75 mark). Note: It is possible to
		 * perform a checking and remove operations with just one line of code. However,
		 * for this exercise, you are required to check first, display results of
		 * checks; and then remove them and display the updated list.
		 */
		System.out.println("Size of bwSet3 = " + bwSet3.size() + "\n");

		System.out.println("Checking if bwSet3 contains a banana, pineapple, orange and strawberries\n");
		System.out.println("Is a banana present in bwSet3?: " + bwSet3.contains("Banana"));
		System.out.println("Is a pineapple present in bwSet3?: " + bwSet3.contains("Pineapple"));
		System.out.println("Is an orange present in bwSet3?: " + bwSet3.contains("Orange"));
		System.out.println("Are strawberries present in bwSet3?: " + bwSet3.contains("Strawberries") + "\n");

		bwSet3.remove("Banana");
		bwSet3.remove("Pineapple");
		bwSet3.remove("Orange");

		/*
		 * Display the remaining members (after remove operation above) of
		 * your_initialsSet3 using an iterator method called "iterator". The output
		 * should be in no particular order (UNSORTED). Title of this output should be
		 * "Iterating your_initials"Set3 after removing the fruits". (1 mark)
		 */
		System.out.println("****Iterating Set3 after removing the fruits*******\n");
		iterator(bwSet3);

		// Display the new size of Your_initialsSet3 (it should be 14).
		// Do not forget the appropriate message/title. (0.25 mark)

		System.out.println("\n" + "Size of bwSet3 is now = " + bwSet3.size());
	}

	/*********************************************************************************
	 * 
	 * All your methods. You can add them all in here or in a separate document
	 * (best practice) which you will call in your Main in order to test
	 * 
	 *********************************************************************************/
	// Union of mbaSet1 and mbaSet2 sets using addAll()
	public static Set<String> union(Set<String> bwSet1, Set<String> bwSet2) {
		Set<String> union = new TreeSet<String>();
		union.addAll(bwSet1);
		union.addAll(bwSet2);
		return union;
	}

	// Union of mbaSet2 and mbaSet3 sets using addAll()
	public static Set<String> union1(Set<String> bwSet2, Set<String> bwSet3) {
		Set<String> union1 = new HashSet<String>();
		union1.addAll(bwSet2);
		union1.addAll(bwSet3);
		return union1;
	}

	// Convert output of union1 to a list called uList
	public static <String> ArrayList<String> convSet(Set set) {
		ArrayList<String> uList = new ArrayList<String>();
		uList.addAll(set);
		return uList;
	}

	public static Set<String> intersection1(Set<String> bwSet1, Set<String> bwSet2, Set<String> bwSet3) {
		Set<String> intersectionResult = new TreeSet<String>();
		intersectionResult.addAll(bwSet1);
		intersectionResult.retainAll(bwSet2);
		intersectionResult.retainAll(bwSet3);
		return intersectionResult;
	}

	// Find difference between Set1 and set2
	public static Set<String> diff(Set set1, Set set2) {
		Set<String> setDifference = new TreeSet<>();
		setDifference.addAll(set1);
		setDifference.removeAll(set2);
		return setDifference;
	}

	// Display members of third set using Iterator after removing fruits
	public static Iterator<String> iterator(Set set) {
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		return iterator;
	}
}