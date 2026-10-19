public abstract class Mammal extends Animal
{
    protected double milkConsumption;

    public Mammal(String name, int dob, double milkConsumption) {
        super(name, "Mammal", dob);

        this.milkConsumption = milkConsumption;
    }
}