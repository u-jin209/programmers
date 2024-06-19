package level1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class parkWorking {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};
        Map<String, int[]> moveMap = new HashMap<>();
        moveMap.put("N",new int[]{-1,0});
        moveMap.put("S",new int[]{1,0});
        moveMap.put("W",new int[]{0,-1});
        moveMap.put("E",new int[]{0,1});

        String[][] parkArray = new String[park.length][park[0].length()];

        for(int i=0; i<park.length;i++){
            List<String> start = Arrays.asList(park[i].split(""));
            parkArray[i] = park[i].split("");
            if(start.contains("S")){
                answer[0]= i;
                answer[1] = start.indexOf("S");
            }
        }

        for(String s : routes){
            String[] route = s.split(" ");
            int[] move =  moveMap.get(route[0]);

            if(move[0] != 0){
                int nowH = answer[0]+move[0]* (Integer.parseInt(route[1]));
                if(0<=nowH && nowH< park.length){
                    boolean check = true;
                    for(int i=1; i<= Integer.parseInt(route[1]);i++){
                        if(parkArray[answer[0]+move[0]*i][answer[1]].equals("X")){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        answer[0] = nowH;
                    }
                }

            }else if(move[1] != 0){
                int nowW = answer[1]+move[1]* (Integer.parseInt(route[1]));
                if(0<=nowW && nowW < park[0].length()){
                    boolean check = true;
                    for(int i=1; i<= Integer.parseInt(route[1]);i++){
                        if(parkArray[answer[0]][answer[1]+move[1]*i].equals("X")){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        answer[1] = nowW;
                    }
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"SOO", "OXX", "OOO"}, new String[]{"E 2", "S 2", "W 1"})));
    }
}
