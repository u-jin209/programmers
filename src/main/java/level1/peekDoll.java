package level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class peekDoll {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> popStack = new Stack<>();
        for(int move : moves){
            for(int b=0; b<board[0].length; b++ ){
                int num = board[b][move-1];
                if(num != 0){
                    if(!popStack.empty()){
                        if(popStack.peek() == num){
                            popStack.pop();
                            answer+=2;
                        }else{
                            popStack.push(num);
                        }

                    }else{
                        popStack.push(num);
                    }
                    board[b][move-1] =0;
                    break;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
            solution(new int[][]{ {0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},new int[] {1,5,3,5,1,2,1,4});
    }
}
