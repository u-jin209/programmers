package level1;

import java.util.*;

public class dataAnalysis {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> sortOption = new HashMap<>();
        sortOption.put("code", 0);
        sortOption.put("date", 1);
        sortOption.put("maximum", 2);
        sortOption.put("remain", 3);

        Map<Integer,int[]> answerList = new HashMap<>();
        for(int[] d : data){
            if (d[sortOption.get(ext)] < val_ext){
                answerList.put(d[sortOption.get(sort_by)],d);
            }
        }
        List<Integer> keySet = new ArrayList<>(answerList.keySet());
        Collections.sort(keySet);
        List<int[]> result = new ArrayList<>();
        int count = 0;
        for(int i : keySet){
            result.add(count, answerList.get(i));
            count++;
        }

        int[][] answer = result.toArray(new int[0][]);

        return answer;
    }
    public static void main(String[] args) {
        solution(new int[][]{ {1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}},"date",	20300501	,"remain");
    }
}
