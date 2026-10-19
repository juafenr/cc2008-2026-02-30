import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gengar gengar = new Gengar("Gengar", 45, 60);
        Dragonite dragonite = new Dragonite("Dragonite", 55, 91);
        Gyarados gyarados = new Gyarados("Gyarados", 40, 95, 120);
        Charizard charizard = new Charizard("Charizard", 36, 78, 1500);
        Zapdos zapdos = new Zapdos("Zapdos", 50, 90, 1000);

        ArrayList<Pokemon> capturados = new ArrayList<>();
        capturados.add(gengar);
        capturados.add(dragonite);
        capturados.add(gyarados);
        capturados.add(charizard);
        capturados.add(zapdos);

        for (Pokemon p : capturados) {
            p.mostrarFicha();
            p.atacar();
        }

        System.out.println();

        ArrayList<IVolador> voladores = new ArrayList<>();
        voladores.add(dragonite);
        voladores.add(gyarados);
        voladores.add(charizard);
        voladores.add(zapdos);

        for (IVolador v : voladores) {
            v.volar();
        }
    }
}
