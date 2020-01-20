package ch1.ex2.question;

public class MultiTable2 {
    public static void main(String[] args) {

        for(int i = 1; i <= 9; i++){

            if(i == 1){
                int k = 1;
                System.out.printf("%3c", ' ');
                while(k < 10){
                    System.out.printf("%3d", k);
                    k++;
                }
                k = 1;
                System.out.println();
                System.out.printf("%3c", 'X');
                while(k < 10){
                    System.out.printf("%3c", '-');
                    k++;
                }
                System.out.println();
            }

            System.out.print(i + " |");
            for(int j = 1; j <= 9; j++){
                System.out.printf("%3d", i * j );
            }
            System.out.println();
        }
    }
}
