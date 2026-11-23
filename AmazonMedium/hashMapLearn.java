package AmazonMedium;
import java.util.*;

public class hashMapLearn {
    public static void main(String[] args) {
        HashMap<String, List<String>> hm = new HashMap<>();
        hm.put("Nidhi", Arrays.asList("she","love","beauty", "hardworking"));
        hm.put("Richa", Arrays.asList("she", "hardworking","beautiful"));
        hm.put("Banku", Arrays.asList("he", "handsome", "athlete","hardworking"));
        hm.put("Niki", Arrays.asList("she", "beautiful", "hardworking", "spiritual"));
        for (Map.Entry<String, List<String>> entry : hm.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue() + " ");
        }
        System.out.println(hm.get("Nidhi"));

        List<String> a = hm.get("Nidhi");
        // a.add("mommy");
        System.out.println(a);
    }
}
