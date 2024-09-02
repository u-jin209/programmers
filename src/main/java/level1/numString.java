package level1;

import java.util.HashMap;
import java.util.Map;

public class numString {

    public static int solution(String s) {
        int answer = 0;
        Map<String,Integer> num = new HashMap<String,Integer>();

        num.put("zero",0);
        num.put("one",1);
        num.put("two",2);
        num.put("three",3);
        num.put("four",4);
        num.put("five",5);
        num.put("six",6);
        num.put("seven",7);
        num.put("eight",8);
        num.put("nine",9);

        try{
            answer = Integer.parseInt(s);
        } catch (Exception e) {
            for(String n : num.keySet()){
                if(s.contains(n)){
                    s=s.replace(n,num.get(n).toString());
                }
            }
            answer = Integer.parseInt(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
}
