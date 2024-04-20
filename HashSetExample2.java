import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        // Create two HashSet objects
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // Add elements to set1
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        System.out.println("Set 1: " + set1);

        // Check if set1 is empty
        System.out.println("Is set1 empty? " + set1.isEmpty());

        // Add elements to set2
        set2.add("Banana");
        set2.add("Grapes");
        set2.add("Kiwi");

        System.out.println("Set 2: " + set2);

        // Adding all elements of set2 to set1
        set1.addAll(set2);
        System.out.println("After adding set2 to set1: " + set1);

        // Check if set1 contains all elements of set2
        System.out.println("Does set1 contain all elements of set2? " + set1.containsAll(set2));

        // Retain only the elements that are common to both sets
        set1.retainAll(set2);
        System.out.println("After retaining common elements: " + set1);

        // Remove all elements from set1 that are also in set2
        set1.removeAll(set2);
        System.out.println("After removing all elements in set2: " + set1);

        // Clear set2
        set2.clear();
        System.out.println("Set 2 after clearing: " + set2);
    }
}
