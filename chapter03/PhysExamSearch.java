package ch3.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString(){
            return (name + " " + height + " " + vision);
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderCoparator();

        private static class HeightOrderCoparator implements Comparator<PhyscData>{

            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhyscData[] x = {new PhyscData("김주엽", 165, 0.7),
                         new PhyscData("이영은", 170, 1.0),
                         new PhyscData("김경훈", 175, 1.0)};

        System.out.print("몇 cm인 사람을 찾고 있나요? : "); int height = scanner.nextInt();

        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
        if(idx < 0){
            System.out.println("요소가 없습니다.");
        } else{
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
