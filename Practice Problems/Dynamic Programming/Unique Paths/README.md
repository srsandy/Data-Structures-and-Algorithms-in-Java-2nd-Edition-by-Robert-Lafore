# Unique Paths

**Problem from LeetCoder**

A robot is located at the top-left corner of a `m` x `n` grid (marked 'Start' in the diagram below).

![diagram](https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png)

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

**Note** : `m` and `n` will be at most `100`.


### Examples:

#### 1

**Input** : 
```java 
m = 3, n = 2
```

**Output:** : 
```java 
3
```
**Explanation** :
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right

#### 2

**Input** : 
```java
m = 7, n = 3
```

**Output:** : 
```java
28
```
