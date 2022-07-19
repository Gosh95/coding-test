package programmers.level2;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PRGRMS42587 {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		Deque<int[]> queue = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) {
			queue.add(new int[] {priorities[i], i});
		}

		List<Integer> priorityList = Arrays
			.stream(priorities)
			.boxed()
			.sorted((a, b) -> b - a)
			.collect(Collectors.toList());

		while (!queue.isEmpty()) {
			answer++;
			int maxPriority = priorityList.get(0);

			while (maxPriority != queue.peekFirst()[0]) {
				queue.add(queue.pollFirst());
			}

			int[] values = queue.pollFirst();
			priorityList.remove(0);
			int idx = values[1];

			if (idx == location) {
				break;
			}
		}

		return answer;
	}
}
