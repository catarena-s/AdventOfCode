package dev.shvetsova.AOC2022.day_04;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    public final Set<Integer> setNumbers;

    public Task(String pair) {
        String[] range = pair.split("-");
        int begin = Integer.parseInt(range[0].trim());
        int end = Integer.parseInt(range[1].trim());
        setNumbers = Stream.iterate(begin, m -> m + 1)
                .limit(end - begin + 1)
                .collect(Collectors.toSet());
    }

    boolean compare(Task t) {
        setNumbers.retainAll(t.setNumbers);
        return !setNumbers.isEmpty();
                /*((A == t.A) || (A == t.B) || (B == t.A) || (B == t.B) ||
                (A < t.A && t.A < B) || (B > t.A && B < t.B) ||
                (t.A < A && A < t.B) || (t.B > A && t.B < B) ||
                (A < t.A && t.B < B) || (t.A < A && t.B > B));*/
    }
}
