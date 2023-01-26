package dev.shvetsova.AOC2022.day_09.model;

import java.util.ArrayList;
import java.util.List;

public class Rope {
    private final Node head;
    private final Node tail;
    private final List<Node> tailPositions = new ArrayList<>();

    public int getTailWay() {
        return tailPositions.size();
    }

    public Rope(int size) {
        head = new Node();
        tail = initRope(head, size);
        tailPositions.add(new Node(tail.x, tail.y));
    }

    private Node initRope(final Node head, final int size) {
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            tmp.tail = new Node();
            tmp = tmp.tail;
        }
        return tmp;
    }

    public void move(final Motion motion, final int parseInt) {
        for (int i = 0; i < parseInt; i++) {
            moveHead(motion);
            moveTail();
            saveTailPosition();
        }
    }

    private void moveTail() {
        Node t = head.tail;
        Node h = head;
        do {
            moveNode(t, h);
            h = t;
            t = h.tail;
        } while (t != null);
    }

    private void moveNode(final Node t, final Node h) {
        int dx = h.x - t.x;
        int dy = h.y - t.y;
        if (Math.abs(dx) > 1) t.x += (dx > 0 ? 1 : -1);
        if (Math.abs(dy) > 1) t.y += (dy > 0 ? 1 : -1);
        if (Math.abs(dy) > 1 && (Math.abs(dx) == 1)) {
            t.x += (dx > 0 ? 1 : -1);
        }
        if (Math.abs(dx) > 1 && (Math.abs(dy) == 1)) {
            t.y += (dy > 0 ? 1 : -1);
        }
    }

    private void moveHead(final Motion motion) {
        head.x += motion.getDx();
        head.y += motion.getDy();
    }

    public void saveTailPosition() {
        boolean isMatch = tailPositions.stream()
                .noneMatch(position -> tail.x == position.x && tail.y == position.y);
        if (isMatch) tailPositions.add(new Node(tail.x, tail.y));
    }
}
