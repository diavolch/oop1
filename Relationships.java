package s1;

import java.util.LinkedList;

public class Relationships {
    public void makeChild(Person parent, Person child) {
        parent.isParent(child);
        child.isChild(parent);
    }

}