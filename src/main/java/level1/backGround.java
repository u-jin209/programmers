package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class backGround {
    public static int[] solution(String[] wallpaper) {

        ArrayList<Integer> xList = new ArrayList<>();
        ArrayList<Integer> yList = new ArrayList<>();

        for(int y=0; y<wallpaper.length;y++){
            String[] yWall = wallpaper[y].split("");
            for(int x=0; x<yWall.length;x++){
                if(yWall[x].equals("#")){
                    xList.add(x);
                    yList.add(y);
                }
            }
        }
        System.out.println(xList);
        System.out.println(yList);
        Collections.sort(xList);
        Collections.sort(yList);
        int[] answer = new int[] {xList.get(0),yList.get(0),xList.get(xList.size()-1),yList.get(yList.size()-1)};
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{".#...", "..#..", "...#."})));;
    }
}
