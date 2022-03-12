# Max Hamming Distance (Public Contest: December 2020)

Time Limit: 2 sec
Memory Limit: 128000 kB

---

- Given a string S. Find a string R which is an anagram of S and the hamming distance between S and R is maximum.
- An anagram of a string is another string that contains the same characters, only the order of characters can be different.
- Hamming distance between two strings of equal length is the number of positions at which the corresponding character is different.

---

### Input

<pre>
The first and the only line of input contains a single string S.

Constraints:
1 <= |S| <= 100000
S contains only lowercase letters of the English alphabet.
</pre>

### Output

<pre>
Print the maximum hamming distance between S and R.
</pre>

## Example:

<pre>
Sample Input 1
absba

Sample Output 1
5

Explanation: R can be "bsaab" which has hamming distance of 5 from S.

Sample Input 2
aaa

Sample Output 2
0

Explanation: R can be "aaa" which has hamming distance of 0 from S.
</pre>
