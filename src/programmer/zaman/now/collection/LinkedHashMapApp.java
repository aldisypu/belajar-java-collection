package programmer.zaman.now.collection;

import com.sun.tools.javac.Main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
  public static void main(String[] args) {

    Map<String, String> map = new LinkedHashMap<>();

    map.put("first", "Aldi");
    map.put("last", "Puta");
    map.put("middle", "Syah");

    Set<String> keys = map.keySet();
    for (var key : keys) {
      System.out.println(key);
    }

  }
}
