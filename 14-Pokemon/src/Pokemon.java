public abstract class Pokemon {
    protected String nombre;
    protected int nivel;
    protected int hp;

    public Pokemon(String nombre, int nivel, int hp) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
    }

    public abstract void atacar();

    public void mostrarFicha() {
        System.out.println(this.nombre + " | Nv. " + this.nivel + " | HP " + this.hp);
    }
}
