package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
  public static void main(String[] args) {

    Map<String, String> empty = Collections.emptyMap();
    Map<String, String> singleton = Collections.singletonMap("name", "Aldi");

    Map<String, String> mutable = new HashMap<>();
    mutable.put("name", "Aldi");
    Map<String, String> immutable = Collections.unmodifiableMap(mutable);

    Map<String, String> map = Map.of(
        "first", "Aldi",
        "middle", "Syah",
        "last", "Putra"
    );

    // map.put("a", "A"); error

  }
}
