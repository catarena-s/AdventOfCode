package dev.shvetsova.AOC2022.day_08.model;

import java.util.Arrays;

public class Forest {
    private final Tree[][] forest;

    public Forest(String[] inputS) {
        int verticalSize = inputS.length;
        int horizontalSize = inputS[0].length();

        forest = new Tree[verticalSize][horizontalSize];
        for (int i = 0; i < inputS.length; i++) {
            String[] trees = inputS[i].split("");
            for (int j = 0; j < trees.length; j++) {
                initForest(verticalSize, horizontalSize, i, trees[j], j);
            }
        }
    }

    public int getMaxScore() {
        return Arrays.stream(forest)
                .toList()
                .stream().mapToInt(mp -> Arrays.stream(mp)
                        .filter(Tree::isVisible)
                        .mapToInt(Tree::getsScenicScore)
                        .max().orElse(0))
                .max().getAsInt();
    }

    public int getCountVisibleTree() {
        return Arrays.stream(forest)
                .toList()
                .stream().mapToInt(mp -> Arrays.stream(mp)
                        .filter(Tree::isVisible)
                        .toList().size())
                .sum();
    }

    private void initForest(int verticalSize, int horizontalSize, int i, String treeHeight, int j) {
        final Tree tree = new Tree(Integer.parseInt(treeHeight));
        if (j > 0 && j < horizontalSize) {
            tree.setLeft(forest[i][j - 1]);
        }
        if (i > 0 && j < verticalSize) {
            tree.setTop(forest[i - 1][j]);
        }
        forest[i][j] = tree;
    }
}
