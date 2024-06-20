package level1;

import java.util.Arrays;
import java.util.Objects;

public class secretMap {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[][] numArr1 = setList(n, arr1);
        String[][] numArr2 = setList(n, arr2);

        for(int i=0; i< arr1.length ; i++){
            String[] change = new String[n];
            for (int k=0; k< numArr1[0].length;k++){
                if(numArr1[i][k].equals("1") || numArr2[i][k].equals("1")){
                    change[k] ="#";
                }else{
                    change[k] =" ";
                }
            }
            String joinString = String.join( "", change);
            answer[i] = joinString;
        }

        return answer;
    }

    public static String[][] setList(int n, int[] array){
        String[][] numArr = new String[array.length][n];
        for(int i=0; i<array.length; i++){
            String[] num = Integer.toBinaryString(array[i]).split("");
            int idx = 0;
            for(int k=0; k< n;k++){
                if( k >= n-num.length && idx <= num.length){
                    numArr[i][k] = num[idx];
                    idx++;
                }else{
                    numArr[i][k] = "0";
                }
            }
        }
        return numArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
    }
}
