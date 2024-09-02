public class print {


    public static String solution(String my_string, String overwrite_string, int s) {

        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        String answer = String.valueOf(sb.replace(s,overwrite_string.length()+s ,overwrite_string));

        System.out.println(overwrite_string.length());

        System.out.println(my_string.substring(s,overwrite_string.length()+2 ));
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("aaaaaa","bbb",3);
    }
}
