package ch5.ex2;

import com.sun.org.apache.xml.internal.utils.IntStack;
import java.util.Scanner;

public class RecurX2 {

    public static void recur(int x){
        IntStack intStack = new IntStack(x);

        while(true){
            if(x > 0){
                intStack.push(x);
                x -= 1;
                continue;
            }
            if(intStack.empty() == false){
                x = intStack.pop();
                System.out.println(x);
                x -= 2;
                continue;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : "); int input = scanner.nextInt();

        recur(input);
    }
}
