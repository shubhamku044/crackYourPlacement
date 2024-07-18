package day1;

import java.util.Arrays;

public class removeDuplicatesFromSortedArray {
	public static void main(String[] args) {
		System.out.println("Remove duplicates from sorted array");
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}

	static int removeDuplicates(int[] nums) {
		int i = 0;
		int j = 0;
		while (j < nums.length) {
			if (nums[i] == nums[j]) {
				j++;
			} else {
				swap(nums, ++i, j++);
			}
		}
		return i + 1;
	}

	static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}

