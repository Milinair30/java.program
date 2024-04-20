import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple"); 

        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Iterate over the elements 
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // Check if an element exists
        System.out.println("Contains 'Banana': " + linkedHashSet.contains("Banana"));

        // Remove an element
        linkedHashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedHashSet);

        // Size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Clear the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("After clearing, LinkedHashSet: " + linkedHashSet);
    }
}
