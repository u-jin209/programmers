package level1;

import java.util.*;
import java.util.stream.Collectors;

public class personalityType {
    public static String solution(String[] survey, int[] choices) {
        String result ="";
        Map<Integer, String[]> type= new HashMap<>();

        type.put(0, new String[]{"R", "T"});
        type.put(1, new String[]{"C", "F"});
        type.put(2, new String[]{"J", "M"});
        type.put(3, new String[]{"A", "N"});

        Map<String, Integer> testResult = new HashMap<>();
        for(int i=0; i<survey.length;i++){
            String[] sur = survey[i].split("");

            if(choices[i]<4){
                if(testResult.containsKey(sur[0])){
                    testResult.put(sur[0], testResult.get(sur[0])+(4-choices[i]));
                }else{
                    testResult.put(sur[0], 4-choices[i]);
                }
            } else if (choices[i] > 4) {
                if(testResult.containsKey(sur[1])) {
                    testResult.put(sur[1], testResult.get(sur[1]) + (choices[i] - 4));
                }else{
                    testResult.put(sur[1], choices[i] - 4);
                }
            }
        }
        for(int i=0; i< type.size();i++){
            String[] typeList =type.get(i);
            if(testResult.containsKey(typeList[0]) && testResult.containsKey(typeList[1])){
                if(testResult.get(typeList[0]) >= testResult.get(typeList[1])){
                    result+=typeList[0];
                }else if (testResult.get(typeList[0]) < testResult.get(typeList[1])){
                    result+=typeList[1];
                }
            }else if(testResult.containsKey(typeList[0]) && !testResult.containsKey(typeList[1])){
                result+=typeList[0];
            }else if(!testResult.containsKey(typeList[0]) && testResult.containsKey(typeList[1])){
                result+=typeList[1];
            }else{
                result+=typeList[0];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3});
    }
}
