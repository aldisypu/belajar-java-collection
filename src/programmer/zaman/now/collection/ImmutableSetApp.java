package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
  public static void main(String[] args) {

    Set<String> empty = Collections.emptySet();
    Set<String> one = Collections.singleton("Aldi");

    Set<String> mutable = new HashSet<>();
    mutable.add("Aldi");
    mutable.add("Syah");
    Set<String> immutable = Collections.unmodifiableSet(mutable);

    Set<String> set = Set.of("Aldi", "Syah");

    // set.add("Eko"); error
    // set.remove("Eko"); error

  }
}
