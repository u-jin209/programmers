package level1;

import java.util.*;

public class manyGift {
    public static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Map<String,Integer>> result = new HashMap<>();
        for(String s : friends){

            result.put(s,  new HashMap<>());
        }

        System.out.println(result);
        for (String s : gifts){
            String[] gift = s.split(" ");
            System.out.println("gift " + Arrays.toString(gift));
            Map<String,Integer> sendCount = new HashMap<>();
            System.out.println(result.get(gift[1]));
            if(result.get(gift[1]).size() != 0){
                sendCount = result.get(gift[1]);
                sendCount.put(gift[1], sendCount.get(gift[1])+1);
            }else{
                sendCount.put(gift[1],1);
            }
            System.out.println(sendCount);
            result.put(s, sendCount);
        }


        System.out.println(result);

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"muzi", "ryan", "frodo", "neo"},
                new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}));
    }
}
