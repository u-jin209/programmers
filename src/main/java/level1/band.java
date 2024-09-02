package level1;

public class band {

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer =health;
        int endAttack = attacks[attacks.length-1][0];
        int attackIdx = 0;
        int i =0;
        int bonusTime = 0;

        while(i<= endAttack && answer>0){
            if( i>0 && answer<=health){
                if(attacks[attackIdx][0] == i){
                    answer-= attacks[attackIdx][1];
                    bonusTime = 0;
                    attackIdx++;
                }else{
                    answer+= bandage[1];
                    if(bonusTime == bandage[0]-1){
                        answer+= bandage[2];
                        bonusTime =  0;

                    }else{
                        bonusTime++;
                    }
                    if(answer >health){
                        answer =health;
                    }
                }
            }
            i++;
        }

        if(answer<=0){
            return -1;
        }else{
            return answer;
        }
    }


    public static void main(String[] args) {
        System.out.println(solution( new int[]{1, 1, 1} , 5, new int[][]{{1,2},{3,2}}));
    }
}
