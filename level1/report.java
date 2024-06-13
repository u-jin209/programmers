package level1;

import java.util.*;
import java.util.stream.Collectors;

public class report {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] end = new int[id_list.length];
        List<String> arrList =  Arrays.asList(report).stream().distinct().collect(Collectors.toList());
        Map<String, Object> reportList = new HashMap<>();
        Map<String, Integer> stopId = new HashMap<>();
        Map<String, Integer> idIdx= new HashMap<>();

        int idx =0;
        for(String id : id_list){
            idIdx.put(id,idx);
            reportList.put(id, new ArrayList<>());
            idx++;
        }
        for(String r: arrList){
            String[] rep = r.split(" ");
            if(stopId.containsKey(rep[1])){
                stopId.put(rep[1], stopId.get(rep[1])+1);

            }else{
                stopId.put(rep[1], 1);
            }
            List<String> user = (List<String>) reportList.get(rep[1]);
            user.add(rep[0]);
            reportList.put(rep[1], user);
        }
        for(String s : reportList.keySet()){
            List<String> rep = (List<String>) reportList.get(s);
            if(rep.size() >= k){
                for(String r : rep){
                    end[idIdx.get(r)]++;

                }
            }
        }
        return end;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        System.out.println(Arrays.toString(solution(id_list, report, 2)));

    }
}
