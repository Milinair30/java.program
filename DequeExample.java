import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Adding elements
        deque.addFirst("First");
        deque.addLast("Last");

        // Removing elements
        String first = deque.removeFirst();
        String last = deque.removeLast();

        System.out.println("Removed first: " + first);
        System.out.println("Removed last: " + last);

        // Checking size
        System.out.println("Size of deque: " + deque.size());

        // Adding more elements
        deque.offerFirst("New First");
        deque.offerLast("New Last");

        // Peeking elements
        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());

        // Iterating
        System.out.println("Deque contents:");
        for (String element : deque) {
            System.out.println(element);
        }
    }
}
