package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1092 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int n = Integer.parseInt(br.readLine());
        List<Integer> cranes = new ArrayList<>();
        StringTokenizer nums = new StringTokenizer(br.readLine());

        while (nums.hasMoreTokens()) {
            cranes.add(Integer.parseInt(nums.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        List<Integer> boxes = new ArrayList<>();
        nums = new StringTokenizer(br.readLine());

        while (nums.hasMoreTokens()) {
            boxes.add(Integer.parseInt(nums.nextToken()));
        }

        cranes.sort((a, b) -> b - a);
        boxes.sort((a, b) -> b - a);

        if (cranes.get(0) < boxes.get(0)) {
            answer = -1;
        } else {
            while (!boxes.isEmpty()) {
                int boxIdx = 0;
                int craneIdx = 0;

                while (craneIdx < n) {
                    if (boxIdx == boxes.size()) {
                        break;
                    } else if (cranes.get(craneIdx) >= boxes.get(boxIdx)) {
                        boxes.remove(boxIdx);
                        craneIdx++;
                    } else {
                        boxIdx++;
                    }
                }

                answer++;
            }
        }

        System.out.println(answer);
    }
}
