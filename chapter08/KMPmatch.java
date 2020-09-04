package ch8;

public class KMPmatch {

    public static int kmpMatch(String text, String pattern) {
        int pt = 1;
        int pp = 0;
        int[] skip = new int[pattern.length() + 1];

        skip[pt] = 0;
        while (pt != pattern.length()) {
            if (pattern.charAt(pt) == pattern.charAt(pp)) {
                skip[++pt] = ++pp;
            } else if (pp == 0) {
                skip[++pp] = pp;
            } else {
                pp = skip[pp];
            }
        }

        pt = pp = 0;
        while (pt != text.length() && pp != pattern.length()) {
            if (text.charAt(pt) == pattern.charAt(pp)) {
                pt++;
                pp++;
            } else if (pp == 0) {
                pt++;
            } else {
                pp = skip[pp];
            }
        }

        if (pp == pattern.length()) {
            return pt - pp;
        } else {
            return -1;
        }
    }
}
