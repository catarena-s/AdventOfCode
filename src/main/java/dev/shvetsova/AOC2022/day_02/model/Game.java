package dev.shvetsova.AOC2022.day_02.model;

public class Game {
    private final String you;
    private final String partner;

    public Game(String you, String partner) {
        this.you = you;
        this.partner = partner;
    }

    public int getResultStrategyOne() {
        RockPaperScissors elf = RockPaperScissors.get(partner);
        RockPaperScissors youChoice = RockPaperScissors.get(you);

        int result = youChoice.getValue();
        if (youChoice.ifWin().equals(elf)) {
            result += Results.WIN.getValue();
        } else if (youChoice.ifLost().equals(elf)) {
            result += Results.LOST.getValue();
        } else result += Results.DRAW.getValue();

        return result;
    }

    public int getResultStrategyTwo() {
        Results result = Results.get(you);
        RockPaperScissors elf = RockPaperScissors.get(partner);
        if (Results.LOST.equals(result))
            return elf.ifWin().getValue() + Results.LOST.getValue();
        if (Results.DRAW.equals(result)) return elf.getValue() + Results.DRAW.getValue();
        return elf.ifLost().getValue() + Results.WIN.getValue();
    }
}
