class PriorityQueue {
    int[] q = new int[5];
    int size = 0;

    void enqueue(int x) {
        int i;
        for (i = size - 1; i >= 0 && q[i] < x; i--) {
            q[i + 1] = q[i];
        }
        q[i + 1] = x;
        size++;
    }

    void dequeue() {
        if (size == 0) return;
        size--;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(q[i] + " ");
        }
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue(10);
        pq.enqueue(50);
        pq.enqueue(20);
        pq.dequeue();
        pq.display();
    }
}