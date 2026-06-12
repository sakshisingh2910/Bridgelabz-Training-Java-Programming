class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class QueueLL {
    Node front, rear;

    void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null) {
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
    }

    void dequeue() {
        if (front == null) return;
        front = front.next;
        if (front == null) rear = null;
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.dequeue();
        q.display();
    }
}