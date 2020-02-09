package ch3.question;

import java.util.ArrayList;
import java.util.Scanner;

public class SeqSearchSen_Question2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("요솟수를 입력해주세요 : "); int input = scanner.nextInt();

        int[] arr = new int[input + 1];
        setArr(arr);

        System.out.print("배열에서 검색할 값을 입력해주세요 : "); int searchInput = scanner.nextInt();

        ArrayList<Integer> answer = new ArrayList<>();
        findArr(arr, searchInput, answer);

        if(answer.size() == 0) System.out.println("검색하신 값은 배열에 존재하지 않습니다.");
        else System.out.println("검색하신 값은 배열에 현재 " + answer.size() + "개 존재합니다.");
    }
    public static void setArr(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print("배열의 x[" + i + "]의 값을 입력해주세요 : ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void findArr(int arr[], int searchInput, ArrayList<Integer> answer){
        for(int i = 0; i < arr.length -1; i++){
            if (arr[i] == searchInput){
                answer.add(i);
            }
        }
    }
}
