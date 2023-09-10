package linkedList;

public class implementLinked {
    public static void main(String[] args) {
        MylinkedList list = new MylinkedList();

       
        list.addLast(10);
          list.addLast(20);
           list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.addAt(3,99);

         list.addAt(5,99);

        list.display();
    }
}

class Node {
    int data;
    Node next;

    Node() {

    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MylinkedList {
    Node head;
    Node tail;
    int size;

    MylinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addLast(int val) {

        Node n = new Node(val);

        if (this.size == 0) {
            this.head = n;
            this.tail = n;

        } else {
            this.tail.next = n;
            this.tail = n;
        }

        this.size++;
    }

    public void addfirst(int val) {
        Node n = new Node(val);

        if (this.size == 0) {
            this.head = this.tail = n;

        } else {
            n.next = this.head;
            this.head = n;
        }
        this.size++;
    }

    public void addAt(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        } else if (idx == 0) {
            addfirst(val);
        } else if (idx == this.size) {
            addLast(val);
        } else {
            Node temp = head;

            while (idx - 1 > 0) {
                temp = temp.next;
                idx--;
            }

            Node n = new Node(val);

            n.next = temp.next;
            temp.next = n;
            this.size++;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }
}
