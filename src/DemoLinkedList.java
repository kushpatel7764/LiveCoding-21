public class DemoLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.printList();

        list.addFirst("2");
        list.addLast("1");
        list.printList();
    }
}
