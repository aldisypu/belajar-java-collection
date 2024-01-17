package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
  public static void main(String[] args) {

    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("Aldi", "Syah", "Putra", "Programmer", "Zaman", "Now"));

    NavigableSet<String> namesReverse = names.descendingSet();
    NavigableSet<String> syah = names.tailSet("Syah", true);

    for (var name : syah) {
      System.out.println(name);
    }

    NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
    // immutable.add("Ups");

  }
}
