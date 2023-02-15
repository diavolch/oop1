package s1;

import java.util.ArrayList;

public interface Tree {
    ArrayList<Person> children = new ArrayList<>();
    ArrayList<Person> parents = new ArrayList<>();
    default void isChild(Person name) {
        parents.add(name);
    }
    default void isParent(Person name) {
        children.add(name);
    }
    default void showChildren(Person name) {
        System.out.println(name + " children is: ");
        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i).getName());
        }
        System.out.println();
    }
    default void showParents(Person name) {
        System.out.println(name + " parent is: ");
        for (int i = 0; i < parents.size(); i++) {
            System.out.println(parents.get(i).getName());
        }
        System.out.println();
    }
}
