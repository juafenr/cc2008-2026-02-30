public class Lion extends Mammal
{
    public Lion(String name, int dob, double milkConsumption) {
        super(name, dob, milkConsumption);
    }

    @Override
    public void makeSound() {
        System.out.println("ROARRRRRR");
    }
}