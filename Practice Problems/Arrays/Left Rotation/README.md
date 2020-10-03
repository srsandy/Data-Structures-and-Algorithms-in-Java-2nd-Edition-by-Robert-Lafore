Left Rotation
=============
A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return 
the result.
### Example
d=2, 
arr= [1,2,3,4,5], 
After 2 rotations arr'= [3,4,5,1,2].
### Function Decription
Complete the rotateLeft function in the editor below.

rotateLeft has the following parameters:
* int d: the amount to rotate by
* int arr[n]: the array to rotate
### Returns
* int[n]: the rotated array
### Input Format
The first line contains two space-separated integers that denote n, the number of integers, and d, the number of left rotations to perform.
The second line contains n space-separated integers that describe arr[].
### Constraints
* 1<= n <= 10<sup>5</sup>
* 1<= d <= n
* 1<= a[i] <= 10<sup>6</sup>
### Sample Input
* 5 4
* 1 2 3 4 5
### Sample Output
* 5 1 2 3 4
### Explanation
To perform d=4 left rotations, the array undergoes the following sequence of changes:

[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]
### Test cases
#### Test case 1
Input(stdin)
* 20 10
* 41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51

Expected Output
* 41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51
#### Test case 2
Input(stdin)
* 14 7
* 98 67 35 1 74 79 7 26 54 63 24 17 32 81

Expected Output
* 26 54 63 24 17 32 81 98 67 35 1 74 79 7
#### Test case 3
Input(stdin)
* 61 48
* 431 397 149 275 556 362 852 789 601 357 516 575 670 507 127 888 284 405 806 27 495 879 976 467 342 356 908 750 769 947 425 643 754 396 653 595 108 75 347 394 935 252 683 966 553 724 629 567 93 494 693 965 328 187 728 389 70 288 509 252 449

Expected Output
* 93 494 693 965 328 187 728 389 70 288 509 252 449 431 397 149 275 556 362 852 789 601 357 516 575 670 507 127 888 284 405 806 27 495 879 976 467 342 356 908 750 769 947 425 643 754 396 653 595 108 75 347 394 935 252 683 966 553 724 629 567
#### Test case 4
Input(stdin)
* 3 2
* 344 210 102

Expected Output
* 102 344 210
#### Test case 5
Input(stdin)
* 5 4
* 1 2 3 4 5
Expected Output
* 5 1 2 3 4

