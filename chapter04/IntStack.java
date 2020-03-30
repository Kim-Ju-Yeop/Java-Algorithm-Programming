package ch4;

import java.util.Scanner;

class IntStack {
    public int max; // stk 배열의 용량
    public int ptr; // stk 배열의 스택 포인터
    public int[] stk; // 스택 배열의 본체

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    // 실행 시 에외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    public IntStack(int capacity){
        ptr = 0;
        max = capacity;

        try{ stk = new int[max]; }
        catch (OutOfMemoryError e){ max = 0; }
    }

    // 스택 데이터 추가
    public int push(int x) throws OverflowIntStackException{
        if(ptr == max) throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    // 스택 데이터 제거
    public int pop() throws EmptyIntStackException{
        if(ptr <= 0) throw new EmptyIntStackException();
        return stk[--ptr];
    }

    // 스택 최상위 데이터 전달
    public int peak() throws EmptyIntStackException{
        if(ptr <= 0) throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    // 스택 검색 데이터 인덱스 전달
    public int indexOf(int x){
        for(int i = ptr - 1; i >= 0; i--){
            if(stk[i] == x) return stk[i];
        }
        return -1;
    }

    // 스택 데이터 초기화
    public void clear(){
        ptr = 0;
    }

    // 스택 용량 전달
    public int capacity(){
        return max;
    }

    // 스택 데이터 용량 전달
    public int size(){
        return ptr;
    }

    // 스택 빈 공간 전달
    public boolean isEmpty(){
        return ptr <= 0;
    }

    // 스택 가득 찬 공간 전달
    public boolean isFull(){
        return ptr == max;
    }

    // 스택 바닥에서 탑 데이터 모두 출력
    public void dump(){
        if(ptr <= 0) System.out.println("스택이 비어있습니다.");
        else{
            for(int i = 0; i < ptr; i++){
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}

public class IntStackTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack intStack = new IntStack(64);

        int input = 1;

        while(input != 0){
            System.out.println("현재 데이터 수 : " + intStack.size() + "/" + intStack.capacity());
            System.out.print("(0) 종료 (1) 푸시 (2) 팝 (3) 피크 (4) 덤프 : "); input = scanner.nextInt();

            switch (input){
                case 0: break;
                case 1:{
                    System.out.print("데이터 : "); int data_input = scanner.nextInt();
                    try{ intStack.push(data_input); }
                    catch (IntStack.OverflowIntStackException ex){
                        System.out.println("스택이 가득 찼습니다.");
                    } break;
                }
                case 2: {
                    try{System.out.println("팝한 데이터는 " + intStack.pop() + "입니다.");}
                    catch (IntStack.EmptyIntStackException ex){
                        System.out.println("스택이 비어 있습니다.");
                    } break;
                }
                case 3: {
                    try{System.out.println("피크한 데이터는 " + intStack.peak() + "입니다.");}
                    catch (IntStack.EmptyIntStackException ex){
                        System.out.println("스택이 비어 있습니다.");
                    } break;
                }
                case 4: intStack.dump(); break;
            }
            System.out.println();
        }
    }
}
