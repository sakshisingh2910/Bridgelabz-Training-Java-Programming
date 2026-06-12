class CNode {
    int data;
    CNode next;

    CNode(int data) {
        this.data = data;
    }
}

class CircularLinkedList {
    CNode head;
    CNode tail;

    void insert(int data) {
        CNode newNode = new CNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    void display() {
        if (head == null) return;

        CNode temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.display();
    }
}