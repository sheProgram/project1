/**
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.
    INCOMPLETE DEFINITION; includes definitions for the methods add,
    toArray, isEmpty, and getCurrentSize.
    @author Frank M. Carrano, Timothy M. Henry
	@author Mohraiel Matta, Tiffany Truong, Erika Ledesma
    @version 5.0
*/
public final class LinkedBag<T> implements BagInterface<T>
{
	private Node firstNode;       // Reference to first node
	private int numberOfEntries;
	private boolean OKintegrity;

	public LinkedBag()
	{
		firstNode = null;
      numberOfEntries = 0;
	  OKintegrity=true;
	} // end default constructor

	/** Adds a new entry to this bag.
	    @param newEntry  The object to be added as a new entry.
	    @return  True. */
	public boolean add(T newEntry) // OutOfMemoryError possible
	{
      // Add to beginning of chain:
		Node newNode = new Node(newEntry);
		newNode.next = firstNode;  // Make new node reference rest of chain
                                 // (firstNode is null if chain is empty)
      firstNode = newNode;       // New node is at beginning of chain
		numberOfEntries++;
      
		return true;
	} // end add

	/** Retrieves all entries that are in this bag.
       @return  A newly allocated array of all the entries in this bag. */
	public T[] toArray()
	{
      // The cast is safe because the new array contains null entries.
      @SuppressWarnings("unchecked")
      T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast
      
      int index = 0;
      Node currentNode = firstNode;
      while ((index < numberOfEntries) && (currentNode != null))
      {
         result[index] = currentNode.data;
         index++;
         currentNode = currentNode.next;
      } // end while
      
      return result;
      // Note: The body of this method could consist of one return statement,
      // if you call Arrays.copyOf
	} // end toArray
   
	/** Sees whether this bag is empty.
       @return  True if the bag is empty, or false if not. */
	public boolean isEmpty()
	{
		return numberOfEntries == 0;
	} // end isEmpty
   
	/** Gets the number of entries currently in this bag.
       @return  The integer number of entries currently in the bag. */
	public int getCurrentSize()
	{
		return numberOfEntries;
	} // end getCurrentSize
   
// STUBS:

	/** Removes one unspecified entry from this bag, if possible.
       @return  Either the removed entry, if the removal
                was successful, or null. */
	public T remove()
   {
      return null; // STUB
   } // end remove
   
	/** Removes one occurrence of a given entry from this bag.
       @param anEntry  The entry to be removed.
       @return  True if the removal was successful, or false otherwise. */
   public boolean remove(T anEntry)
   {
      return false; // STUB
   } // end remove
	
	/** Removes all entries from this bag. */
	public void clear()
   {
      // STUB
   } // end clear
	
	/** Counts the number of times a given entry appears in this bag.
		 @param anEntry  The entry to be counted.
		 @return  The number of times anEntry appears in the bag. */
	public int getFrequencyOf(T anEntry)
   {
      int count = 0;
	  int num = 0;
	  Node currentNode = firstNode;
	  while ((num < getCurrentSize()) && (currentNode != null)){
		if (anEntry.equals(currentNode.getData())){
			count++;
		}
		currentNode = currentNode.next;
	}
	  return count; // STUB
   } // end getFrequencyOf

   private void checkIntegrity() {
	if (!OKintegrity)
		throw new SecurityException("ArrayBag object is corrupt.");
} // end checkIntegrity

	
	/** Tests whether this bag contains a given entry.
		 @param anEntry  The entry to locate.
		 @return  True if the bag contains anEntry, or false otherwise. */
	public boolean contains(T anEntry)
   {
	return getFrequencyOf(anEntry) > 0; // STUB
   } // end contains

	private class Node
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor

		private T getData() {
			return data;
		}
	} // end Node

	/* (non-Javadoc)
	* @see BagInterface#union(BagInterface)
	*/
	// Combine two bags into one bag - union
	public BagInterface<T> union(BagInterface<T> bag2) {
		// create a newly allocated bag
		BagInterface<T> addBag = new LinkedBag<>();

		// clone first and second bag
		T[] newbag1 = this.toArray();
		T[] newbag2 = bag2.toArray();

		// check to see if either one of the two bags is null
		if ((null == this) || (null == bag2)) {
			// return an empty bag if either is null
			System.out.print("A null bag was found...");
			return addBag;
		}
		
		// check to see if both bags are empty
		if (this.isEmpty() && bag2.isEmpty()) {
			//return an empty bag if both are empty
			System.out.println("Both bags are empty.");
			return addBag;
		}
		
		// return the newly allocated linked bag - a combination of the entries from both of the bags (union)
		int index = 0;
		for (; index < this.getCurrentSize(); index++) {
			addBag.add(newbag1[index]);
		}
    
    for (index = 0; index < bag2.getCurrentSize(); ++index) {
			addBag.add(newbag2[index]);
		}

		// return the union of the two bags.
		return addBag;
   } // end of union
	
public BagInterface<T> intersection(BagInterface<T> bag2){
checkIntegrity();

	BagInterface<T>commonItems=new LinkedBag<T>();

//cloned  bag
			T[] newbg1 = this.toArray();


////check the elements in bag one and if bag 2 contains the letters in there, add it into bag3 and remove it from second bag

			for (T i: newbg1){
				if(bag2.contains(i)){
					commonItems.add(i);
					bag2.remove(i);
				}
			}
			//checks if the bag is empty, it will return the new bag empty
			if(this.isEmpty()||bag2.isEmpty()){
				return commonItems;
			}
			return commonItems;
}//end of intersection


	public BagInterface<T> difference(BagInterface<T> bag2){
    BagInterface<T> leftOver = new LinkedBag<T>();
     T[] newBag = this.toArray();
      for (T e : newBag){
        if (bag2.contains(e)){
            int diff = getFrequencyOf(e) - bag2.getFrequencyOf(e);
            int num = 0;
            while (num < diff){ //adds to new bag as many times as difference
                  leftOver.add(e);
                  num--;
            }
       }
       if (!(bag2.contains(e))){
        leftOver.add(e);
       }
	   }
	   return leftOver;
	}
}  // end LinkedBag
