import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("name1",4);
        hashMap.put("name4",1);
        hashMap.put("name2",3);
        System.out.println("HashMap:");
        System.out.println(hashMap);
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap:");
        System.out.println(treeMap);
        Map<String,Integer> linkedMap = new LinkedHashMap<>(hashMap);
        System.out.println(linkedMap.get("name2"));

    }
}
