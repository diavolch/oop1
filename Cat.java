package s1;

public class Cat extends Pets {

    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void getVoice(Person person) {
        System.out.println(person + " позвал(а) кота и он сказал: Meow");
    }
}
