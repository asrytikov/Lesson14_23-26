import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> names = new TreeMap<>();
        names.put(10, "Alex");
        names.put(1, "Masha");
        names.put(11, "Ivan");
        names.put(5, "Katya");

        for(Map.Entry<Integer, String> entry : names.entrySet()){
            System.out.printf("Key %d Value: %s\n", entry.getKey(), entry.getValue());
        }

        Set<Integer> keys = names.keySet();
        Collection<String> values = names.values();

        Map<Integer, String> hNames = names.headMap(5);
        Map<Integer, String> tNames = names.tailMap(5);

        System.out.println(hNames);
        System.out.println(tNames);

        Map.Entry<Integer, String> name = names.lastEntry();
        System.out.println(name.getKey());
        System.out.println(name.getValue());

        System.out.println(names.get(10));
        System.out.println(names.containsValue("Alex"));
        System.out.println(names.containsKey(11));

        System.out.println(names.firstEntry());
        System.out.println(names.lastEntry());

        Map<String, People> peoples = new TreeMap<>();
        peoples.put("asdh23", new People("Ivan"));
        peoples.put("23dfgh", new People("Masha"));

        for(Map.Entry<String, People> peopleEntry: peoples.entrySet()){
            System.out.printf("Key: %s Value: %s\n", peopleEntry.getKey(), peopleEntry.getValue().getName());
        }




    }
}