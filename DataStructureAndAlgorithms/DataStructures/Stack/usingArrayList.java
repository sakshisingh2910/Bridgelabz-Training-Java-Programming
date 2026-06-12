import java.util.ArrayList;

public class usingArrayList {
    static class Stack {
    ArrayList<Integer> list = new ArrayList<>();
       // Push Operation
        public void push(int data) {
            list.add(data);
        }

        // Pop Operation
        public int pop() {

            if (list.size() == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek Operation
        public int peek() {

            if (list.size() == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return list.get(list.size() - 1);
        }

        // isEmpty Operation
        public boolean isEmpty() {
            return list.size() == 0;
        }
    }

    public static void main(String args[]) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top Element: " + s.peek());
        System.out.println("Removed: " + s.pop());
        System.out.println("Top After Pop: " + s.peek());
    }
}

