# Edit Distance
**Problem from LeetCode**  
  
Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.

You have the following 3 operations permitted on a word:  
1.Insert a character  
2.Delete a character  
3.Replace a character  
  
### Examples:

#### I

**Input** : 
```java 
abc  
dc  
```

**Output:** : 
```java 
2
```
**Explanation** :  
abc -> bc (remove 'a')
bc -> dc (replace 'b' with 'd')

#### 2

**Input** : 
```java
horse  
ros
```

**Output:** : 
```java
3
```
**Explanation** :  
horse -> rorse (replace 'h' with 'r')  
rorse -> rose (remove 'r')  
rose -> ros (remove 'e')   



  
  The solution given provides both recursive, memoization and Dynamic Programming Solution with proper commenting 
