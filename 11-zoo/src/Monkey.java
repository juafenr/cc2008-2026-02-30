public class Monkey extends Animal
{
    public Monkey(String name, int dob) {
        super(name, dob);
    }

    @Override
    public void makeSound() {
        System.out.println("OOOHHH AAAHHH");
    }
}