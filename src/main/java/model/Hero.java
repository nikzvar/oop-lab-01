package model;

import strategy.MoveStrategy;

public class Hero {
    private final String name;
    private Point position;
    private MoveStrategy strategy;

    public Hero(String name, Point start, MoveStrategy strategy) {
        this.name = name;
        this.position = start;
        this.strategy = strategy;
    }

    public void setStrategy(MoveStrategy strategy) {
        this.strategy = strategy;
    }

    public void move(Point target) {
        System.out.print(name + ": ");
        strategy.move(position, target);
        position = target;
    }
}
