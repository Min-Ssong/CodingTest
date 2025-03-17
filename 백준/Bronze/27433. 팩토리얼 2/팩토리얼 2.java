import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값 처리
        int n = Integer.parseInt(br.readLine());

        // 팩토리얼 계산 및 출력
        bw.write(String.valueOf(fact(n)));
        bw.flush();
        bw.close();
        br.close();
    }

    public static long fact(int n) {
        if (n == 0) return 1; // Base Case
        return n * fact(n - 1); // Recursive Step
    }
}
