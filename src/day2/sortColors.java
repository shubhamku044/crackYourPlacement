package day2;

import java.util.Arrays;

public class sortColors {
	public static void main(String[] args) {
		System.out.println("Sort colors");
		int[] arr = {2, 0, 2, 1, 1, 0};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		while (mid <= end) {
			switch (arr[mid]) {
				case 0:
					swap(arr, start, mid);
					mid++;
					start++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					swap(arr, mid, end);
					end--;
					break;
			}
		}
	}

	static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
