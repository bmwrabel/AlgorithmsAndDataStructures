import java.util.Collections;
import java.util.LinkedList;


// Boris Wrabel
// Student ID: 2206447w

public class MyBST_Exercise {

	/********************************************************
	 * Section 1: Using Java in-built LinkedList class Total marks for Section1: 6
	 ******************************************************/

	// Display elements of your linkedList. Use the "Enhanced For Loop" (new way to
	// loop) for this section
	private static void iterateMyList(LinkedList<String> list) {
		System.out.println("This is bwFruits LinkedList\n");
		for (String element : list) {
			System.out.println(element);
		}
	}

	// Check if gooseberries is in your_initialsFruits list
	private static <T> void checkGoose(LinkedList list) {
		String goose = "Gooseberries";
		if (list.contains(goose)) {
			System.out.println("\nLinkedList contains the element 'Gooseberries\n");
		} else {
			System.out.println("\nLinkedList doesn't contain the element 'Gooseberries'\n");
		}
	}

	/*
	 * Insert "Gooseberries" after "Blackberries". Then display the updated
	 * linkedList your_initialsFruits after adding Gooseberries. Use appropriate
	 * message.
	 */
	private static void insertGoose(LinkedList<String> list) {
		int positionOfBlackberries = list.indexOf("Blackberries");
		list.add((positionOfBlackberries + 1), "Gooseberries");
		System.out.println("This is bwFruits linkedList after adding Gooseberries:");
		System.out.println(list + "\n");
	}

	/*
	 * Display the element that is not ending with "berries". Use variable called
	 * notBerries. Appropriate title/message. Remove that element and display
	 * your_initialsFruits linkedList after removing that element. Use appropriate
	 * title.
	 */
	private static void notEndingWithBerries(LinkedList<String> bwFruits) {
		String notBerries = null;
		for (String fruit : bwFruits) {
			if (!(fruit.contains("berries") || fruit.contains("Berries"))) {
				notBerries = fruit;
			}
		}
		bwFruits.remove(notBerries);
		System.out.println("Element not ending with Berries is: " + notBerries + "\n\n"
				+ "This is bwFruits linkedList after removing Apples:\n" + bwFruits);
	}

	// Method: convertLinkedListToArray. Convert your linkedList into Array called
	// "bstFruit" and display.
	private static String[] convertLinkedListToArray(LinkedList<String> list) {
		String[] array = list.toArray(new String[list.size()]);

		System.out.println("\nArray Elements - This is bstFruits linkedList after converting bwFruits to an array:\n");

		for (String element : array) {
			System.out.println(element);
		}
		return array;
	}

	// Sort the your_initialsFruits List (example: mbaFruits) in ascending order
	// using Collections and display
	private static void sortedLinkedList(LinkedList list) {
		Collections.sort(list);
		System.out.println("\nThis is bwFruits linkedList after sorting in ascending order:");
		System.out.println(list);
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/**************************************************************************************************************************************
		 * Section 1 (6 marks)- Using Java in-built LinkedList class - Create an empty
		 * Linked List "your_initial"Fruit (for example: mbaFruits) Populate the
		 * LinkedList with the content of File_fruits.txt. perform the operations
		 * required in this sections.
		 * 
		 * Section 2 - (9 marks) construct a Balanced Binary Search Tree, the BST should
		 * not be extremely unbalanced. Note: It is not AVL tree Ensure there is a space
		 * between your outputs to increase readability.
		 ***************************************************************************************************************************************/

		// Create an empty Linked List of Strings your_initialsFruits (example:
		// mbaFruits)
		// Use the add() method to populate the linkedList mbaFruits with the elements
		// in file_fruits.txt.
		LinkedList<String> bwFruits = new LinkedList<String>();
		bwFruits.add("Strawberries");
		bwFruits.add("Raspberries");
		bwFruits.add("Blueberries");
		bwFruits.add("Cranberries");
		bwFruits.add("Blackberries");
		bwFruits.add("Apples");
		bwFruits.add("Honeyberries");
		bwFruits.add("Goji Berries");
		bwFruits.add("Wineberries");
		bwFruits.add("Tayberries");

		// Method called "iterateMyList": Use the Enhanced loop to print out your
		// linkedList with appropriate title
		// such as "This is your_initials"Fruits LinkedList (Example, This is mbaFruits
		// LinkedList). (1 mark)
		iterateMyList(bwFruits);

		// Method "CheckGoose". Find Gooseberries in the linked list. Use variable name:
		// goose.
		// If goose exists display the message "LinkedList contains the element
		// 'Gooseberries".
		// Otherwise "LinkedList doesn't contain the element 'Gooseberries'". (1 mark)
		checkGoose(bwFruits);

		// Method called "insertGoose" - Insert the fruit name "Gooseberries" after
		// "Blackberries".Display the updated
		// linkedList your_initialsFruits after adding Gooseberries. Use appropriate
		// message. (1 mark)
		insertGoose(bwFruits);

		// Method called "notEndingWithBerries" - Display the element that is not ending
		// with "berries". Use variable called notBerries. Appropriate title
		// Remove that element and display your_initialsFruits after removing that
		// element.
		// Use appropriate title. Example, this is mbaFruits linkedList after
		// removing....(1 mark)
		notEndingWithBerries(bwFruits);

		// Method called "convertLinkedListToArray" - Convert your_initialsFruits
		// LinkedList to Array called "bstFruits"
		// and display bstFruits array content. (1 mark)
		String[] bstFruits = convertLinkedListToArray(bwFruits);

		// Sort the your_initialsFruits List (example: mbaFruits) in ascending order
		// using Collections. Display sorted LinkedList (1 mark)
		sortedLinkedList(bwFruits);

		/*
		 * *****************************************************************************
		 * *********************** Section - 2 Implementing a BST
		 * 
		 * Now convert your array of berries fruits into a binary search tree called
		 * "myTree". Display the in-order, pre-order and postOrder of "myTree".
		 *
		 * Note: This should not result in an extremely unbalanced tree Total marks: 9
		 ***************************************************************************************************/

		// Create a binary search tree called "myTree" - you convert your array of
		// fruits into a BST (4.5 marks)
		BSTree<String> myTree = new BSTree<String>();

		for (String element : bstFruits) {
			myTree.insert(element);
		}

		// Call class method: Display the elements of the binary Search tree "myTree" -
		// inOrder traversal (1.5 mark)
		myTree.inOrderT();

		// Call class method: Display the elements of the binary Search tree "myTree" -
		// postOrder traversal (1.5 mark)
		myTree.postOrderT();

		// Call class method: Display the elements of the binary Search tree "myTree" -
		// preOrder traversal (1.5 mark)
		myTree.preOrderT();

	}
}

