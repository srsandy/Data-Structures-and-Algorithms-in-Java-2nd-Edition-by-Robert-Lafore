# Reduced Subtracted Form

**Problem from Unknown Source**

Given a number you are expected to find it's two digit reduced substracted form.

The Reduced Subtracted Form (RSF) of a number can be found by concatenating the difference between it's adjacent digits.

To find the two digit reduced substracted form, we need to continue this process till the resultant RSF is not two digit number.

### Example:
**Input** : `6928`

**Output:** : `376`

**Explanation** :  As the input is `6928`. 

The RFS can be found by concatenating the difference between `(6 and 9)`, `(9 and 2)`, and `(2 and 8)` as shown below. <br/>
difference between `6` and `9` is `3` <br/>
difference between `9` and `2` is `7` <br/>
difference between `2` and `8` is `6` <br/>
So the RSF of `6923` = 376. <br />
Now continuing the same process we will get the RSF of `376` is `41`. <br />
Hence the result is `41`

