package programmers.level1;


public class PRGRMS77484 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] ranking = {6, 6, 5, 4, 3, 2, 1};
		int score = 0;
		int zeroCount = 0;

		for (int lotto : lottos) {
			if (lotto == 0) {
				zeroCount++;
				continue;
			}

			for (int win_num : win_nums) {
				if (lotto == win_num) {
					score++;
				}
			}
		}

		return new int[]{ranking[score + zeroCount], ranking[score]};
	}
}
