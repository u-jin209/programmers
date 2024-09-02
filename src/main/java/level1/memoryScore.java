package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class memoryScore {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> memberScore = new HashMap<>();

        for(int i=0; i< name.length;i++){
            memberScore.put(name[i], yearning[i]);
        }

        for(int i=0; i< photo.length;i++){
            for(String s : photo[i]){
                if(memberScore.containsKey(s)){
                    answer[i]+= memberScore.get(s);
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}})));
    }
}
