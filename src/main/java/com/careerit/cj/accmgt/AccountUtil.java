package com.careerit.cj.accmgt;

public final class AccountUtil {

    private static final String prefix = "SB";
    private static long count = 2024123011;
    private AccountUtil() {
    }

    public static String maskAccountNumber(String accNumber) {
        return "****" + accNumber.substring(8);
    }

    public static String generateAccountNumber() {
        return prefix + count++;
    }
}
