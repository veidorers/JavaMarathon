package day8;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String s = "";
        for(int i = 0; i <= 20000; i++) {
            s += i;
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println(TimeUnit.NANOSECONDS.toMillis(totalTime));
        System.out.println(s);


        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= 20000; i++) {
            sb.append(i);
        }
        long totalTime2 = System.currentTimeMillis() - startTime2;
        System.out.println(totalTime2);
        System.out.println(sb);
    }
}
