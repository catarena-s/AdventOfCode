package dev.shvetsova.AOC2022.day_09.model;

public class Node {
    protected int x;
    protected int y;
    protected Node tail;

    public Node() {
        this.x = 0;
        this.y = 0;
    }

    public Node(final int x, final int y) {
        this.x = x;
        this.y = y;
    }


}
