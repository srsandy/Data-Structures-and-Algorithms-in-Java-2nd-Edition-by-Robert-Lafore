# ZSUM - Just add it

**Problem from SPOJ**

For two given integers `n` and `k` find  Z<sub>n</sub> + Z<sub>n-1</sub> - 2Z<sub>n-2</sub> mod 10000007 , where Z<sub>n</sub> = S<sub>n</sub> + P<sub>n</sub> and S<sub>n</sub> = 1<sup>k</sup> + 2<sup>k</sup> + 3<sup>k</sup> + … + n<sup>k</sup> and P<sub>n</sub> = 1<sup>1</sup> + 2<sup>2</sup> + 3<sup>3</sup> + … + n<sup>n</sup>.

## Input
There are several test cases (≤ 10000). In each case two space separated positive integers `n` and `k` are given. 
For last test case `n` and `k` are given as `0 0`, which is not to be processed.

## Constraints
`1 < n < 200000000`

`0 < k < 1000000`

Output
For each case print the asked value in separate line.

### Example:

**Input** : 
```java
    10 3
    9 31
    83 17
    5 2
    0 0
```

**Output** : 
```java
    4835897
    2118762
    2285275
    3694
```


