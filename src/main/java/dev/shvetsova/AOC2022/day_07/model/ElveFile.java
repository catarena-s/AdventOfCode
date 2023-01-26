package dev.shvetsova.AOC2022.day_07.model;

import lombok.Getter;

@Getter
public class ElveFile extends FileSystemObject {
    private final Long size;

    public ElveFile(String name, ElvePath path, Long size) {
        super(name, path);
        this.size = size;
    }

    @Override
    public String toString() {
        return "'" + name + '\'' + " , " + size;
    }
}
