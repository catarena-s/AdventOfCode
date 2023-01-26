package dev.shvetsova.AOC2022.day_11.model;

public class Monkey implements Comparable<Monkey> {
    private final WorryLevel worryLevel = new WorryLevel();
    private long countTest = 0;
    private boolean isUseOld;
    private Operation operation;
    private int operationValue;
    private Monkey ifTrue;
    private Monkey ifFalse;
    private int div;
    public Monkey() {
    }

    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }

    public void setIfTrue(Monkey ifTrue) {
        this.ifTrue = ifTrue;
    }

    public void setIfFalse(Monkey ifFalse) {
        this.ifFalse = ifFalse;
    }

    public long getCountTest() {
        return countTest;
    }

    public WorryLevel getThings() {
        return worryLevel;
    }

    @Override
    public int compareTo(Monkey monkey) {
        return (int) (monkey.countTest - countTest);
    }

    public void test(long newValue) {
        if (newValue % div == 0) {
            ifTrue.getThings().addLast(newValue);
        } else {
            ifFalse.getThings().addLast(newValue);
        }
        countTest++;
    }

    public void initMonkeyItems(String[] items) {
        String[] worryLevels = items[1].split(",");
        for (String level : worryLevels) {
            worryLevel.addLast(Long.parseLong(level.trim()));
        }
    }

    public void initOperation(String[] items) {
        Operation o = Operation.get(items[1].trim());
        if(o!=null) {
            String[] rule = items[1].split(o.getSing());
            if (rule[1].trim().matches("[-+]?\\d+"))
                operationValue = Integer.parseInt(rule[1].trim());
            else {
                isUseOld = true;
            }
            operation = o;
        }
    }

    public long monkeyInspection(long old) {
        return operation.applyAsLong(old, isUseOld ? old : operationValue);
    }
}
