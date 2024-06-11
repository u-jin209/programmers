import java.util.*;

public class report {

    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer>  answer = new HashMap<>();
        for(String user : id_list){
            answer.put(user,0);
        }
        for(String user : id_list){
            List<String> reportUser = new ArrayList<>();
            for (int i= 0; i< report.length; i++){
                String[] list = report[i].split(" ");
                if(list[1].equals(user) && !reportUser.contains(list[0]) ){
                    reportUser.add(list[0]);
                }
            }

            if(reportUser.size() >= k){
                for (String who : reportUser){
                    answer.put(who,answer.get(who)+1);
                }
            }

        }
        int[] end = new int[id_list.length];


        for (int i=0; i<end.length;i++){
            end[i] = answer.get(id_list[i]);
        }

        return end;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        System.out.println(Arrays.toString(solution(id_list, report, 2)));

    }
}
