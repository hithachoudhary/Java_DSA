package day6;
//Sinlgy Linked list 

class Node {
    int data;
    Node Next;

    // constructor

    Node(int data) {
        this.data = data;
        this.Next = null;
    }
}

public class SinglyLinkedList {

    // InsertAtBegin
    Node head;

    public void InsertAtBegin(int data) { // method1
        Node newNode = new Node(data); // creating a node
        newNode.Next = head; // the next node will be the head node
        head = newNode;
    }

    // InsertAtEnd
    public void InsertAtEnd(int data) { // method2
        Node temp = head;
        Node newNode = new Node(data); // creating a node

        if (head == null) {
            head = newNode;
            return;
        }

        while (temp.Next != null) {
            temp = temp.Next;
        }
        temp.Next = newNode;
    }

    // Insert at specific position

    public void InsertAtSpecificPos(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            InsertAtBegin(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data); // when we insert we should create a new node

        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.Next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            newNode.Next = temp.Next;
            temp.Next = newNode;
        }

    }

    // DeleteAtBeginning

    public void DeleteAtBeg() {
        if (head == null) {
            return;
        }
        head = head.Next;
    }

    // DeleteAtEnd

    public void DeleteAtEnd() {
        Node temp = head;

        while (temp.Next.Next != null) {
            temp = temp.Next;
        }
        temp.Next = null;
    }

    // Delete at specific position

    public void DeleteAtSpecificPos(int pos) {

        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 1) {
            DeleteAtBeg();
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.Next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            temp.Next = temp.Next.Next;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.Next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.InsertAtBegin(10);
        list.InsertAtBegin(20);
        list.InsertAtBegin(30);
        list.InsertAtBegin(40);
        list.InsertAtBegin(50);

        list.InsertAtEnd(60);
        list.InsertAtEnd(70);
        list.InsertAtEnd(80);

        list.InsertAtSpecificPos(75, 4);

        // list.DeleteAtBeg();
        // list.DeleteAtBeg();

        // list.DeleteAtEnd();

        list.DeleteAtSpecificPos(3);

        list.display();
    }

}