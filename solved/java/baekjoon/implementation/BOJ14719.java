package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ14719 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> blocks = new ArrayList<>();

        while (st.hasMoreTokens()) {
            blocks.add(Integer.parseInt(st.nextToken()));
        }

        int left = 0;
        int right = w - 1;
        int maxLeft = blocks.get(left);
        int maxRight = blocks.get(right);
        int answer = 0;

        while (left < right) {
            maxLeft = Math.max(maxLeft, blocks.get(left));
            maxRight = Math.max(maxRight, blocks.get(right));

            if (maxLeft >= maxRight) {
                answer += maxRight - blocks.get(right);
                right--;
            } else {
                answer += maxLeft - blocks.get(left);
                left++;
            }
        }

        System.out.println(answer);
    }
}
