package ch4.example;

import ch4.question.IntAryQueue;

import java.util.Scanner;

class IntQueue {
    public int max; // 큐의 용량
    public int front; // 큐의 첫 번째 요소
    public int rear; // 큐의 마지막 요소
    public int num; // 현재 데이터의 수;
    public int[] que; // 큐의 본체

    // 실행 시 예외 : 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){}
    }

    // 실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException(){}
    }

    public IntQueue(int capacity){
        num = front = rear = 0;
        max = capacity;

        try{ que = new int[max]; }
        catch (OutOfMemoryError ex){
            max = 0;
        }
    }

    // 큐에 데이터 인큐
    public int enqueue(int x) throws OverflowIntQueueException{
        if(num == max) throw new OverflowIntQueueException();

        que[rear++] = x;
        num++;

        if(rear == max) rear = 0;
        return x;
    }

    // 큐에 데이터 디큐
    public int dequeue() throws EmptyIntQueueException{
        if(num <= 0) throw new EmptyIntQueueException();

        int x = que[front++];
        num--;

        if(front == max) front = 0;
        return x;
    }

    // 큐의 최상위 데이터 전달
    public int peek() throws EmptyIntQueueException{
        if(num <= 0) throw new EmptyIntQueueException();
        return que[front];
    }

    // 큐의 데이터 인덱스 값 반환
    public int indexOf(int x){
        for(int i = 0; i < num; i++){
            int idx = (i + front) % max;
        }
        return -1;
    }

    // 큐 초기화
    public void clear(){
        num = front = rear = 0;
    }

    // 큐 용량 반환
    public int capacity(){
        return max;
    }

    // 큐 데이터 용량 반환
    public int size(){
        return num;
    }

    // 큐 데이터 빈 공간 반환
    public boolean isEmpty(){
        return num <= 0;
    }

    // 큐 데이터 가득 찬 공간 반환
    public boolean isFull(){
        return num == max;
    }

    // 큐 데이터 모두 출력
    public void dump(){
        if(num <= 0) System.out.println("큐가 비어있습니다.");
        else{
            for(int i = 0; i < num; i++){
                int idx = (i + front) % max;
                System.out.println(que[idx] + " ");
            }
            System.out.println();
        }
    }
}

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue intQueue = new IntQueue(64);

        int input = 1;

        while(input != 0){
            System.out.println("현재 데이터 수 : " + intQueue.size() + "/" + intQueue.capacity());
            System.out.print("(0) 종료 (1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 : "); input = scanner.nextInt();

            switch (input){
                case 0: break;
                case 1:{
                    System.out.print("데이터 : "); int data_input = scanner.nextInt();
                    try{ intQueue.enqueue(data_input); }
                    catch (IntStack.OverflowIntStackException ex){
                        System.out.println("큐가 가득 찼습니다.");
                    } break;
                }
                case 2: {
                    try{System.out.println("디큐 데이터는 " + intQueue.dequeue() + "입니다.");}
                    catch (IntStack.EmptyIntStackException ex){
                        System.out.println("큐가 비어 있습니다.");
                    } break;
                }
                case 3: {
                    try{System.out.println("피크한 데이터는 " + intQueue.peek() + "입니다.");}
                    catch (IntStack.EmptyIntStackException ex){
                        System.out.println("큐가 비어 있습니다.");
                    } break;
                }
                case 4: intQueue.dump(); break;
            }
            System.out.println();
        }
    }
}
