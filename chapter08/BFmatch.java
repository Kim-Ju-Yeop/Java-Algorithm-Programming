package ch8;

import java.util.Scanner;

public class BFmatch {

    public static int bfMatch(String text, String pattern) {
        int pt = 0;
        int pp = 0;

        while (pt != text.length() && pp != pattern.length()) {
            if (text.charAt(pt) == pattern.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }

        if (pp == pattern.length()) {
            return pt - pp;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("텍스트를 입력하세요 : ");
        String text = scanner.next();

        System.out.print("찾고자 하는 패턴을 입력하세요 : ");
        String pattern = scanner.next();

        int idx = bfMatch(text, pattern);

        if (idx == -1) {
            System.out.println("입력하신 텍스트에 찾고자하는 패턴이 존재하지 않습니다.");
        } else {
            int length = 0;

            for (int i = 0; i < idx; i++) {
                length += text.substring(i, i + 1).getBytes().length;
            }

            length += pattern.length();

            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트 : " + text);
            System.out.printf(String.format("패턴 : %%%ds\n", length), pattern);
        }
    }
}
