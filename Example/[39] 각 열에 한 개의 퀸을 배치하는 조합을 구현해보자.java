package ch5.example.ex2;

public class QueenB {
    public static int[] pos = new int[8]; // 각 열의 퀸의 위치

    public static void print(){
        for(int i = 0; i < 8; i++){
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    public static void set(int i){
        for(int j = 0; j < 8; j++){
            pos[i] = j;
            if(i == 7) print();
            else set(i + 1);
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
