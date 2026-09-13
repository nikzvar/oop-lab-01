package strategy;

import model.Point;

public class HorseRide implements MoveStrategy {

    @Override
    public void move(Point from, Point to) {
        System.out.printf("rides a horse from %s to %s, time: %.1f h%n", from, to, from.distanceTo(to) / 20);
    }
}
