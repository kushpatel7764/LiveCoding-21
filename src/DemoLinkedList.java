public class DemoLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.printList();

        list.addFirst("2");
        list.addLast("1");
        System.out.println(list.get(0).data);
        System.out.println(list.get(1).data);
        list.printList();
    }
}
