package s1;

public class Dog extends Pets{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void getVoice(Person person) {
        System.out.println(person + " позвал(а) собаку и она сказала: Woof!");
    }
}
