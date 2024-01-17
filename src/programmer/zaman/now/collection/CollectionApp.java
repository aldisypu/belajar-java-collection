package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
  public static void main(String[] args) {

    Collection<String> collection = new ArrayList<>();

    collection.add("Aldi");
    collection.add("Syah");
    collection.add("Putra");
    collection.addAll(List.of("Programmer", "Zaman", "Now"));

    for (var value : collection) {
      System.out.println(value);
    }

    System.out.println("REMOVE");

    collection.remove("Aldi");
    collection.remove("Budi");
    collection.removeAll(List.of("Zaman", "Now"));

    for (var value : collection) {
      System.out.println(value);
    }

    System.out.println(
        collection.contains("Syah")
    );

    System.out.println(
        collection.containsAll(List.of("Putra", "Programmer"))
    );

    System.out.println(collection.size());

  }
}
