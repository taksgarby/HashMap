import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> favrouriteFruits = new HashMap<String, String>();

        favrouriteFruits.put("Alice", "Apple");
        favrouriteFruits.put("Sara", "Banana");
        favrouriteFruits.put("Bob", "Strawberry");

        System.out.println(favrouriteFruits.get("Alice"));
    }
}
