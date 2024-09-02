package algorithm;

public class Combination {

    public static void main(String[] args) {
        int[] arr = { 1, 9, 5, 4, 3 };
        int n = 5;
        int r = 2;

        System.out.println("1. 백트랙킹");
        combi1(arr, new int[r], new boolean[n], n, r, 0, 0);

        System.out.println("2. 재귀");
        combi2(arr, new int[r], new boolean[n], n, r, 0, 0);
    }

    //1. 백트랙킹
    /* arr: 길이 n의 int 배열, 여기서 숫자를 뽑는다
     *  output: 길이 r의 int 배열, 뽑은 조합을 이 곳에 저장한다
     *  visited: 길이 n의 boolean 배열, 이 위치에 있는 arr이 이미 뽑혔는지 저장한다
     *  n: arr의 길이, 전체 값의 수
     *  r: ouput의 길이, 뽑을 값의 수 (고정)
     *  start: 어느 위치부터 수를 뽑을지 정하는 index 값
     *  depth: 현재 뽑힌 수의 수
     */
    public static void combi1(int[] arr, int[] output, boolean[] visited, int n, int r, int start, int depth) {
        if (depth == r) {
            printArr(output);
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                combi1(arr, output, visited, n, r, i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    //2. 재귀
    /* arr: 길이 n의 int 배열, 여기서 숫자를 뽑는다
     *  output: 길이 r의 int 배열, 뽑은 조합을 이 곳에 저장한다
     *  visited: 길이 n의 boolean 배열, 이 위치에 있는 arr이 이미 뽑혔는지 저장한다
     *  n: arr의 길이, 전체 값의 수
     *  r: 앞으로 뽑아야할 수 (가변)
     *  index: 현재 뽑힌 수의 수, output 어디에 넣을 차례인지 알려주는 index 값
     *  depth: arr의 어느 위치까지 확인했는지 알려주는 index 값
     */
    public static void combi2(int[] arr, int[] output, boolean[] visited, int n, int r, int index, int depth) {
        if (r == 0) {
            printArr(output);
            return;
        }
        if (depth == n) {
            return;
        }

        visited[depth] = true;
        output[index] = arr[depth];
        combi2(arr, output, visited, n, r - 1, index + 1, depth + 1);

        visited[depth] = false;
        combi2(arr, output, visited, n, r, index, depth + 1);
    }

    public static void printArr(int[] print) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int p : print) {
            sb.append(p);
            sb.append(" ");
        }
        sb.setLength(sb.length() - 1);
        sb.append("]");

        System.out.println(sb.toString());
    }

}
