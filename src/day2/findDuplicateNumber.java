package day2;

import java.util.HashMap;

public class findDuplicateNumber {
	public static void main(String[] args) {
		int[] nums = {1, 3, 2, 4, 2, 2};
		System.out.println(findDuplicate(nums));
	}

	static int findDuplicate(int[] nums) {
		HashMap<Integer, Integer> numsMap = new HashMap<>();
		for (int num : nums) {
			int numberOccured = numsMap.getOrDefault(num, 0) + 1;
			if (numberOccured > 1) return num;
			numsMap.put(num, numberOccured);
		}
		return -1;
	}
}
