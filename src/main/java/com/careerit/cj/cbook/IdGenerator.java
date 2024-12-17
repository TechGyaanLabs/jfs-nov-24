package com.careerit.cj.cbook;

import java.time.LocalDate;

public final class IdGenerator {

    private static final String prefix = "CJ_";
    private static long count = 1000;

    private IdGenerator() {
    }
    public static String getNewId() {
        count++;
        return prefix + count;
    }
}
