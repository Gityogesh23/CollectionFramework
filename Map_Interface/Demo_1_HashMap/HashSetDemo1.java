    import java.util.HashMap;
    import java.util.Map;
    public class HashSetDemo1 {
        public static void main(String[] args) {
            // Create a HashMap
            HashMap<String, Integer> marksMap = new HashMap<>();
    
            // Add key-value pairs
            marksMap.put("Alice", 85);
            marksMap.put("Bob", 90);
            marksMap.put("Charlie", 78);
    
            // Print the HashMap
            System.out.println("Marks Map: " + marksMap);
    
            // Access a value by key
            System.out.println("Bob's marks: " + marksMap.get("Bob"));
    
            // Check if a key exists
            System.out.println("Contains Alice? " + marksMap.containsKey("Alice"));
    
            // Remove a key-value pair
            marksMap.remove("Charlie");
    
            // Iterate through the HashMap
            System.out.println("Updated Marks:");
            for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
    