package level1;

import java.util.*;

public class privaciesOver {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> options = new HashMap<>();
        int preDate = calDate(today,0);
        for(String term : terms){
            String[] t = term.split(" ");
            options.put(t[0],Integer.parseInt(t[1]));
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<privacies.length;i++){
            String[] p = privacies[i].split(" ");
            int priDate= calDate( p[0],options.get(p[1]));
            if(priDate <= preDate){
                result.add(i+1);
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
    public static int calDate(String date, int gap){
        String[] dateList =date.split("\\.");
        int year = Integer.parseInt(dateList[0]);
        int month = Integer.parseInt(dateList[1]);

        return (year*12*28) + (month*28) + Integer.parseInt(dateList[2])+(gap*28);
    }
    public static void main(String[] args) {
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(Arrays.toString(solution("2020.01.01", terms, privacies)));

    }
}
