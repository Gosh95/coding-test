package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ20207 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int length = 367;
        int[] calendar = new int[length];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end + 1; j++) {
                calendar[j]++;
            }
        }

        int width = 0;
        int height = 0;
        int answer = 0;

        for (int i = 1; i < length; i++) {
            if (calendar[i] != 0) {
                width++;
                height = Math.max(height, calendar[i]);
            } else {
                answer += width * height;
                width = 0;
                height = 0;
            }
        }

        System.out.println(answer);
    }
}
