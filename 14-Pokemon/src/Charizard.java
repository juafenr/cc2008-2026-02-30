public class Charizard extends Pokemon implements IFuego, IVolador {
    protected int temperatura;

    public Charizard(String nombre, int nivel, int hp, int temperatura) {
        super(nombre, nivel, hp);
        this.temperatura = temperatura;
    }

    @Override
    public void atacar() {
        System.out.println(this.nombre + " usa Ataque Ala.");
    }

    @Override
    public void usarLanzallamas() {
        System.out.println(this.nombre + " usa Lanzallamas a " + this.temperatura + " °C.");
    }

    @Override
    public void volar() {
        System.out.println(this.nombre + " sobrevuela el volcán.");
    }
}