/*********************************************************************************************************
 * Create a binary search tree using a class called "BSTree". You will need to
 * define a FruitNode class. FruitNode will be used to store the elements of
 * your fruit_file.txt. You will be implementing the following methods for your
 * BSTree: insert method - this will help you convert your array of fruits into
 * a binary search tree called "myTree" public inOrder() - An in-order traversal
 * to return the list of fruits in order. This is the fruits in alphabetical
 * order public postOrder() - a post-order traversal - start from left to right
 * going upward. public preOrder() - A pre-order traversal to return the list of
 * fruits pre-order. This is the order in which the list is inserted. As you get
 * the list in one of the section above and insert it to a new tree myTree. Each
 * of the traversal functions has a recursive helper function: void
 * inorderT(FruitNode t) void preOrderT(FruitNode t) void preOrderT(FruitNode t)
 * 
 ********************************************************************************************************/

/*************************************************
 *
 * the FruitNode class
 *
 **************************************************/
// FruitNode: a node in a binary search tree
class FruitNode<E extends Comparable<E>> {
	protected E element;
	protected FruitNode<E> left;
	protected FruitNode<E> right;

	protected FruitNode(E e) {
		element = e;
		left = null;
		right = null;
	}

}

/************************************************
 *
 * BSTree class
 * 
 *************************************************/
// BSTree: binary search tree
class BSTree<E extends Comparable<E>> {

	private FruitNode<E> root; // hidden root node

	public BSTree() {
		root = null;
	}

	/************************************************
	 * insert
	 *************************************************/
	// insert: if new entry, insert in tree (use compareTo).
	public void insert(E element) {
		
		int direction = 0;
		FruitNode<E> parent = null;
		FruitNode<E> current = root;

		while (true) {
			if (current == null) {
				FruitNode<E> ins = new FruitNode<E>(element);

				if (root == null) {
					root = ins;
				} else {
					if (direction < 0) {
						parent.left = ins;
					} else {
						parent.right = ins;
					}
				}
				return;
			}

			direction = element.compareTo(current.element);
			if (direction == 0) {
				return;
			}

			parent = current;
			if (direction < 0) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
	}

	/*************************************************
	 *
	 * Your three TRAVERSALS
	 *
	 **************************************************/

	// inOrder traversal
	private static <E extends Comparable<E>> void inOrderT(FruitNode<E> top) {
		if (top != null) {
			inOrderT(top.left);
			System.out.print(top.element + " ");
			inOrderT(top.right);
		}
	}

	// inorderT: recursive function
	public void inOrderT() {
		System.out.println("\nThis is myTree inOrder traversal");
		inOrderT(root);
	}

	// postOrderTraversal
	private static <E extends Comparable<E>> void postOrderT(FruitNode<E> top) {
		if (top != null) {
			postOrderT(top.left);
			postOrderT(top.right);
			System.out.print(top.element + " ");
		}
	}

	// postOrderT: recursive function
	public void postOrderT() {
		System.out.println("\n\nThis is myTree postOrder traversal");
		postOrderT(root);
	}

	// preOrderTraversal
	private static <E extends Comparable<E>> void preOrderT(FruitNode<E> top) {
		if (top != null) {
			System.out.print(top.element + " ");
			preOrderT(top.left);
			preOrderT(top.right);
		}
	}

	// preorderT: recursive function
	public void preOrderT() {
		System.out.println("\n\nThis is myTree preOrder traversal");
		preOrderT(root);
	}
}
