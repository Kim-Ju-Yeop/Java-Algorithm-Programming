package ch2.example;

import java.util.Scanner;

public class ArrayEqual {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("배열 a의 요솟수를 입력해주세요 : "); int input = scanner.nextInt();
        int a[] = new int[input];
        setArray(a);

        System.out.print("\n배열 b의 요솟수를 입력해주세요 : "); input = scanner.nextInt();
        int b[] = new int[input];
        setArray(b);

        System.out.println(checkArray(a, b));
    }


    public static void setArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print("array[" + i + "] 입력해주세요 : "); array[i] = scanner.nextInt();
        }
    }

    public static String checkArray(int a[], int b[]){
        if(a.length != b.length) return "\n배열 a와 b는 다릅니다.";

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]) return "\n배열 a와 b는 다릅니다.";
            else return "\n배열 a와 b는 같습니다.";
        }
        return null;
    }
}
