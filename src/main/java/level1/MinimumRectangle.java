package level1;

import java.util.*;

public class MinimumRectangle {

    public static int solution(int[][] sizes) {
        int answer = 0;
        Map<Integer, Integer> width = new HashMap<>();
        Map<Integer, Integer> height = new HashMap<>();
        for(int i=0; i<sizes.length ; i++){
            width.put(sizes[i][0], i);
            height.put(sizes[i][1], i);
        }
        System.out.println(width);
        Integer maxWidth = Collections.max(width.keySet());
        Integer maxHeight = Collections.max(height.keySet());

        if(maxWidth > maxHeight){
            int wIdx = width.get(maxWidth);
            int idxHeight = sizes[wIdx][1];

        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}
