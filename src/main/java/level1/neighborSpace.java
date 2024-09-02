package level1;

import java.util.Objects;

public class neighborSpace {

    public static int solution(String[][] board, int h, int w) {
        int count = 0;
        int hlen =board.length;
        int wlen =board[0].length;
        int[] dh = {0,1,-1,0};
        int[] dw = {1,0,0,-1};

        for(int i=0; i<dh.length; i++){
            int hCheck = h+dh[i];
            int wCheck = w+dw[i];
            if(0<= hCheck && hCheck < hlen && 0<= wCheck && wCheck < wlen){
                // 이중 배열에서는 단순 == 로 판별하지 못함. Object.equals 사용
                // '==' 연산자로 비교하면 참조값이 같은지의 여부를 반환
                // 'equals' 객체의 필드가 모두 같으면 같은 객체인지의 여부를 반환
                if(Objects.equals(board[h][w], board[hCheck][wCheck])){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}} ,1,1));
    }

}
