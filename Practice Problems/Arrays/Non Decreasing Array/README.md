# Non Decreasing Array

**Problem from LeetCode**

Given an array with n integers, your task is to check if it could become **non-decreasing** by modifying at most 1 element.

We define an array is non-decreasing if `array[i] <= array[i + 1]` holds for every **i** `(1 <= i < n)`.

**Note**: The n belongs to `[1, 10,000]`.

### Example:
**Input**: `[4,2,3]`

**Output:**: `true`

**Explanation**: You could modify the first 4 to 1 to get a non-decreasing array.

**Input**: `[4,2,1]`

**Output:**: `false`

**Explanation**: You can't get a non-decreasing array by modify at most one element.
