package ch3.question;

import java.util.Scanner;

public class SeqSearchSen_Question {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("요솟수를 입력해주세요 : "); int input = scanner.nextInt();

        int[] arr = new int[input + 1];
        setArr(arr);

        System.out.print("배열에서 검색할 값을 입력해주세요 : "); int searchInput = scanner.nextInt();
        arr[arr.length-1] = searchInput;
        int idx = findArr(arr, searchInput);

        if(idx == -1){
            System.out.println("찾으시는 값은 배열에서 존재하지 않습니다.");
        } else{
            System.out.println("찾으시는 값은 배열 arr[" + idx + "]에 존재합니다.");
        }
    }

    public static void setArr(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print("배열의 x[" + i + "]의 값을 입력해주세요 : ");
            arr[i] = scanner.nextInt();
        }
    }

    public static int findArr(int arr[], int searchInput){
        for(int i = 0; i < arr.length -1; i++) if (arr[i] == searchInput) return i;
        return -1;
    }
}
