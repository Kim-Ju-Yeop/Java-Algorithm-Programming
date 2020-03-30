package ch6.ex7;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SortCalendar {

    public static void main(String[] args) {
        GregorianCalendar[] x = {
                new GregorianCalendar(2017, Calendar.NOVEMBER, 1),
                new GregorianCalendar(1963, Calendar.OCTOBER, 18),
                new GregorianCalendar(1985, Calendar.APRIL, 5)
        };

        Arrays.sort(x);

        for(int i = 0; i < x.length; i++){
            System.out.printf("%04d년 %02d월 %02d일\n", x[i].get(Calendar.YEAR), x[i].get(Calendar.MONTH) + 1, x[i].get(Calendar.DATE));
        }
    }
}
