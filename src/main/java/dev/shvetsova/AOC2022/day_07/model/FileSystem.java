package dev.shvetsova.AOC2022.day_07.model;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private static final int SIZE = 100_000;
    private static final long ENOUGH = 30_000_000;
    private static final long FULL_DISK_SIZE = 70_000_000;
    private final List<ElvePath> listPath = new ArrayList<>();
    private final ElvePath head;
    private ElvePath current = null;

    public FileSystem() {
        this.head =new ElvePath("/");
        listPath.add(head);
    }

    public void init(String[] inputS) {
        for (String line : inputS) {
            String[] input = line.split(" ");
            Command command = Command.get(input[0].trim());
            command.execute(input, this);
        }
    }

    public long getMinSum() {
        return getSum(head);
    }

    public long findMinPath() {
        long filesSize = getSize();
        long free = FULL_DISK_SIZE - filesSize;
        long needFree = ENOUGH - free;
        return listPath.stream()
                .sorted()
                .filter(f -> f.getSize() > needFree)
                .findFirst()
                .get()
                .getSize();
    }

    void setCurrent(ElvePath current) {
        this.current = current;
    }

    ElvePath getCurrent() {
        return current;
    }

    void addFile(String name, Long size) {
        ElveFile f = new ElveFile(name, current, size);
        current.add(f);
    }

    void addPath(String name) {
        ElvePath p = new ElvePath(name, current);
        current.add(p);
        listPath.add(p);
    }

    ElvePath getHead() {
        return head;
    }

    private long getSize() {
        return head.getSize();
    }

    private long getSum(ElvePath head) {
        long res = 0L;
        for (ElvePath path : head.getIncludedPath()) {
            long sum = path.getSize();
            if (sum < SIZE) res += sum;
            res += getSum(path);
        }
        return res;
    }
}
