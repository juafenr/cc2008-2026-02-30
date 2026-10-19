public class Gengar extends Pokemon implements IFantasma, IVeneno {

    public Gengar(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public void atacar() {
        System.out.println(this.nombre + " usa Bola Sombra.");
    }

    @Override
    public void atravesarMuros() {
        System.out.println(this.nombre + " atraviesa el muro.");
    }

    @Override
    public void envenenar() {
        System.out.println(this.nombre + " envenena al rival.");
    }
}
