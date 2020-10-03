# Word Break Problem

**Problem from GeeksForGeeks**

Given a valid `sentence` without any spaces between the words and a `dictionary` of valid English words, find all possible ways to break the `sentence` in individual `dictionary` words.

### Examples:

#### 1

**Input** : 
```java 
dictionary = ["mobile","samsung","sam","sung","man","mango", "icecream","and", "go","love","ice","cream","we"], 
sentence = "weloveicecreamandmango"
```

**Output:** : 
```java 
we love ice cream and man go 
we love ice cream and mango 
we love icecream and man go 
we love icecream and mango 
```

#### 2

**Input** :
```java
dictionary = ["i", "like", "sam", "sung", "samsung", "mobile", "ice", "and", "cream", "icecream", "man", "go", "mango"]
sentence = "ilikesamsungmobile"
```

**Output:** :
```java
i like sam sung mobile
i like samsung mobile
```
