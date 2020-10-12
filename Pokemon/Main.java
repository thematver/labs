import pokemons.*;
import ru.ifmo.se.pokemon.*;


class Main {

public static void main(String[] args) {

Battle b = new Battle();
Pokemon p1 = new Pokemon("Нейт", 1);
Tornadus p2 = new Tornadus("Тайсон", 1);
Trapinch p3 = new Trapinch("Джон", 1);
Venomoth p4 = new Venomoth("Крон", 1);
Venonat p5 = new Venonat("Жаба", 1);
Vibrava p6 = new Vibrava("Фаркусон", 1);
Flygon p7 = new Flygon("Святослав", 1);

b.addAlly(p1);
b.addAlly(p2);
b.addAlly(p3);
b.addAlly(p4);
b.addFoe(p5);
b.addFoe(p6);

}
}
