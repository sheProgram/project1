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
        //try out methods here?

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

    }}