public class DemoLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); 
        list.addFirst("1");
        list.addLast("3");
        list.add(1, "2");
       // list.add(1, "4");
        //list.add(4, "5");
        //list.add(4, "7");
        // list.add(5, "6");
        // list.add(1, "1");
        // list.add(1, "2");
        System.out.println(list.get(0).data);
        System.out.println(list.get(1).data);
        list.printList();
        list.remove(2);
        System.out.println();
        list.printList();
    }
}
