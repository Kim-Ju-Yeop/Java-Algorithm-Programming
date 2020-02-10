package ch4.question;

import ch4.example.IntStack;

import java.util.Scanner;

class IntAryQueue {
    public int max; // 큐 용량
    public int num; // 데이터의 수
    public int[] que; // 큐 본체

    // 실행 시 예외 : 큐가 비어있음
    public class EmptyIntAryQueueException extends RuntimeException{
        public EmptyIntAryQueueException(){}
    }

    // 실행 시 예외 : 큐가 넘쳐있음
    public class OverIntAryQueueException extends RuntimeException{
        public OverIntAryQueueException(){}
    }

    public IntAryQueue(int capacity){
        max = capacity;
        num = 0;

        try{ que = new int[max]; }
        catch (OutOfMemoryError ex){
            max = 0;
        }
    }

    // 큐 데이터 추가
    public int enqueue(int x){
        if(num == max) throw new OverIntAryQueueException();
        return que[num++] = x;
    }

    // 큐 데이터 삭제
    public int dequeue(){
        if(num <= 0) throw new EmptyIntAryQueueException();

        int dead_item = que[0];

        for(int i = 0; i < num - 1; i++){
            que[i] = que[i + 1];
        } num -= 1;
        return dead_item;
    }

    // 큐 최상위 데이터 전달
    public int peak(){
        if(num <= 0) throw new EmptyIntAryQueueException();
        return que[0];
    }

    // 큐 배열 속 데이터 찾기
    public int indexOf(int x){
        for(int i = 0; i < num; i++){
            if(que[i] == x) return i;
        }
        return -1;
    }

    // 큐 배열 초기화
    public void clear(){
        num = 0;
    }

    // 큐 용량 전달
    public int capacity(){
        return max;
    }

    // 큐 배열 데이터 크기 전달
    public int size(){
        return num;
    }

    // 큐 빈 공간 전달
    public boolean isEmpty(){
        return num <= 0;
    }

    // 큐 가득 찬 공간 전달
    public boolean isFull(){
        return num == max;
    }

    // 큐 배열 데이터 출력
    public void dump(){
        if(num <= 0) throw new EmptyIntAryQueueException();
        for(int i = 0; i < num; i++){
            System.out.print(que[i] + " ");
        }
        System.out.println();
    }
}

public class IntAryQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntAryQueue intAryQueue = new IntAryQueue(64);

        int input = 1;

        while(input != 0){
            System.out.println("현재 데이터 수 : " + intAryQueue.size() + "/" + intAryQueue.capacity());
            System.out.print("(0) 종료 (1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 : "); input = scanner.nextInt();

            switch (input){
                case 0: break;
                case 1:{
                    System.out.print("데이터 : "); int data_input = scanner.nextInt();
                    try{ intAryQueue.enqueue(data_input); }
                    catch (IntStack.OverflowIntStackException ex){
                        System.out.println("큐가 가득 찼습니다.");
                    } break;
                }
                case 2: {
                    try{System.out.println("디큐 데이터는 " + intAryQueue.dequeue() + "입니다.");}
                    catch (IntStack.EmptyIntStackException ex){
                        System.out.println("큐가 비어 있습니다.");
                    } break;
                }
                case 3: {
                    try{System.out.println("피크한 데이터는 " + intAryQueue.peak() + "입니다.");}
                    catch (IntStack.EmptyIntStackException ex){
                        System.out.println("큐가 비어 있습니다.");
                    } break;
                }
                case 4: intAryQueue.dump(); break;
            }
            System.out.println();
        }
    }
}
