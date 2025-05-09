//package Map_Interface.Demo_2_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
class Demo_1{
public static void main(String[] args){
        Map<String, String> cityCountryMap = new LinkedHashMap<>();

        // 2. Adding key-value pairs (insertion order is maintained)
        cityCountryMap.put("London", "UK");
        cityCountryMap.put("Tokyo", "Japan");
        cityCountryMap.put("Paris", "France");
        cityCountryMap.put("New York", "USA");
        cityCountryMap.put("London", "United Kingdom"); // Duplicate key, value is updated

        System.out.println("1. LinkedHashMap after initial insertions:");
        printMap(cityCountryMap); // Helper method to print the map

        // 3. Common Map methods

        // a) size(): Returns the number of key-value mappings
        System.out.println("\n2. Size of the map: " + cityCountryMap.size());

        // b) isEmpty(): Checks if the map is empty
        System.out.println("3. Is the map empty? " + cityCountryMap.isEmpty());

        // c) containsKey(Object key): Checks if the map contains a mapping for the specified key
        System.out.println("4. Does the map contain 'Paris'? " + cityCountryMap.containsKey("Paris"));
        System.out.println("5. Does the map contain 'Berlin'? " + cityCountryMap.containsKey("Berlin"));

        // d) containsValue(Object value): Checks if the map contains a mapping for the specified value
        System.out.println("6. Does the map contain 'USA'? " + cityCountryMap.containsValue("USA"));
        System.out.println("7. Does the map contain 'Germany'? " + cityCountryMap.containsValue("Germany"));

        // e) get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
        System.out.println("8. Country for 'Tokyo': " + cityCountryMap.get("Tokyo"));
        System.out.println("9. Country for 'Sydney': " + cityCountryMap.get("Sydney"));

        // f) put(K key, V value): Associates the specified value with the specified key in this map. If the map previously contained a mapping for the key, the old value is replaced.
        cityCountryMap.put("Berlin", "Germany");
        System.out.println("\n10. LinkedHashMap after adding 'Berlin':");
        printMap(cityCountryMap);

        // g) remove(Object key): Removes the mapping for the specified key from this map if present.
        cityCountryMap.remove("Paris");
        System.out.println("\n11. LinkedHashMap after removing 'Paris':");
        printMap(cityCountryMap);

        // h) keySet(): Returns a Set view of the keys contained in this map. The order of the set is the insertion order of the keys.
        Set<String> keys = cityCountryMap.keySet();
        System.out.println("\n12. Key Set (insertion order): " + keys);

        // i) values(): Returns a Collection view of the values contained in this map. The order of the collection is the insertion order of the values.
        java.util.Collection<String> values = cityCountryMap.values();
        System.out.println("13. Values (insertion order): " + values);

        // j) entrySet(): Returns a Set view of the mappings contained in this map. The order of the set is the insertion order of the entries.
        Set<Map.Entry<String, String>> entries = cityCountryMap.entrySet();
        System.out.println("\n14. Entry Set (insertion order):");
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // k) clear(): Removes all of the mappings from this map.
        cityCountryMap.clear();
        System.out.println("\n15. LinkedHashMap after clear():");
        System.out.println("Is the map empty now? " + cityCountryMap.isEmpty());
        System.out.println("Size of the map now: " + cityCountryMap.size());
    }

    // Helper method to print the map in its insertion order
    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}