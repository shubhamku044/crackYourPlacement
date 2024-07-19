package day2;

import java.util.Arrays;

public class moveZeroes {
	public static void main(String[] args) {
		int[] nums = {1, 0, 1};
		moveZeroesInArray(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void moveZeroesInArray(int[] nums) {
		int i = 0;
		int j = 0;

		while (j < nums.length) {
			if (nums[i] != 0) i++;
			j++;
			if (j >= nums.length) break;
			if (nums[i] == 0 && nums[j] != 0) swap(nums, i++, j);
		}
	}

	static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
