public class Gyarados extends Pokemon implements IAgua, IVolador {
    protected int presion;

    public Gyarados(String nombre, int nivel, int hp, int presion) {
        super(nombre, nivel, hp);
        this.presion = presion;
    }

    @Override
    public void atacar() {
        System.out.println(this.nombre + " usa Hidrobomba.");
    }

    @Override
    public void usarSurf() {
        System.out.println(this.nombre + " usa Surf a " + this.presion + " psi.");
    }

    @Override
    public void volar() {
        System.out.println(this.nombre + " se eleva sobre las olas.");
    }
}
