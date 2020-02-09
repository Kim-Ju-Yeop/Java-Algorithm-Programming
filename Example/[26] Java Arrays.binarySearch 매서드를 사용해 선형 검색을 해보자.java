package ch3.example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수를 입력해주세요 : "); int num = scanner.nextInt();
        int arr[] = new int[num];

        System.out.println("오름차순으로 입력해주세요");
        System.out.print("arr[0] : "); arr[0] = scanner.nextInt();
        for(int i = 1; i < arr.length; i++){
            do{
                System.out.print("arr[" + i + "] : ");
                arr[i] = scanner.nextInt();
            }while(arr[i] < arr[i-1]);
        }

        System.out.print("검색할 값을 입력해주세요 : "); int ky = scanner.nextInt();

        int idx = Arrays.binarySearch(arr, ky);

        if(idx < 0){
            System.out.println("그 값의 요소가 없습니다. (검색 실패)");
        }else{
            System.out.println(ky + "값은 배열 arr[" + idx + "]에 있습니다. (검색 성공)");
        }
    }
}
