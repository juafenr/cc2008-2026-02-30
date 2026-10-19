public abstract class Animal
{
    protected String name;
    protected String type;
    protected int dob;

    public Animal(String name, String type, int dob) {
        this.name = name;
        this.type = type;
        this.dob = dob;
    }

    public abstract void makeSound();
}