package ch5.example.ex2;

public class QueenBB {
    public static boolean[] flag = new boolean[8]; // 각 행에 퀸이 배치했는지 체크
    public static int[] pos = new int[8]; // 각 열의 퀸의 위치

    public static void print(){
        for(int i = 0; i < 8; i++){
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    // i열의 알맞은 위치에 퀸을 배치한다.
    public static void set(int i){
        for(int j = 0; j < 8; j++){
            if(flag[j] == false){ // j 행에 퀸이 아직 배치하지 않았다면
                pos[i] = j;
                if(i == 7) print();
                else{
                    flag[j] = true;
                    set(i + 1);
                    flag[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
