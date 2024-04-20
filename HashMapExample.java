import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding elements to the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        System.out.println("HashMap: " + hashMap);

        // Get a value by key
        System.out.println("Value for key 2: " + hashMap.get(2));

        // Check if key exists
        System.out.println("Contains key 3: " + hashMap.containsKey(3));

        // Check if value exists
        System.out.println("Contains value 'Two': " + hashMap.containsValue("Two"));

        // Get size of HashMap
        System.out.println("Size of HashMap: " + hashMap.size());

        // Remove an entry
        hashMap.remove(1);
        System.out.println("After removing key 1: " + hashMap);

        // Replace a value
        hashMap.replace(2, "NewTwo");
        System.out.println("After replacing value at key 2: " + hashMap);

        // Clear the HashMap
        hashMap.clear();
        System.out.println("After clearing, HashMap: " + hashMap);
    }
}
