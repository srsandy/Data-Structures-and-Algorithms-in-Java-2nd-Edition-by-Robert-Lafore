# Rat In A Maze

**Problem from GeeksForGeeks**
A Maze is given as N*N binary matrix of blocks where source block is the upper left most block i.e., maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]. A rat starts from source and has to reach the destination. The rat can move only in two directions: forward and down.
In the maze matrix, 0 means the block is a dead end and 1 means the block can be used in the path from source to destination. Note that this is a simple version of the typical Maze problem. For example, a more complex version can be that the rat can move in 4 directions and a more complex version can be with a limited number of moves. 

**Algorithm:**
If destination is reached
    print the solution matrix
Else
   a) Mark current cell in solution matrix as 1. 
   b) Move forward in the horizontal direction and recursively check if this 
       move leads to a solution. 
   c) If the move chosen in the above step doesn't lead to a solution
       then move down and check if this move leads to a solution. 
   d) If none of the above solutions works then unmark this cell as 0 
       (BACKTRACK) and return false.
       
       
### Example:

**Input** : 
```java 
maze[][] = { { 1, 0, 0, 0 }, 
             { 1, 1, 0, 1 }, 
             { 0, 1, 0, 0 }, 
             { 1, 1, 1, 1 } }
```

**Output:** : 
```java 
The 1 values show the path of rat.
 1  0  0  0 
 1  1  0  0 
 0  1  0  0 
 0  1  1  1
```


### Complexity Analysis:

**Time Complexity:** O(2^(n^2)).
The recursion can run upperbound 2^(n^2) times.

**Space Complexity:** O(n^2).
Output matrix is required so an extra space of size n*n is needed.
