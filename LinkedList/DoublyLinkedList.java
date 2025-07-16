package day7;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    Node head;
    Node prev;

    // InsertAtBeginning

    public void InsertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // DeleteAtEnd

    public void DeleteAtEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
    }

    // DeleteAtBeginning

    public void DeleteAtBeg() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void display() {
        Node temp = head;
        System.out.print("null" + " -> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
            // temp.prev = null;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.InsertAtBegin(10);
        list.InsertAtBegin(20);
        list.InsertAtBegin(30);
        list.InsertAtBegin(40);
        list.InsertAtBegin(50);

        list.DeleteAtEnd();

        list.DeleteAtBeg();

        list.display();
    }
}
