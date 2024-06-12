import java.util.*;
import java.util.stream.Collectors;

public class report {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] end = new int[id_list.length];
        List<String> arrList =  Arrays.asList(report).stream().distinct().collect(Collectors.toList());
        List<String> allReportId = new ArrayList<>();
        int idx =0;
        for(String id : id_list){
            System.out.println("id : " +id);
            List<String> reportId = new ArrayList<>();
            for(String r: arrList){
                String[] rep = r.split(" ");
                if(rep[1].equals(id)){
                    reportId.add(rep[0]);
                }
            }

            if(reportId.size()>=k){
                 allReportId.addAll(reportId);
            }
        }
        for (String i : id_list){
            for(String all : allReportId){
                if(i.equals(all)){
                    end[idx]++;
                }
            }
            idx++;
        }

        return end;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        System.out.println(Arrays.toString(solution(id_list, report, 2)));

    }
}
