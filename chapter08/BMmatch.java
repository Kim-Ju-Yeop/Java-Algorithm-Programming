package ch8;

public class BMmatch {

    public static int bmMatch(String text, String pattern) {
        int pt;
        int pp;

        int txtLen = text.length();
        int patLen = pattern.length();

        int[] skip = new int[Character.MAX_VALUE + 1];

        for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
            skip[pt] = patLen;
        }

        for (pt = 0; pt < patLen - 1; pt++) {
            skip[pattern.charAt(pt)] = patLen - pt - 1;
        }

        while (pt < txtLen) {
            pp = patLen - 1;

            while (text.charAt(pt) == pattern.charAt(pp)) {
                if (pp == 0) return pt;
                else {
                    pp--;
                    pt--;
                }
            }

            pt += (skip[text.charAt(pt)] > patLen - pp) ? skip[text.charAt(pt)] : patLen - pp;
        }
        return -1;
    }
}
