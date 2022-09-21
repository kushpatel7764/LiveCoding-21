public class SinglyLinkedList {
    int size;
    Node head;
    Node tail;

    public SinglyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    public void clear (){
        size = 0;
        head = null;
        tail = null;
    }

    public void printList(){
        if(size == 0){
            System.out.println("list is empty");
            return;
        }

        Node current = head;
        while (current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }

        System.out.println("end");
    }

    public void addFirst(String data){
        if(size == 0){
            Node newNode = new Node(data, null);
            head = newNode;
            tail = newNode;
            ++size;
        } else {
            Node newNode = new Node(data, head);
            head = newNode;
            ++size;
        }
    }

    public void addLast (String data){
        if(size == 0 ){
            Node newNode = new Node(data, null);
            head = newNode;
            tail = newNode;
            ++size;
        }else{
            Node newNode = new Node(data, null);
            tail.next = newNode;
            ++size;
        }
    }
}
