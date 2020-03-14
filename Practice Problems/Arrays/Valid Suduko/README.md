# Valid Sudoku

**Problem from LeetCode**

Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated **according to the following rules**:

 1. Each row must contain the digits `1-9` without repetition.
 2. Each column must contain the digits `1-9` without repetition.
 3. Each of the 9 `3x3` sub-boxes of the grid must contain the digits `1-9`without repetition

The Sudoku board could be partially filled, where empty cells are filled with the character `'.'`.

**Note**:

 - A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 - Only the filled cells need to be validated according to the mentioned rules.
 - The given board contain only digits `1-9` and the character `'.'`.
 - The given board size is always `9x9`.
 

### **Example**

**Input**: 

``` java
   grid = [
  ['8','3','.','.','7','.','.','.','.'],
  ['6','.','.','1','9','5','.','.','.'],
  ['.','9','8','.','.','.','.','6','.'],
  ['8','.','.','.','6','.','.','.','3'],
  ['4','.','.','8','.','3','.','.','1'],
  ['7','.','.','.','2','.','.','.','6'],
  ['.','6','.','.','.','.','2','8','.'],
  ['.','.','.','4','1','9','.','.','5'],
  ['.','.','.','.','8','.','.','7','9']
]
```
   
**Output:**: 

``` java
    false
```
**Explanation**: Except with the 5 in the top left corner being  modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.



