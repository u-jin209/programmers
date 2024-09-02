package level2;

import java.util.HashMap;
import java.util.Map;

public class clothes {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for(String[] s : clothes){
            if(map.containsKey(s[1])){
                map.put(s[1], map.get(s)+1);
            }else{
                map.put(s[1],1);
            }
        }
        int set =1;
        for(String m : map.keySet()){
            answer+= map.get(m);
            set = set * map.get(m);
        }
        return answer+set;
    }
}
