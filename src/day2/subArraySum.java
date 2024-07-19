package day2;

import java.util.HashMap;

public class subArraySum {
	public static void main(String[] args) {
		int[] nums1 = {1, 1, 1};
		int k1 = 2;
		int[] nums2 = {1, 2, 3};
		int k2 = 3;

		System.out.println(subArraySumK(nums1, k1));
		System.out.println(subArraySumK(nums2, k2));
	}

	static int subArraySumK(int[] nums, int targetSum) {
		int ans = 0;
		int sum = 0;
		HashMap<Integer, Integer> prevSum = new HashMap<>();
		prevSum.put(0, 1);
		for (int num : nums) {
			sum += num;
			if (prevSum.containsKey(sum - targetSum)) {
				ans += prevSum.get(sum - targetSum);
			}
			prevSum.put(sum, prevSum.getOrDefault(sum, 0) + 1);
		}
		return ans;
	}
}
