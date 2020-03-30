package ch2.example;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0; // 곱셈, 나눗셈 횟수
        int ptr = 0; // 배열의 인덱스 값
        int[] prime = new int[500]; // 소수 배열

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for(int n = 5; n <= 1000; n+=2){
            boolean flag = false;

            for(int i = 1; prime[i] * prime[i] <= n; i++){
                counter+=2;

                if(n % prime[i] == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                prime[ptr++] = n;
                counter++;
            }
        }

        for(int i = 0; i < ptr; i++){
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
