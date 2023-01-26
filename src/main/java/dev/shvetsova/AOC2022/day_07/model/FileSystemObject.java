package dev.shvetsova.AOC2022.day_07.model;

public class FileSystemObject {
    protected String name;
    protected ElvePath path;
    public FileSystemObject(String name, ElvePath path) {
        this.name = name;
        this.path = path;
    }

    public FileSystemObject(String name) {
        this.name = name;
        this.path = null;
    }
}
