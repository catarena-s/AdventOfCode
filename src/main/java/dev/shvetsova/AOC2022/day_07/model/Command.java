package dev.shvetsova.AOC2022.day_07.model;

public enum Command {
    COMMAND,
    DIR, FILE,
    HEAD,
    CD, CD_DIR,
    STEP_BACK,
    LS;


    public static Command get(String str) {
        switch (str) {
            case "$":
                return COMMAND;
            case "dir":
                return DIR;
            case "cd":
                return CD;
            case "/":
                return HEAD;
            case "..":
                return STEP_BACK;
            case "ls":
                return LS;
            default:
                if (str.matches("[-+]?\\d+"))
                    return FILE;
                else return CD_DIR;
        }
    }

    public void execute(String[] input, FileSystem disc) {
        switch (this) {
            case COMMAND -> {
                Command c = get(input[1]);
                c.execute(input, disc);
            }
            case CD -> {
                Command c = get(input[2]);
                c.execute(input, disc);
            }
            case CD_DIR -> {
                disc.setCurrent(disc.getCurrent().getIncludedPath()
                        .stream()
                        .filter(f -> f.getName().equals(input[2].trim()))
                        .findFirst()
                        .get());
            }
            case HEAD -> disc.setCurrent(disc.getHead());
            case STEP_BACK -> disc.setCurrent(disc.getCurrent().getPath());
            case LS -> {
            }
            case DIR -> disc.addPath(input[1].trim());
            case FILE -> disc.addFile(input[1], Long.parseLong(input[0].trim()));
            default -> throw new IllegalStateException("Unexpected value: " + this);
        }
    }
}
