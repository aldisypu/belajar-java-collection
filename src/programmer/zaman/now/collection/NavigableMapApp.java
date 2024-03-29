package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
  public static void main(String[] args) {

    NavigableMap<String, String> map = new TreeMap<>();

    map.put("Aldi", "Aldi");
    map.put("Budi", "Budi");
    map.put("Joko", "Joko");

    for (var key : map.keySet()){
      System.out.println(key);
    }

    System.out.println(map.lowerKey("Aldi"));
    System.out.println(map.higherKey("Aldi"));

    NavigableMap<String, String> mapDesc = map.descendingMap();
    for (var key : mapDesc.keySet()){
      System.out.println(key);
    }

    NavigableMap<String, String> empty = Collections.emptyNavigableMap();
    NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

    // immutable.put("Eko", "Eko"); error

  }
}
