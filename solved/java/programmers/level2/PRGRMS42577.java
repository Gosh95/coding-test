package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class PRGRMS42577 {
	public boolean solution(String[] phone_book) {
		Map<String, Boolean> map = new HashMap<>();

		for (String phoneNumber : phone_book) {
			map.put(phoneNumber, map.getOrDefault(phoneNumber, true));
		}

		for (String phoneNumber : phone_book) {
			for (int i = 1; i < phoneNumber.length(); i++) {
				if (Boolean.TRUE.equals(map.get(phoneNumber.substring(0, i)))) {
					return false;
				}
			}
		}

		return true;
	}
}
