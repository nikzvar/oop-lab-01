package strategy;

import model.Point;


public interface MoveStrategy {
    void move(Point from, Point to);
}
