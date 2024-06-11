import java.util.HashMap;
import java.util.Map;

public class report {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> result = new HashMap<>();
        for(String user : id_list){
            result.put(user,0);
        }

        for (String rep : report){
            String[] list = rep.split(" ");

        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
