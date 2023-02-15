package s1;

public class Main {

    public static void main(String[] args) {
        Person misha = new Person("Misha", 5);
        Person dasha = new Person("Dasha", 25);
        Person danya = new Person("Danya", 3);

        Relationships mishaDasha = new Relationships();
        mishaDasha.makeChild(dasha, misha);
        mishaDasha.makeChild(dasha, danya);
        dasha.showChildren(dasha);
        misha.showParents(misha);

        Cat cat = new Cat("Martin", 5);
        cat.getVoice(misha);
        Dog dog = new Dog("Archi", 2);
        dog.getVoice(misha);
    }

}
