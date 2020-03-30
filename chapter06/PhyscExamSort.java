package ch6.ex7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhyscExamSort {

    public static class PhyscData{
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name; this.height = height; this.vision = vision;
        }

        public String toString(){
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
             }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("이영은", 172, 1.0),
                new PhyscData("김경훈", 175, 1.0),
                new PhyscData("김주엽", 170, 0.7),
                new PhyscData("최진우", 171, 0.1)
        };

        Arrays.sort(x, PhyscData.HEIGHT_ORDER);

        System.out.println("--신체검사 리스트--");
        System.out.println("  이름        키        시력   ");
        System.out.println("-------------------");
        for(int i = 0; i < x.length; i++){
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
    }
}
