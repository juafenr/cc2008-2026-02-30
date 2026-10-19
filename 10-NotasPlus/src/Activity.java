public abstract class Activity
{
    protected String name;
    protected double weight;
    protected double score;

    // tabla de pesos
    // parciales - 30%
    // labs - 50%
    // classwork - 20%

    public Activity(String name, double weight, double score) {
        // System.out.println("Ejecutando constructor de Activity");
        this.name = name;
        this.weight = weight;
        this.score = score;
    }

    // public void accesible() {
    //     System.out.println("Método accesible");
    // }

    // protected void accesiblep() {
    //     System.out.println("Método accesibl pero protected");
    // }

    // private void notaccesible() {
    //     System.out.println("Método NO accesible");
    // }

    protected String getName() {
        return this.name;
    }

}