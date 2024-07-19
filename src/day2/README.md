# [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/description/)

### [Solution](./moveZeroes.java)

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero
elements.

**Note**  that you must do this in-place without making a copy of the array.

**Example 1:**

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```

**Example 2:**

```
Input: nums = [0]
Output: [0]
```

**Constraints:**

- `1 <= nums.length <= 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`

**Follow up:**  Could you minimize the total number of operations done?

# [287. Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/description/)

### [Solution](./findDuplicateNumber.java)

Given an array of integers `nums` containing`n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number**  in `nums`, return thisrepeatednumber.

You must solve the problem **without**  modifying the array `nums`and uses only constant extra space.

**Example 1:**

```
Input: nums = [1,3,4,2,2]
Output: 2
```

**Example 2:**

```
Input: nums = [3,1,3,4,2]
Output: 3
```

**Example 3:**

```
Input: nums = [3,3,3,3,3]
Output: 3```

**Constraints:** 

- `1 <= n <= 10^5`
- `nums.length == n + 1`
- `1 <= nums[i] <= n`
- All the integers in `nums` appear only **once**  except for **precisely one integer**  which appears **two or more**  times.

<b>Follow up:</b>

- How can we prove that at least one duplicate number must exist in `nums`?
- Can you solve the problem in linear runtime complexity?