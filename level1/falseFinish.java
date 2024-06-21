package level1;

import java.util.HashMap;
import java.util.Map;

public class falseFinish {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> partMap = new HashMap<>();
        for (String i : participant){
            if(partMap.containsKey(i)){
                partMap.put(i, partMap.get(i)+1);
            }else{
                partMap.put(i,1);
            }

        }
        for (String i : completion){
            partMap.put(i,partMap.get(i)-1);
        }
        for (String i : participant){
            if(partMap.get(i) ==1){
                answer =i;
            }
        }

        return answer;
    }
}
