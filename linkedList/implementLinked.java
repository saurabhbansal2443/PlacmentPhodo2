package linkedList;

public class implementLinked {
    public static void main(String[] args) {
        MylinkedList list = new MylinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
         list.addLast(40);
        list.removeAt(1);

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

    public int getFirst() {
        if (head == null) {
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (tail == null) {
            return -1;
        } else {
            return tail.data;
        }
    }

    public int getAt(int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return -1;
        } else if (idx == 0) {
            return getFirst();
        } else if (idx == this.size) {
            return getLast();
        } else {

            Node temp = head;

            while (idx > 0) {
                temp = temp.next;
                idx--;
            }

            return temp.data;
        }
    }

    public int removeFirst() {
        if (this.size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else if (this.size == 1) {
            int ans = this.head.data;
            this.head = this.tail = null;
            this.size--;
            return ans;
        } else {
            int ans = this.head.data;
            head = head.next;
            this.size--;
            return ans;
        }
    }

    public int removeLast() {
        if (this.size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else if (this.size == 1) {
            int ans = this.head.data;
            this.head = this.tail = null;
            this.size--;
            return ans;
        } else {
            int ans = this.tail.data;
            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
            this.tail = temp;
            this.size--;

            return ans;
        }
    }

    public int removeAt(int idx){
        if(idx<0 ||idx>=this.size() ){
            System.out.println("Invalid Index");
            return -1 ;
        }else if ( idx ==0 ){
            return this.removeFirst();
        }else if ( idx == this.size-1){
            return this.removeLast();
        }else{
            Node temp = head ;
            while(idx-1>0){
                temp = temp.next;
                idx--;
            }
            int ans = temp.next.data;
            temp.next = temp.next.next;
            this.size--;
            return ans ;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    public int size(){
        return this.size;
    }
}
