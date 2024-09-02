package level1;

import java.util.Arrays;
import java.util.Objects;

public class palindrome {
    public int solution(String s){
        int answer =0;
        for(int i=1; i<=s.length();i++){
            if(palindromeCheack(s.substring(0,i))){

            }
        }
        return  answer;
    }

    private boolean palindromeCheack(String substring) {
        String[] origin = substring.split("");
        System.out.println(Arrays.toString(origin));
        String[] reverse = new String[origin.length];
        for(int i= origin.length-1; i>=0;i--){
            reverse[(origin.length-1-i)] = origin[i];
        }
        return Arrays.equals(origin, reverse);
    }
}
