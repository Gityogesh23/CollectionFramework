package Map_Interface.Demo_3_ConcurrentHashMapExample;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {

        // Create ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add some initial values
        map.put("Java", 1);
        map.put("Python", 2);

        // Thread 1: adds more entries
        Thread t1 = new Thread(() -> {
            map.put("C++", 3);
            System.out.println("Thread 1: Added C++");
        });

        // Thread 2: reads and modifies the map
        Thread t2 = new Thread(() -> {
            map.computeIfPresent("Python", (k, v) -> v + 10);
            map.putIfAbsent("Go", 4);
            System.out.println("Thread 2: Modified Python and added Go");
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final map content
        System.out.println("Final Map Content: " + map);
    }
}
/*
 Why ConcurrentHashMap?
It allows multiple threads to read/write without locking the entire map.

Uses bucket-level locking, so higher concurrency than Collections.synchronizedMap().

Safe for multi-threaded environments, such as caching, counters, etc.
 */