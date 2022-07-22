package programmers.level2;

import java.util.Deque;
import java.util.LinkedList;

public class PRGRMS12973 {
	public int solution(String s) {
		String[] arr = s.split("");
		Deque<String> stack = new LinkedList<>();
		stack.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (!stack.isEmpty() && stack.peekLast().equals(arr[i])) {
				stack.pollLast();

				continue;
			}

			stack.add(arr[i]);
		}

		return stack.isEmpty() ? 1 : 0;
	}
}
