package org.myproject.shortlink.project.toolkit;

import cn.hutool.core.lang.hash.MurmurHash;

/**
 * Hash Util Class
 */
public class HashUtil {

    private static final char[] CHARS = new char[]{
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    private static final int SIZE = CHARS.length;

    private static String convertDecToBase62(long num) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            result.append(CHARS[(int) (num % SIZE)]);
            num /= SIZE;
        }
        return result.reverse().toString();
    }

    public static String hashToBase62(String str) {
        long i = MurmurHash.hash32(str);
        i = i < 0 ? Integer.MAX_VALUE - i : i;
        return convertDecToBase62(i);
    }

    public static void main(String[] args) {
        String str = "example";
        String base62Hash = hashToBase62(str);
        System.out.println("Base62 Hash: " + base62Hash);
    }
}
