import java.util.*;
import java.util.stream.Collectors;

public class personalityType {
    public static int[] solution(String[] survey, int[] choices) {
        int[] end = new int[1];
        Map<Integer, String[]> type= new HashMap<>();
        type.put(1, new String[]{"R", "T"});
        type.put(2, new String[]{"C", "F"});
        type.put(3, new String[]{"J", "M"});
        type.put(4, new String[]{"A", "N"});


        return end;
    }
    public Map<String, Integer> setScore (){


        return new HashMap<>();
    };
    public static void main(String[] args) {
        solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
    }
}
