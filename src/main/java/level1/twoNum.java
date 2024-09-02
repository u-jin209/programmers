package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class twoNum {
    static Set<Integer> set = new HashSet<>();

    public static int[] solution(int[] numbers) {
        int n = numbers.length;
        int r = 2;
        combi(numbers, new int[r], new boolean[n], n, r, 0, 0);

        Integer[] answer =set.toArray(new Integer[0]);
        Arrays.sort(answer);
        System.out.println(set);
        return Arrays.stream(answer).mapToInt(Integer :: intValue).toArray();

    }

    public static void combi(int[] arr, int[] output, boolean[] visited, int n, int r, int start, int depth) {
        if (depth == r) {
            set.add(output[0] + output[1]);
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                System.out.println(Arrays.toString(output));
                output[depth] = arr[i];
                combi(arr, output, visited, n, r, i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }


    public static void main(String[] args) {
        solution(new int[]{2,1,3,4,1});
    }

}
