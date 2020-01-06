# Knight's Possible Moves

**Problem from GeekForGeeks**

Given a chess board of dimension `m * n`. Find number of possible moves where knight can be moved on a chessboard from given position. If `board[i][j] = 1` then the block is filled by something else, otherwise empty.

Assume that board consist of all pieces of same color, i.e., there are no blocks being attacked.. 

Solve it without **division operator** and in `O(n)`

### **Example**

**Input**: 

``` java
    board[][] = {{1, 0, 1, 0},
                   {0, 1, 1, 1},
                   {1, 1, 0, 1},
                   {0, 1, 1, 1}}
        pos = (2, 2)
```
   
**Output:**: 

``` java
   4
```


