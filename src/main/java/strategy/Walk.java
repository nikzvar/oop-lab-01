package strategy;

import model.Point;

public class Walk implements MoveStrategy {

    @Override
    public void move(Point from, Point to) {
        System.out.printf("walks from %s to %s, time: %.1f h%n", from, to, from.distanceTo(to) / 5);
    }
}
