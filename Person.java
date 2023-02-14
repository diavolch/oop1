package s1;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private LinkedList<Person> children = new LinkedList<>();
    private LinkedList<Person> parents = new LinkedList<>();
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void isChild(Person name) {
        parents.add(name);
    }
    public void isParent(Person name) {
        children.add(name);
    }
    @Override
    public String toString() {
        return name;
    }
    public void showChildren() {
        System.out.println(name + " children is: ");
        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i).getName());
        }
        System.out.println();
    }
    public void showParents() {
        System.out.println(name + " parent is: ");
        for (int i = 0; i < parents.size(); i++) {
            System.out.println(parents.get(i).getName());
        }
        System.out.println();
    }
}
