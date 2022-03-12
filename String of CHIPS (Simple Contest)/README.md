# String of CHIPS (Simple Contest)

Time Limit: 2 sec
Memory Limit: 128000 kB

---

- A string is a string of CHIPS if it is a string formed by concatinating "chips" a positive number of times to an empty string. For example "chips" and "chipschips" are string of CHIPS whereas "chipsch" and "random" are not. Find out minimum number of moves required to make a given string S into a string of CHIPS. In a single move you can set any character of string to any character.

---

### Input

<pre>
First and only line of input contains a single string S.

Constraints:
1 <= |S| <= 100000
S contains lowercase english letters.
|S| is a multiple of 5.
</pre>

### Output

<pre>
Print the minimum number of moves required to make string S into a string of CHIPS.
</pre>

## Example:

<pre>
Sample input 1
chips

Sample output 1
0

Sample input 2
ohipo

Sample output 2
2
</pre>
