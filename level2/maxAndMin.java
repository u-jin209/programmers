package level2;

import java.util.ArrayList;
import java.util.List;

public class maxAndMin {
    public static String solution(String s) {
        String[] list =s.split(" ");

        int max=Integer.parseInt(list[0]);
        int min=Integer.parseInt(list[0]);
        for(int i=1; i<list.length;i++){
            int num = Integer.parseInt(list[i]);
            if(num >max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }

        return min+" "+max;
    }
    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 -4"));
    }
}
