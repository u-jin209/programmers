package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class run {
    public static String[] solution(String[] players, String[] callings) {

        Map<String, Integer> playerList = new HashMap<>();
        for (int i=0; i<players.length; i++){
            playerList.put( players[i], i);
        }
        for (String c: callings){
            int originIdx = playerList.get(c);
            String prePlayer = players[originIdx-1];
            playerList.put(c, originIdx-1);
            playerList.put(prePlayer, originIdx);
            players[ originIdx-1]= c;
            players [originIdx]=prePlayer;
        }

        return players;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})));

    }
}
