package home.Task_08;
/*
Объединить 2 бинарных дерева
 */
public class Task_08_2_Main {
    public static void main(String[] args) {
        TreeNode rootOne = new TreeNode(1);
        rootOne.left = new TreeNode(3);
        rootOne.left.left = new TreeNode(5);
        rootOne.right = new TreeNode(2);

        TreeNode rootTwo = new TreeNode(2);
        rootTwo.left = new TreeNode(1);
        rootTwo.left.right = new TreeNode(4);
        rootTwo.right = new TreeNode(3);
        rootTwo.right.right = new TreeNode(7);

        TreeNode mergeResult = mergeTrees(rootOne, rootTwo);
    }

    public static TreeNode mergeTrees(TreeNode rootOne, TreeNode rootTwo) {
        if (rootOne == null) {
            printer(rootTwo);
            return rootTwo;
        } else if (rootTwo == null) {
            printer(rootOne);
            return rootOne;
        } else {
            TreeNode result = new TreeNode(rootOne.value + rootTwo.value);
            printer(result);
            result.left = mergeTrees(rootOne.left, rootTwo.left);
            result.right = mergeTrees(rootOne.right, rootTwo.right);
            return result;
        }
    }

    public static void printer(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
    }

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            value = x;
        }
    }
}
