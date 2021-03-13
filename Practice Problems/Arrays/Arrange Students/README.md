# Arrange Students

**Problem from HackerRank**

A classroom has several students, half of whom are boys and half of whom are girls. You need to arrange all of them in a line for the morning assembly such that the following conditions are satisfied:

- The students must be in order of non-decreasing height.
- Two boys or two girls must not be adjacent to each other.

You have been given the heights of the boys in the array **_b_** and the heights of the girls in the array **_g_** . Find out whether you can arrange them in an order which satisfies the given conditions. Print `"YES"` if it is possible, or `"NO"` if it is not.

For example, let's say there are `n = 3` boys and `n = 3` girls, where the boys' heights are `b = [5,3,8]` and the girls' heights are `g = [2,4,6]`. These students can be arranged in the order **[g<sub>0</sub>,b<sub>1</sub>,g<sub>1</sub>,b<sub>0</sub>,g<sub>2</sub>b<sub>2</sub>]** , which is [2, 3, 4, 5, 6, 8]. Because this is in order of non-decreasing height, and no two boys or two girls are adjacent to each other, this satisfies the conditions. Therefore, the answer is "YES".

**Input Format**

The first line contains an integer, **_t_**, denoting the number of test cases.

The first line of each test case contains an integer, **_n_**, denoting the number of boys and girls in the classroom.

The second line of each test case contains **_n_** space separated integers, **b<sub>1</sub>,b<sub>2</sub>,...b<sub>n</sub>**, denoting the heights of the boys.

The third line of each test case contains **_n_** space separated integers, **g<sub>1</sub>,g<sub>2</sub>,...g<sub>n</sub>**, denoting the heights of the girls.

**Constraints**

- `1 <= t <=10`
- `1 <= n <= 100`
- `1 <= g[i], b[i] <= 100`

**Output Format**

Print exactly **_t_** lines. **_i<sup>th</sup>_** In the of them, print a single line containing `"YES"` if it is possible to arrange the students in the **_i<sup>th</sup>_** test case, or `"NO"` if it is not.

## Examples:

### Example 1

**Input**:

```java
1
2
1 3
2 4
```

**Output:**:

```java
YES
```

**Explanation**: The following arrangement would satisfy the given conditions: **[b<sub>1</sub>,g<sub>1</sub>,b<sub>2</sub>,g<sub>2</sub>]** . This is because the boys and girls and separated, and the height is in non-decreasing order.

### Example 2

**Input**:

```java
2
2
1 2
3 4
3
2 3 5
1 3 4
```

**Output:**:

```java
NO
YES
```

**Explanation**: For the first test case, if we arrange them in non-decreasing order of heights, the arrangement would be **[b<sub>1</sub>,b<sub>2</sub>,g<sub>1</sub>,g<sub>2</sub>]** . But this way, two boys (and two girls) are adjacent to each other. Therefore, the answer is `"NO"`.

For the second test case, we can arrange them as **[g<sub>1</sub>,b<sub>1</sub>,g<sub>2</sub>,b<sub>2</sub>,g<sub>3</sub>,b<sub>3</sub>]** . Therefore, the answer is `"YES"`.
