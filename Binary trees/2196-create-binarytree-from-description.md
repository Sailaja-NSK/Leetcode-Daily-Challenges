# LeetCode 2196 - Create Binary Tree From Descriptions

## Problem

Given a 2D array `descriptions` where each entry `[parent, child, isLeft]` represents a parent-child relationship in a binary tree, construct the binary tree and return its root node.

## Explanation

To build the tree efficiently, I used a `HashMap<Integer, TreeNode>` to store and retrieve nodes by their values. This prevents creating duplicate nodes when the same value appears multiple times in the descriptions.

For each description:

* Create the parent node if it does not already exist.
* Create the child node if it does not already exist.
* Connect the child as the left or right child of the parent based on `isLeft`.
* Store every child value in a `HashSet`.

After constructing the tree, the root node is identified as the only node that never appears as a child. By iterating through all nodes in the HashMap and finding the value not present in the HashSet, we obtain the root.

## Complexity Analysis

* Time Complexity: **O(n)**
* Space Complexity: **O(n)**

Where `n` is the number of descriptions.
