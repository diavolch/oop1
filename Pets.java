package s1;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.ls.LSOutput;

@Getter
@Setter
public abstract class Pets {
    private String name;
    private int age;

    public Pets(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name;
    }
    public abstract void getVoice(Person person);
    
}
