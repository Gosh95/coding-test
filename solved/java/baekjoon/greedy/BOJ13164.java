package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ13164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int k = Integer.parseInt(values[1]);

        List<Integer> heights = Arrays
            .stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());

        List<Integer> diff = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            diff.add(heights.get(i) - heights.get(i - 1));
        }

        Collections.sort(diff);
        int answer = diff.subList(0, n - k).stream().reduce(0, Integer::sum);

        System.out.println(answer);
    }
}
