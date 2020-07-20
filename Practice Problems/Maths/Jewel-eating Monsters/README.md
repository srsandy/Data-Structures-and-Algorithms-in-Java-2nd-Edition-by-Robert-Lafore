# Jewel-eating Monsters

**Problem from ICPC**

According to ancient legends, deep in the Forest of Walking Trees lies a mystical cave called the Cave of Infinite Wealth. In the middle of a huge cavern there is a lake surrounded by stalactites and stalagmites. The dark, cold water of the lake has magical properties; if anyone tosses a gold coin into the lake at midnight and spends the night in the cave, then he will find that he has more money in the morning than he had in the evening. More precisely, if he had `x` gold coins (after tossing one into the water), then he will have `αx` gold coins in the morning.

The famous adventurer Gorgon Rattlesnake spent many years finding the cave. As you can imagine,the exact location is a well-guarded secret. Finally, after studying countless old maps, consulting with many famous sages, and making heavy use of GPS technology, he managed to arrive at the entrance
of the cave. Gorgon Rattlesnake spent `n` nights in the cavern, tossing a coin into the lake each night. After `n` nights, he travelled to the bustling city of Tse’padub. In Tse’padub, he visited the jewellery shop, and
bought diamond rings to make transporting his valuables easier. Each diamond ring costs `c` gold coins, and he bought as many diamond rings as he could.
So far he was lucky. But shortly after he left the jewellery shop, he was attacked by jewel-eating monsters. These monsters did not harm him, but they ate all the diamond rings. For this reason, Gorgon Rattlesnake was left with no other valuables than the remaining gold coins. How many gold coins does he have?

## Input
The input contains several blocks of test cases. Each case consists of four integers separated by spaces:
    - The number `2 ≤ x ≤ 100000000` of coins Gorgon Rattlesnake had when he arrived to the cave.
    - The number `2 ≤ α ≤ 100000000` that the gold coins are multiplied by each night.
    - The number `1 ≤ n ≤ 100000000` of nights Gorgon Rattlesnake spent in the cave.
    - The cost `2 ≤ c ≤ 100000000` of a diamond rings.
It can be assumed (for mysterious reasons) that c is always a prime number.
The input is terminated by a block with `x = α = n = c = 0`.

Output
For each test case, you have to output a line containing a single integer: the number of gold coins Gorgon Rattlesnake has.

### Example:

**Input** : 
```java
    52 7 1 691
    27 4 56 379
    94 7 63 103
    38 2 88 557
    62 11 86 433
    0 0 0 0
```

**Output** : 
```java
    357
    198
    82
    177
    394
```


