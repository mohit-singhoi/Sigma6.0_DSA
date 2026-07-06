# Dynamic Programming (DP)

# What is Dynamic Programming?

Dynamic Programming (DP) is an optimization technique used to solve problems by breaking them into **smaller overlapping subproblems** and storing their solutions so that each subproblem is solved only once.

It improves the efficiency of recursive solutions by avoiding repeated computations.

---

# Conditions for Dynamic Programming

A problem can be solved using DP if it satisfies the following two properties:

## 1. Overlapping Subproblems

The same subproblem is solved multiple times.

### Example

```
fib(5)

          fib(5)
        /        \
    fib(4)      fib(3)
    /    \      /    \
fib(3) fib(2) fib(2) fib(1)
```

Here,

```
fib(3)
fib(2)
```

are calculated multiple times.

---

## 2. Optimal Substructure

The optimal solution of the original problem can be obtained using the optimal solutions of its smaller subproblems.

Examples:

- Fibonacci
- Knapsack
- LCS
- Matrix Chain Multiplication

---

# Approaches in Dynamic Programming

There are two approaches.

## 1. Memoization (Top-Down)

- Uses recursion.
- Stores already calculated answers.
- Avoids repeated calculations.

### Steps

1. Write recursive solution.
2. Create DP array.
3. Store answer before returning.
4. If answer already exists, return it.

### Example

```java
import java.util.Arrays;

public class FibonacciMemo {

    public static int fib(int n, int dp[]) {

        if(n==0 || n==1)
            return n;

        if(dp[n]!=-1)
            return dp[n];

        dp[n]=fib(n-1,dp)+fib(n-2,dp);

        return dp[n];
    }

    public static void main(String args[]){

        int n=7;

        int dp[]=new int[n+1];

        Arrays.fill(dp,-1);

        System.out.println(fib(n,dp));
    }
}
```

Output

```
13
```

Time Complexity

```
O(n)
```

Space Complexity

```
O(n)
```

---

# 2. Tabulation (Bottom-Up)

Uses iteration instead of recursion.

### Steps

1. Create DP table.
2. Fill smallest values.
3. Build larger answers.

### Example

```java
public class FibonacciTab {

    public static int fib(int n){

        int dp[]=new int[n+1];

        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){

            dp[i]=dp[i-1]+dp[i-2];

        }

        return dp[n];
    }

    public static void main(String args[]){

        System.out.println(fib(7));
    }
}
```

Output

```
13
```

Time Complexity

```
O(n)
```

Space Complexity

```
O(n)
```

---

# Space Optimized DP

Many DP problems only require previous states.

Example

```java
public class Fibonacci {

    public static int fib(int n){

        if(n<=1)
            return n;

        int prev2=0;
        int prev1=1;

        for(int i=2;i<=n;i++){

            int curr=prev1+prev2;

            prev2=prev1;
            prev1=curr;
        }

        return prev1;
    }

    public static void main(String args[]){

        System.out.println(fib(7));
    }
}
```

Time Complexity

```
O(n)
```

Space Complexity

```
O(1)
```

---

# Memoization vs Tabulation

| Memoization | Tabulation |
|--------------|------------|
| Top Down | Bottom Up |
| Recursion | Iteration |
| Easy to write | Slightly difficult |
| Stack space required | No recursion stack |
| Computes only required states | Computes all states |

---

# DP Flow

```
Problem
   |
Recursive Solution
   |
Repeated Subproblems?
   |
Yes
   |
Memoization
   |
Tabulation
   |
Space Optimization
```

---

# How to Identify DP Problems?

Ask these questions.

### Question 1

Can I solve this recursively?

If YES

↓

Question 2

Are recursive calls repeating?

If YES

↓

Question 3

Can I store those answers?

If YES

↓

It is Dynamic Programming.

---

# DP Patterns

## Pattern 1

Fibonacci Pattern

Problems

- Fibonacci Number
- Climbing Stairs
- Frog Jump
- Min Cost Climbing Stairs

---

## Pattern 2

Knapsack Pattern

Problems

- 0/1 Knapsack
- Unbounded Knapsack
- Rod Cutting
- Partition Equal Subset Sum

---

## Pattern 3

String DP

Problems

- Longest Common Subsequence
- Longest Common Substring
- Edit Distance
- Wildcard Matching
- Distinct Subsequences

---

## Pattern 4

Grid DP

Problems

- Unique Paths
- Minimum Path Sum
- Cherry Pickup
- Dungeon Game

---

## Pattern 5

LIS Pattern

Problems

- Longest Increasing Subsequence
- Maximum Sum Increasing Subsequence
- Russian Doll Envelopes

---

## Pattern 6

Interval DP

Problems

- Matrix Chain Multiplication
- Burst Balloons
- Palindrome Partitioning

---

## Pattern 7

Tree DP

Problems

- House Robber III
- Diameter of Tree
- Maximum Path Sum

---

## Pattern 8

Bitmask DP

Problems

- Travelling Salesman Problem
- Assignment Problem

---

# Common DP Problems

## Beginner

- Fibonacci Number
- Climbing Stairs
- Frog Jump
- House Robber
- Min Cost Climbing Stairs

---

## Intermediate

- 0/1 Knapsack
- Coin Change
- Rod Cutting
- Subset Sum
- Partition Equal Subset Sum
- Target Sum

---

## Advanced

- Longest Common Subsequence
- Edit Distance
- Matrix Chain Multiplication
- Palindrome Partitioning
- Egg Dropping
- Burst Balloons
- Boolean Parenthesization

---

# Time Complexity Comparison

| Approach | Time |
|-----------|------|
| Recursion | O(2ⁿ) |
| Memoization | O(n) |
| Tabulation | O(n) |
| Space Optimized | O(n) |

---

# Advantages

- Avoids repeated calculations.
- Improves recursive solutions.
- Converts exponential problems into polynomial.
- Used in almost every coding interview.

---

# Disadvantages

- Requires extra memory.
- Hard to identify states.
- State transition may be difficult.

---

# DP Roadmap

## Beginner

- Fibonacci
- Climbing Stairs
- Frog Jump
- House Robber
- Min Cost Climbing Stairs

---

## Intermediate

- Knapsack
- Coin Change
- Rod Cutting
- Subset Sum
- LCS

---

## Advanced

- LIS
- Matrix Chain Multiplication
- Edit Distance
- Wildcard Matching
- Palindrome Partitioning
- DP on Trees
- DP on Graphs
- Bitmask DP

---

# Interview Tips

Whenever you see a DP problem:

1. Write recursive solution.
2. Identify changing parameters (State).
3. Write recurrence relation.
4. Apply Memoization.
5. Convert to Tabulation.
6. Optimize space if possible.

---

# Famous DP Problems (LeetCode)

- 70. Climbing Stairs
- 198. House Robber
- 322. Coin Change
- 300. Longest Increasing Subsequence
- 1143. Longest Common Subsequence
- 72. Edit Distance
- 416. Partition Equal Subset Sum
- 518. Coin Change II
- 64. Minimum Path Sum
- 120. Triangle

---

# Summary

Dynamic Programming is used when:

✔ Overlapping Subproblems exist.

✔ Optimal Substructure exists.

Two approaches:

- Memoization (Top-Down)
- Tabulation (Bottom-Up)

Final Optimization:

- Space Optimization