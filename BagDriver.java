import java.util.Arrays;
public class BagDriver {
    public static void main(String[] args) {
        BagInterface<String> linkedBag1 = new LinkedBag<>();
        BagInterface<String> linkedBag2 = new LinkedBag<>();

        linkedBag1.add("A");
        linkedBag1.add("B");
        linkedBag1.add("C");
        linkedBag1.add("D");

        linkedBag2.add("E");
        linkedBag2.add("F");
        linkedBag2.add("A");
        linkedBag2.add("D");
        
        // add union, intersection, and difference methods for LinkedBag
        System.out.println("Bag 1: " + Arrays.toString(linkedBag1.toArray()));
        System.out.println("Bag 2: " + Arrays.toString(linkedBag2.toArray()));

        BagInterface<String> linkedBag3 = linkedBag1.union(linkedBag2);
        System.out.println("Union for LinkedBag: " + Arrays.toString(linkedBag3.toArray()));

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

        BagInterface<String> RAbag3 = RAbag1.union(RAbag2);
        System.out.println("Union for ResizableArrayBag: " + Arrays.toString(RAbag3.toArray()));

        BagInterface<String> RAleftOver = RAbag1.difference(RAbag2);
        System.out.println("Difference for ResizableArrayBag: " + Arrays.toString(RAleftOver.toArray()));
        

    }
}