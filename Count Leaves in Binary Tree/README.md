# Count Leaves in Binary Tree

Time Limit: 2 sec
Memory Limit: 128000 kB

---

Given a binary tree, count the number of leaves in it. A node having no child node is called a leaf.

---

### Input

<pre>
The first line contains the integer N, denoting the number of nodes in the binary tree.
Next N lines contain two integers, denoting the left and right child of the i-th node respectively.
If the node doesn't have a left or right child, it is denoted by '-1'

1 <= N <= 100000
</pre>

### Output

<pre>
Print the number of leaves in the binary tree
</pre>

## Example:

<pre>
Sample Input 1:
7
2 4
5 3
-1 -1
-1 7
6 -1
-1 -1
-1 -1

Sample output 1:
3

Explanation: Given binary tree
   1
  / \
  2  4
 / \ \
 5 3  7
/
6
Node 3, 6, 7 are the leaves here
</pre>
