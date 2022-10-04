import java.util.Arrays;
public class BagDriver {
    public static void main(String[] args) {
        BagInterface<String> linkedBag1 = new LinkedBag<>();
        BagInterface<String> linkedBag2 = new LinkedBag<>();

        linkedBag1.add("cute");
        linkedBag1.add("apple");
        linkedBag1.add("sour");
        linkedBag1.add("creepy");

        linkedBag2.add("pretty");
        linkedBag2.add("nice");
        linkedBag2.add("cute");
        linkedBag2.add("twice");
        
        // add union, intersection, and difference methods for LinkedBag
        System.out.println("Bag 1: " + Arrays.toString(linkedBag1.toArray()));
        System.out.println("Bag 2: " + Arrays.toString(linkedBag2.toArray()));
        System.out.println("\n");

        BagInterface<String> linkedBag3 = linkedBag1.union(linkedBag2);
        System.out.println("Union for LinkedBag: " + Arrays.toString(linkedBag3.toArray()));
        System.out.println("___________________________________________________");
        BagInterface<String> commonItem1 = linkedBag1.intersection(linkedBag2);
        BagInterface<String> commonItem2 = linkedBag2.intersection(linkedBag1);
        System.out.println("Intersection for LinkedBag "+Arrays.toString(commonItem1.intersection(commonItem2).toArray()));


        System.out.println("___________________________________________________");
        BagInterface<String> LBleftOver1 = linkedBag1.difference(linkedBag2);
        BagInterface<String> LBleftOver2 = linkedBag2.difference(linkedBag1);
        System.out.println("Difference for LinkedBag, invoking on Linked bag 1 : " + Arrays.toString(LBleftOver1.toArray()));
        System.out.println("Difference for LinkedBag, invoking on Linked bag 2 : " + Arrays.toString(LBleftOver2.toArray()));

        System.out.println("\n\n");

        System.out.println("________________________onto_rezizable_array_bag_______________________________");
        System.out.println("\n");
        BagInterface<String> RAbag1= new ResizableArrayBag<>();
        BagInterface<String> RAbag2= new ResizableArrayBag<>();

        RAbag1.add("A");
        RAbag1.add("B");
        RAbag1.add("C");
        RAbag1.add("D");


        RAbag2.add("E");
        RAbag2.add("F");
        RAbag2.add("A");
        RAbag2.add("D");

        // add union, intersection, and difference for ResizableArrayBag
        System.out.println("Bag 1: " + Arrays.toString(RAbag1.toArray()));
        System.out.println("Bag 2: " + Arrays.toString(RAbag2.toArray()));

        System.out.println("\n");
        //added union
        BagInterface<String> RAbag3 = RAbag1.union(RAbag2);
        System.out.println("Union for ResizableArrayBag: " + Arrays.toString(RAbag3.toArray()));
        System.out.println("___________________________________________________");

        System.out.println("Intersection for RezizableArrayBag: "+Arrays.toString(RAbag1.intersection(RAbag2).toArray()));

        BagInterface<String> RAleftOver1 = RAbag1.difference(RAbag2);
        BagInterface<String> RAleftOver2 = RAbag2.difference(RAbag1);
        System.out.println("___________________________________________________");
        System.out.println("Difference for ResizableArrayBag, invoking on Resizable Array 1: " + Arrays.toString(RAleftOver1.toArray()));
        System.out.println("Difference for ResizableArrayBag, invoking on Resizable Array 2: " + Arrays.toString(RAleftOver2.toArray()));

    }
}