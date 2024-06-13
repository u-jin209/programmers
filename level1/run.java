package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class run {
    public static String[] solution(String[] players, String[] callings) {
        List<String> playerList =Arrays.asList(players);
        for (String c: callings){
            int originIdx = playerList.lastIndexOf(c);
            String prePlayer = playerList.get(originIdx-1);
            playerList.set(originIdx-1, c);
            playerList.set(originIdx, prePlayer);
        }

        return playerList.toArray(new String[0]);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})));

    }
}
