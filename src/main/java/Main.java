import model.Hero;
import model.Point;
import strategy.Fly;
import strategy.HorseRide;
import strategy.Walk;

public class Main {
    static void main() {
        Hero hero = new Hero("Nikita", new Point(0, 0), new Walk());
        hero.move(new Point(3, 4));

        hero.setStrategy(new HorseRide());
        hero.move(new Point(63, 84));

        hero.setStrategy(new Fly());
        hero.move(new Point(423, 564));

        hero.setStrategy(new Walk());
        hero.move(new Point(420, 560));
    }
}
