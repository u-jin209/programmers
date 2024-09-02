package level1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        //6-갯수+1
        int best =0;
        int zero =0;

        List<Integer> win_numsList = IntStream.of(win_nums).boxed().collect(Collectors.toList());
        for(int l : lottos){
            if(l != 0 && win_numsList.contains(l)){
                best++;
            }else if( l != 0){
                zero++;
            }
        }

        answer[0] = 6-best+zero+1;
        answer[1] = 6-best+1;

        return answer;
    }


}

