import java.util.Comparator;
import java.util.Iterator;

public class BinarySearchTree<E extends Comparable<E>> 
	extends AbstractStructure<E> implements OrderedStructure<E> { 
	
	public BinarySearchTree() // post: constructs an empty binary search tree

	public BinarySearchTree(Comparator<E> alternateOrder) // post: constructs an empty binary search tree

	public boolean isEmpty() // post: returns true iff the binary search tree is empty

	public void clear() // post: removes all elements from binary search tree

	public int size() // post: returns the number of elements in binary search tree

	public void add(E value) // post: adds a value to binary search tree

	public boolean contains(E value) // post: returns true iff val is a value found within the tree

	public E get(E value) // post: returns object found in tree, or null

	public E remove(E value) // post: removes one instance of val, if found

	public Iterator<E> iterator() // post: returns iterator to traverse BST
}
