public class Dragonite extends Pokemon implements IDragon, IVolador {

    public Dragonite(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public void atacar() {
        System.out.println(this.nombre + " usa Hiperrayo.");
    }

    @Override
    public void usarDragoaliento() {
        System.out.println(this.nombre + " usa Dragoaliento.");
    }

    @Override
    public void volar() {
        System.out.println(this.nombre + " vuela sobre el océano.");
    }
}
