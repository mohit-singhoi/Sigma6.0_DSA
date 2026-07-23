# Segment Tree (Java)

## What is a Segment Tree?

A **Segment Tree** is a binary tree data structure used to perform **range queries** and **point updates** efficiently on an array.

Instead of traversing the entire array for every query, a Segment Tree stores information about different segments (ranges) of the array.

---

# Why do we need Segment Tree?

Suppose we have an array:

```text
arr = [1, 3, 5, 7, 9, 11]
```

We need to answer multiple queries like:

- Sum from index 1 to 4
- Minimum from index 2 to 5
- Maximum from index 0 to 3

We may also need to update values:

```text
arr[2] = 10
```

If we use a normal array:

- Range Query → O(n)
- Update → O(1)

If there are many queries, this becomes slow.

Segment Tree improves the query time to **O(log n)**.

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| Build Tree | O(n) |
| Range Query | O(log n) |
| Point Update | O(log n) |
| Space | O(4n) |

---

# Segment Tree Structure

For the array:

```text
arr = [1, 3, 5, 7]
```

The Segment Tree looks like:

```text
                16
              /    \
             4      12
            / \    /  \
           1   3  5    7
```

Each node stores the sum of a segment.

- Root → Sum of [0...3]
- Left Child → Sum of [0...1]
- Right Child → Sum of [2...3]

---

# Array Representation

Segment Tree is generally stored in an array.

```java
int tree[] = new int[4 * n];
```

where `n` is the size of the original array.

---

# Algorithm

## 1. Build Tree

- If start == end, store the array value.
- Otherwise,
  - Divide into two halves.
  - Build left subtree.
  - Build right subtree.
  - Store the sum of both children.

---

## 2. Range Query

Three cases:

### 1. No Overlap

Return 0.

### 2. Complete Overlap

Return the current node value.

### 3. Partial Overlap

Query both children and return their sum.

---

## 3. Point Update

- Reach the leaf node.
- Update the value.
- Update all parent nodes while returning.

---

# Java Code

## Build Segment Tree

```java
public static void build(int arr[], int tree[], int node, int start, int end){

    if(start == end){
        tree[node] = arr[start];
        return;
    }

    int mid = (start + end) / 2;

    build(arr, tree, 2 * node, start, mid);
    build(arr, tree, 2 * node + 1, mid + 1, end);

    tree[node] = tree[2 * node] + tree[2 * node + 1];
}
```

---

## Range Sum Query

```java
public static int query(int tree[], int node, int start, int end,
                        int left, int right){

    // No overlap
    if(right < start || left > end)
        return 0;

    // Complete overlap
    if(left <= start && end <= right)
        return tree[node];

    // Partial overlap
    int mid = (start + end) / 2;

    int p1 = query(tree, 2 * node, start, mid, left, right);
    int p2 = query(tree, 2 * node + 1, mid + 1, end, left, right);

    return p1 + p2;
}
```

---

## Point Update

```java
public static void update(int tree[], int node, int start, int end,
                          int idx, int value){

    if(start == end){
        tree[node] = value;
        return;
    }

    int mid = (start + end) / 2;

    if(idx <= mid)
        update(tree, 2 * node, start, mid, idx, value);
    else
        update(tree, 2 * node + 1, mid + 1, end, idx, value);

    tree[node] = tree[2 * node] + tree[2 * node + 1];
}
```

---

# Example

Input:

```text
arr = [1,3,5,7,9,11]
```

Query:

```text
Sum(1,4)
```

Output:

```text
24
```

Update:

```text
arr[2] = 10
```

New Query:

```text
Sum(1,4)
```

Output:

```text
29
```

---

# Applications

- Range Sum Query
- Range Minimum Query (RMQ)
- Range Maximum Query
- GCD Queries
- XOR Queries
- Competitive Programming
- Coding Interviews

---

# Advantages

- Fast Range Queries
- Fast Updates
- Works efficiently for dynamic arrays
- Better than brute force for multiple queries

---

# Disadvantages

- Uses extra memory (4 × n)
- More difficult to implement than prefix sums

---

# Summary

- Segment Tree is a Binary Tree.
- Used for Range Queries and Updates.
- Build Time = **O(n)**
- Query Time = **O(log n)**
- Update Time = **O(log n)**
- Space = **O(4n)**

Segment Tree is one of the most important data structures for coding interviews and competitive programming.