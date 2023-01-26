package dev.shvetsova.AOC2022.day_07.model;

public class ElveFile extends FileSystemObject {
    Long size;

    public Long getSize() {
        return size;
    }

    public ElveFile(String name, ElvePath path, Long size) {
        super(name,path);
        this.size = size;
    }
    @Override
    public String toString() {
        return "'" + name + '\'' + " , " + size;
    }
}
