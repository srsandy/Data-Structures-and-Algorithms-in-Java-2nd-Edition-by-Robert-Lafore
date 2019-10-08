<h1> AGGRESSIVE COW </h1>

Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,...,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
<b>Input :-</b>

t – the number of test cases, then t test cases follows.
Line 1: Two space-separated integers: N and C
Lines 2..N+1: Line i+1 contains an integer stall location, xi

<b>Output :-</b>

For each test case output one integer: the largest minimum distance.

<b>Example :-</b>

<b>Input:</b>

1
5 3
1
2
8
4
9

<b>Output: </b>

3

<b>Output details: </b>

FJ can put his 3 cows in the stalls at positions 1, 4 and 8,
resulting in a minimum distance of 3.