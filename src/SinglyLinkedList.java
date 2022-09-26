import java.util.NoSuchElementException;


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
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.print("end");
    }

    public Node getFirst(){
        if (size ==0){
            System.out.println("This list is empty");
            return null; 
        } else{
            return head;
        }
    }
    public Node getLast(){
        if (size ==0){
            System.out.println("This list is empty");
            return null; 
        } else{
            return tail;
        }
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
    public void removeFirst(){
        if (size == 0 ){
            System.out.println("This list is empty");
            } else {
                head = head.next;
                --size; 
            }
    }

    public void removeLast(){
        if (size == 0 ){
        System.out.println("This list is empty");
        } else {
            Node current = head;
        while(current.next != tail){
            current = current.next;
        }
    
        current.next = null;
        --size;
        tail = current;
    } 
    }

    public Node get(int index){
        if(index > size -1 || index < 0){
            throw new NoSuchElementException("This");
        }
        if(index == 0){
            getFirst(); 
        }
        else if (index == size-1){
            getLast();
        }
        if (size == 0 ){
        throw new NoSuchElementException("This list is empty");
        } else {
            Node current = head;
         
                for(int i = 0; i != index; i++ ){
                   
                    current = current.next; 
                    }
            return current;
        }
    }


}
