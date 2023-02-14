package s1;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.ls.LSOutput;

@Getter
@Setter
public class Pets {
    private String animal;
    private String name;
    private int age;

    public Pets(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name;
    }
    public void getVoice(Person person) {
        if (animal.equals("cat")) {
            System.out.println(person + " позвал(а) кота и он сказал: Meow");
        } else if (animal.equals("dog")) {
            System.out.println(person + " позвал(а) собаку и он сказал: Woof");
        } else if (animal.equals("parrot")) {
            System.out.println(person + " позвал(а) попугая и он сказал: Chirp");
        } else {
            System.out.println("I don't wanna speak");
        }
    }
    
}
