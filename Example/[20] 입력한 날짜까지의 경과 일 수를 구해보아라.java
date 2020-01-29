package ch2.example;

import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mdays = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
                         {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}}; // 윤년

        System.out.println("그 해 경과 일 수를 구합니다.");
        System.out.print("년도 : "); int year = scanner.nextInt();
        System.out.print("월 : "); int month = scanner.nextInt();
        System.out.print("일 : "); int day = scanner.nextInt();

        if(checkYear(year)){
            System.out.println(checkFirstDays(mdays, month, day));
        } else{
            System.out.println(checkSecondDays(mdays, month ,day));
        }
    }
    public static boolean checkYear(int year){
        if(year % 4 == 0) return false; // 윤년
        else return true; // 평년
    }

    public static int checkFirstDays(int mdays[][], int month, int day){
        int sum = 0;

        if(month != 1){
            for(int i = 0; i < 1; i++){
                for(int j = 0; j < month - 1; j++){
                    sum += mdays[i][j];
                }
            }
        }
        sum += day;
        return sum;
    }

    public static int checkSecondDays(int mdays[][], int month, int day){
        int sum = 0;

        if(month != 1){
            for(int i = 1; i > 0; i--){
                for(int j = 0; j < month - 1; j++){
                    sum += mdays[i][j];
                }
            }
        }
        sum += day;
        return sum;
    }
}
