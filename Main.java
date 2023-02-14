package s1;

public class Main {

    public static void main(String[] args) {
        Person misha = new Person("Misha", 5);
        Person dasha = new Person("Dasha", 25);
        Person danya = new Person("Danya", 3);

        Relationships mishaDasha = new Relationships();
        mishaDasha.makeChild(dasha, misha);
        mishaDasha.makeChild(dasha, danya);
        dasha.showChildren();
        misha.showParents();

        Pets cat = new Pets("cat","Martin", 5);
        Pets dog = new Pets("dog","Baron", 2);

        cat.getVoice(misha);
        dog.getVoice(danya);
    }

}
