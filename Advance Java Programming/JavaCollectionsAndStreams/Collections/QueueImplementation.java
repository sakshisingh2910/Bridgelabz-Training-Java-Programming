package JavaCollectionsAndStreams.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class QueueImplementation {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        System.out.println("Front Element: " + queue.peek());

        queue.poll();

        System.out.println(queue);
    }
}