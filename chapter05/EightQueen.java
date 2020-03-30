package ch5.example.ex3;

public class EightQueen {
    public static boolean[] flag_a = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
    public static boolean[] flag_b = new boolean[15]; // / 대각선 방향으로 퀸을 배치했는지 체크
    public static boolean[] flag_c = new boolean[15]; // \ 대각선 방향으로 퀸을 배치했는지 체크
    public static int[] pos = new int[8]; // 각 열의 퀸의 위치

    public static void print(){
        for(int i = 0; i < 8; i++){
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    public static void set(int i){
        for(int j = 0; j < 8; j++){
            if(flag_a[i] == false && flag_b[i + j] == false && flag_c[i - j + 7] == false){
                pos[i] = j;
                if(i == 7) print();
                else{
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_c[i + j] = flag_c[i = j + 7] = false;
                 }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
