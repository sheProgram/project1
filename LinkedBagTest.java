
import java.util.Arrays;

import org.junit.Test;

public class LinkedBagTest 
{
    BagInterface <String> bag1 = new LinkedBag<>();
    BagInterface <String> bag2 = new LinkedBag<>();

    @Test
    public void union() 
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

}