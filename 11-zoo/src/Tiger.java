public class Tiger extends Animal
{
    public Tiger(String name, int dob) {
        super(name, dob);
    }

    @Override
    public void makeSound() {
        System.out.println("GRRRRRRRRRRR");
    }
}