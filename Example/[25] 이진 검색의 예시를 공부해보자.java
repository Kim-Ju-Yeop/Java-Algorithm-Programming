package ch3.example;

import java.util.Scanner;

public class BinSearch_Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("요솟수를 입력해주세요 : "); int num = scanner.nextInt();
        int arr[] = new int[num];

        System.out.println("오름차순으로 입력해주세요 : ");
        System.out.println("arr[0] : "); arr[0] = scanner.nextInt();
        for(int i = 1; i < arr.length; i++){
            do{
                System.out.println("arr[" + i + "] : ");
                arr[i] = scanner.nextInt();
            }while(arr[i] < arr[i-1]);
        }

        System.out.println("검색할 값을 입력해주세요 : "); int ky = scanner.nextInt();

        int idx = binSearch(arr, num, ky);
        if(idx == -1) System.out.println("그 값의 요소가 없습니다. (검색 실패)");
        else System.out.println(ky + "값은 배열 arr[" + idx + "]에 있습니다. (검색 성공)");
    }

    public static int binSearch(int arr[], int num, int key){
        int pl = 0;
        int pr = arr.length - 1;

        do{
            int pc = (pl + pr) / 2;

            if(arr[pc] == key) return pc;
            else if(arr[pc] < key) pl = pc + 1;
            else pr = pc - 1;
        }while(pr >= pl);
        return -1;
    }
}
