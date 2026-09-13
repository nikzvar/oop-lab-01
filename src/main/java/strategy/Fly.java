package strategy;

import model.Point;

public class Fly implements MoveStrategy {

    @Override
    public void move(Point from, Point to) {
        System.out.printf("flies from %s to %s, time: %.1f h%n", from, to, from.distanceTo(to) / 60);
    }
}
