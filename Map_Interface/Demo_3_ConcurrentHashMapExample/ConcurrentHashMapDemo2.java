//package Map_Interface.Demo_3_ConcurrentHashMapExample;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 {

    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Put some initial values
        map.put("A", 1);
        map.put("B", 2);

        // Create a thread that adds a value
        Thread writerThread = new Thread(() -> {
            map.put("C", 3);
            System.out.println("Writer Thread: Added C = 3");
        });

        // Create a thread that reads and updates a value
        Thread readerThread = new Thread(() -> {
            map.computeIfPresent("A", (k, v) -> v + 5); // A becomes 6
            System.out.println("Reader Thread: Updated A to " + map.get("A"));
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final map content
        System.out.println("Final Map: " + map);
    }
}
