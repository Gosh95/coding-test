package programmers.level2;

import java.util.Deque;
import java.util.LinkedList;

public class PRGRMS43165 {
	public int solution(int[] numbers, int target) {
		int answer = 0;
		int length = numbers.length;

		Deque<int[]> queue = new LinkedList<>();
		queue.add(new int[] {numbers[0], 1});
		queue.add(new int[] {-numbers[0], 1});

		while (!queue.isEmpty()) {
			int[] values = queue.pollFirst();
			int num = values[0];
			int idx = values[1];

			if (idx < length) {
				queue.add(new int[] {num + numbers[idx], idx + 1});
				queue.add(new int[] {num - numbers[idx], idx + 1});
			} else {
				if (target == num) {
					answer++;
				}
			}
		}

		return answer;
	}
}
