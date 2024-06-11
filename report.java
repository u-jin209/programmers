import java.util.*;
import java.util.stream.Collectors;

public class report {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] end = new int[id_list.length];
        Map<String, Object> total = new HashMap<>();
        List<String> arrList =  Arrays.asList(report).stream().distinct().collect(Collectors.toList());
        for(String id : id_list){
            System.out.println("id : " +id);
            Map<String ,Object> reportTotal = new HashMap<>();
            int[] count = {0,0};
            List<String> reportId = new ArrayList<>();
            for(String r: arrList){
                String[] rep = r.split(" ");
                if(rep[0].equals(id)){
                    count[0]++;
                }else if(rep[1].equals(id)){
                    count[1]++;
                    reportId.add(rep[0]);
                }
            }
            reportTotal.put("reportId",reportId);
            reportTotal.put("count",count);

            total.put(id, reportTotal);
        }

        for (int i=0; i<total.size();i++){
            total.get(1);
            System.out.println("total"+ total.get(i));
        }

        return end;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        System.out.println(Arrays.toString(solution(id_list, report, 2)));

    }
}
