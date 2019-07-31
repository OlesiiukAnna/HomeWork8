Дз8
1. Число Фибоначи
написать метод который возвращает N-ное число фибоначи, по правилу:
F(0) = 0, F(1) = 1
F(N) = F(N - 1) + F(N - 2)
2*. Объединить 2 бинарных дерева
Input:
Tree 1 Tree 2
1 2
/ \ / \

3 2 1 3

/ \ \

5 4 7

Output:
Merged tree:
3
/ \
4 5
/ \ \
5 4 7
https://www.dropbox.com/s/lrblb3vjfi1qkwm/tree.png?dl=0
public class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode(int x) { val = x; }
}
public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {...}
