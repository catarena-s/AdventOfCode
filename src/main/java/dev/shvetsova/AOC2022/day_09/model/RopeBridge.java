package dev.shvetsova.AOC2022.day_09.model;

public class RopeBridge {
    private final Rope rope ;

    public RopeBridge(String[] motionList,int size) throws Exception {
        rope = new Rope(size);
        for (String m : motionList) {
            String[] motions = m.split(" ");
            Motion motion = Motion.get(motions[0].trim());
            rope.move(motion, Integer.parseInt(motions[1].trim()));
        }
    }

    public int getTailWay() {
        return rope.getTailWay();
    }
}

