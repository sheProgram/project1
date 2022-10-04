import java.util.Arrays;

import org.junit.Test;

public class LinkedBagTest 
{
    BagInterface <String> bag1 = new LinkedBag<>();
    BagInterface <String> bag2 = new LinkedBag<>();

    @Test
    public void union_noduplicates() 
    {
        bag1.add("A");
        bag1.add("B");
        bag1.add("C");
        bag2.add("T");
        bag2.add("E");
        bag2.add("F");
        bag2.add("H");
        System.out.println(Arrays.toString(bag1.union(bag2).toArray())); 
        //Prints the union of the two bags
    }

    @Test
    public void union_withduplicates() 
    {
        bag1.add("A");
        bag1.add("B");
        bag1.add("C");
        bag2.add("B");
        bag2.add("B");
        bag2.add("D");
        bag2.add("E");
        System.out.println(Arrays.toString(bag1.union(bag2).toArray())); 
        //Prints the union of the two bags
    }

    
    @Test
    public void unionEmptyBag() 
    {
        bag1.add("A");
        bag1.add("B");
        bag1.add("C");
        bag2.add("");
        bag2.add("");
        bag2.add("");
        bag2.add("");
        System.out.println(Arrays.toString(bag1.union(bag2).toArray())); 
        //Prints the union of the two bags
    }

    @Test
    public void isEmpty() 
    {
        if (bag1.isEmpty())
        {
            System.out.println("bag is empty");
        }
    }

    @Test
    public void intersection() 
    {
        bag1.add("A");
        bag1.add("B");
        bag1.add("C");
        bag2.add("B");
        bag2.add("B");
        bag2.add("D");
        bag2.add("E");
        System.out.println(Arrays.toString(bag1.intersection(bag2).toArray())); 
        //Prints the union of the two bags
    }
    @Test
    public void difference() 
    {
        bag1.add("A");
        bag1.add("B");
        bag1.add("C");
        bag2.add("B");
        bag2.add("B");
        bag2.add("D");
        bag2.add("E");
        System.out.println(Arrays.toString(bag1.difference(bag2).toArray())); 
        //Prints the union of the two bags
    }

    @Test
    public void add() 
    {
        bag1.add("A");
        System.out.println(Arrays.toString(bag1.toArray())); //Prints [A]
    }

    @Test
    public void remove() 
    {
        bag1.add("C");
        bag1.add("B");
        bag1.remove("C");
        System.out.println(Arrays.toString(bag1.toArray())); //Prints [B]
    }

    @Test
    public void testRemove() 
    {
        bag1.add("A");
        bag1.add("B");
        bag1.remove();
        System.out.println(Arrays.toString(bag1.toArray())); //Prints [A]
    }

    @Test
    public void getCurrentSize() 
    {
        bag1.add("A");
        bag1.add("B");
        bag1.add("C");
        bag1.add("D");
        bag1.add("E");
        System.out.println(Arrays.toString(new int[]{bag1.getCurrentSize()})); //Prints [5]
    }

    @Test
    public void clear() 
    {
        bag1.add("A");
        bag1.add("B");
        bag1.add("C");
        bag1.add("D");
        bag1.clear();
        System.out.println(Arrays.toString(bag1.toArray())); //Prints []
    }

    @Test
    public void getFrequencyOf() 
    {
        bag1.add("A");
        bag1.add("A");
        bag1.add("B");
        bag1.add("B");
        System.out.println(Arrays.toString(new int[]{bag1.getFrequencyOf("A")})); //Prints [2]
    }

    @Test
    public void contains() 
    {
        bag1.add("A");
        if (bag1.contains("A"))
        {
            System.out.println("Bag1 Contains Entry A");
        }
    }

    @Test
    public void toArray() 
    {
        bag1.add("A");
        bag1.add("B");
        bag1.add("C");
        bag1.add("D");
        System.out.println(Arrays.toString(bag1.toArray())); //Prints [A, B, C, D]
    }

}