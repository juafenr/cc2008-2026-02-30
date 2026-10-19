public class Zapdos extends Pokemon implements IElectrico, IVolador {
    protected int voltaje;

    public Zapdos(String nombre, int nivel, int hp, int voltaje) {
        super(nombre, nivel, hp);
        this.voltaje = voltaje;
    }

    @Override
    public void atacar() {
        System.out.println(this.nombre + " usa Pico Taladro.");
    }

    @Override
    public void usarImpactrueno() {
        System.out.println(this.nombre + " usa Impactrueno a " + this.voltaje + " V.");
    }

    @Override
    public void volar() {
        System.out.println(this.nombre + " cruza la tormenta.");
    }
}
