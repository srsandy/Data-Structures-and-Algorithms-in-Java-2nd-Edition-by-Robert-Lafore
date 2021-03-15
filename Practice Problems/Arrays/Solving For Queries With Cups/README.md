# Solving For Queries With Cups

**Problem from HackerRank**

There are `n` cups in a row (assume 1-based indexing for the cups). You have `m` balls and you place the `i`<sup>th</sup> ball in the cup _balls<sub>i</sub>_ such that there's atmost ball in each of the cups, therefore the elements of balls are pairwise distinct.

Now, you perform `s` swaps, each swap contains two integers `a` and `b`, you are required to swap the positions of cups at index `a` and index `b`.

Finally, you are asked `q` queries, each query contains two space separated integers `l` and `r`, you need to answer the total number of balls that are present in the cups having index from `l` to `r` (both inclusive).

For example, `n=4`, `m=2`, `balls={2,4}` . Now you perform `s=3` swaps, where you swap the following cups:

- 2nd and 4th
- 2nd and 1st
- 2nd and 3rd

Finally, the balls would be at the indices `{1,4}` . So, for example, if we turned over all the cups from `l=2` to `r=4`, the number of balls found would be `1`.

**Input Format**

The first line of input contains `4` space separated integers `n`, `m`, `s` and `q` denoting the number of cups, number of balls, number of swaps performed and the number of queries respectively.

The second line of input contains `m` space separated integers ball<sub>1</sub>, ball<sub>2</sub>, ball<sub>3</sub> ... ball<sub>n</sub> where ball<sub>i</sub> denotes the position of ball `i`.

The next `s` lines containts two space separated integer `a` and `b` - the indices of cups needed to be swapped in this query.

The next `q` lines containts two space separated integer `l` and `r`, the description of each query.

**Constraints**

- 2 <= `n` <= 10<sup>9</sup>
- 1 <= `m` <= 10<sup>5</sup>
- 1 <= `s, q` <= 6.10<sup>4</sup>
- 1 <= balls<sub>i</sub>, `a`, `b` <= `n`, `a` != `b`
- 1 <= `l` <= `r` <= `n`

**Output Format**

Print `q` space separated integers, where the `i`<sup>th</sup> integer denote the answer for the `i`<sup>th</sup> query.

## Examples:

### Example 1

**Sample Input** :

```java
3 1 3 2
2
1 2
1 3
3 1
1 2
1 3
```

**Sample Output** :

```java
1 1
```

**Explanation**: After the given swaps, the ball will be at position **1**, hence, for both the queries, the answer is **1**.

### Example 2

**Sample Input** :

```java
3 2 2 2
1 3
1 3
3 2
1 2
3 3
```

**Sample Output** :

```java
2 0
```

**Explanation**: After the given swaps, the balls would be at positions `{1,2}`. Hence, for the first query the answer would be **2** (There are **2** balls in the range `[1,2]`) and for the second query, the answer would be **0** (There are no balls in the cup **3**).
