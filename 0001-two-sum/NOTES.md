​First, I think sorting in ascending order would help find the solution. This is because we can ignore values greater than the target.
Then we iterate through the loop.
We store a value temporarily, and if the sum of this temporary value and the value at the current index equals the target, we return an array containing the index of the temporary value and the current index.
Using this approach requires a nested loop, resulting in a time complexity of O(n²).

To improve the time complexity, we could use a data structure like HashMap in Java.
Python has dictionaries for this purpose.

While iterating through the list:

1. Check if the dictionary contains a key equal to (target - nums[index]).
2. If it exists, immediately return an array containing the index and the value associated with that key.
3. And store (target - nums[index]) as the key in the dictionary and the index as its value.
