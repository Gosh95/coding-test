package programmers.level2;

import java.util.Arrays;

public class PRGRMS42885 {
	public int solution(int[] people, int limit) {
		Arrays.sort(people);
		int length = people.length;
		int answer = length;
		int left = 0;
		int right = length - 1;

		while (left < right) {
			if (people[left] + people[right] <= limit) {
				left++;
				answer--;
			}

			right--;
		}

		return answer;
	}
}
