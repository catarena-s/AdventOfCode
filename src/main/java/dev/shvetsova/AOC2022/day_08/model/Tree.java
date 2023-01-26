package dev.shvetsova.AOC2022.day_08.model;

public class Tree {
    private final int height;
    private Tree top;
    private Tree left;
    private Tree bottom;
    private Tree right;

    public Tree(int height) {
        this.height = height;
    }

    public void setTop(final Tree top) {
        this.top = top;
        this.top.setBottom(this);
    }

    public void setLeft(final Tree left) {
        this.left = left;
        this.left.setRight(this);
    }

    public void setRight(final Tree right) {
        this.right = right;
    }

    public void setBottom(final Tree bottom) {
        this.bottom = bottom;
    }

    private int getMax(final Direction direction) {
        int maxHeight = 0;
        Tree neighbor = getNext(this, direction);
        do {
            if (neighbor.height >= height) return neighbor.height;
            neighbor = getNext(neighbor, direction);
        } while (neighbor != null);
        return maxHeight;
    }

    Tree getNext(final Tree tree, final Direction direction) {
        return Direction.TOP.equals(direction) ? tree.top :
                Direction.BOTTOM.equals(direction) ? tree.bottom :
                        Direction.LEFT.equals(direction) ? tree.left : tree.right;
    }

    public int getsScenicScore() {
        final int scoreTop = getScore(this, Direction.TOP);
        final int scoreLeft = getScore(this, Direction.LEFT);
        final int scoreRight = getScore(this, Direction.RIGHT);
        final int scoreBottom = getScore(this, Direction.BOTTOM);
        return scoreLeft * scoreRight * scoreTop * scoreBottom;
    }

    private int getScore(final Tree tree, final Direction direction) {
        final Tree tmp = getNext(tree, direction);
        int scoreRight = 0;
        if (tmp == null) return scoreRight;
        scoreRight++;
        if (tmp.height >= height) return scoreRight;
        else
            scoreRight += getScore(tmp, direction);

        return scoreRight;
    }

    public boolean isVisible() {
        return (top == null) || (right == null) || (left == null) || (bottom == null)
                || ((height - getMax(Direction.TOP)) > 0)
                || ((height - getMax(Direction.BOTTOM)) > 0)
                || ((height - getMax(Direction.RIGHT)) > 0)
                || ((height - getMax(Direction.LEFT)) > 0);
    }
}
