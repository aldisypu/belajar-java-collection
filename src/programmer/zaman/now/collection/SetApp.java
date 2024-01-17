package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
  public static void main(String[] args) {

    // Set<String> names = new HashSet<>();
    Set<String> names = new LinkedHashSet<>();

    names.add("Aldi");
    names.add("Syah");
    names.add("Putra");
    names.add("Aldi");
    names.add("Syah");
    names.add("Putra");

    for (var name : names) {
      System.out.println(name);
    }

  }
}
