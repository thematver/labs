import pokemons.*;
import ru.ifmo.se.pokemon.*;


class Main {

    public static void main(String[] args) {

        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Савелий", 1);
        Tornadus p2 = new Tornadus("Лиза", 1);
        Trapinch p3 = new Trapinch("Варя", 1);
        Venomoth p4 = new Venomoth("Сева", 1);
        Venonat p5 = new Venonat("Никита", 1);
        Vibrava p6 = new Vibrava("Марьяна", 1);
        Flygon p7 = new Flygon("Матвей", 3);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addAlly(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.addFoe(p7);
        b.go();

    }
}
