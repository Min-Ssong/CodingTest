import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            char[] ch = br.readLine().toCharArray();
            int[] count = {0}; // 호출 횟수를 배열로 관리
            int result = recursion(ch, 0, ch.length - 1, count);
            sb.append(result).append(" ").append(count[0]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static int recursion(char[] ch, int l, int r, int[] count) {
        count[0]++; // 호출 횟수 증가
        if (l >= r) return 1;
        else if (ch[l] != ch[r]) return 0;
        else return recursion(ch, l + 1, r - 1, count);
    }
}
