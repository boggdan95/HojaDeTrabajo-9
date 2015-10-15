import java.util.Collection;
import java.util.Iterator;

public interface Structure<k>
{
public int size();
// post: computes number of elements contained in structure
public boolean isEmpty();
// post: return true iff the structure is empty
public void clear();
// post: the structure is empty
public boolean contains(Object value);
// pre: value is non-null
// post: returns true iff value.equals some value in structure
public void add(Object value);
// pre: value is non-null
// post: value has been added to the structure
// replacement policy is not specified
public Object remove(Object value);
// pre: value is non-null
// post: an object equal to value is removed and returned, if found
public java.util.Enumeration elements();
// post: returns an enumeration for traversing structure;
// all structure package implementations return
// an AbstractIterator
public Iterator iterator();
// post: returns an iterator for traversing structure;
// all structure package implementations return
// an AbstractIterator
public Collection values();
// post: returns a Collection that may be used with
// Java's Collection Framework
}