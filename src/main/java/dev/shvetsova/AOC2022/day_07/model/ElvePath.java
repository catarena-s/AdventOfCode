package dev.shvetsova.AOC2022.day_07.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class ElvePath extends FileSystemObject implements Comparable<ElvePath> {
    private final List<ElveFile> includedFiles = new ArrayList<>();
    private final List<ElvePath> includedPath = new ArrayList<>();

    public ElvePath(String name) {
        super(name);
    }

    public ElvePath(String name, ElvePath path) {
        super(name, path);
    }

    @Override
    public String toString() {
        return name + "(dir) : " + getSize();
    }

    public void add(FileSystemObject obj) {
        if (obj instanceof ElvePath) includedPath.add((ElvePath) obj);
        if (obj instanceof ElveFile) includedFiles.add((ElveFile) obj);
    }

    public long getSize() {
        return includedFiles.stream().mapToLong(ElveFile::getSize).sum() +
                includedPath.stream().mapToLong(ElvePath::getSize).sum();
    }

    @Override
    public int compareTo(ElvePath o) {
        return (int) (this.getSize() - o.getSize());
    }
}
