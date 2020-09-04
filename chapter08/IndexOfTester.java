package ch8;

import java.util.Scanner;

public class IndexOfTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("텍스트를 입력하세요 : ");
        String text = scanner.next();

        System.out.print("찾고자 하는 패턴을 입력하세요 : ");
        String pattern = scanner.next();

        int idx1 = text.indexOf(pattern);
        int idx2 = text.lastIndexOf(pattern);

        if (idx1 == -1) {
            System.out.println("입력하신 텍스트에 찾고자하는 패턴이 존재하지 않습니다.");
        } else {
            int len1 = 0;
            for (int i = 0; i < idx1; i++) {
                len1 += text.substring(i, i + 1).getBytes().length;
            }
            len1 += pattern.length();

            int len2 = 0;
            for (int i = 0; i < idx2; i++) {
                len2 += text.substring(i, i + 1).getBytes().length;
            }
            len2 += pattern.length();

            System.out.println("텍스트 : " + text);
            System.out.printf(String.format("패턴 : %%%ds\n", len1), pattern);

            System.out.println("텍스트 : " + text);
            System.out.printf(String.format("패턴 : %%%ds\n", len2), pattern);
        }
    }
}
