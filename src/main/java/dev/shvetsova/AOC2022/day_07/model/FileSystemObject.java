package dev.shvetsova.AOC2022.day_07.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class FileSystemObject {
    protected final String name;
    protected final ElvePath path;

    public FileSystemObject(String name) {
        this.name = name;
        this.path = null;
    }
}
