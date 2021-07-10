package BinaryTree;

import java.util.*;

public class BST {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    //-----------------------------------------------------------------------------------------------

    // public static int size(TreeNode root) {
    //     return root == null ? 0 : size(root.left) + size(root.right) + 1;
    // }

    //-----------------------------------------------------------------------------------------------


    // public static int height(TreeNode root) {
    //     return root == null ? -1 : Math.max(height(root.left), height(root.right)) + 1;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static int Maximum(TreeNode root) {
    //     TreeNode cur = root;
    //     while (cur.right != null) cur = cur.right;
    //     return cur.val;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static int Minimum(TreeNode root) {
    //     TreeNode cur = root;
    //     while (cur.left != null) cur = cur.left;
    //     return cur.val;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static boolean find(TreeNode root, int data) {
    //     TreeNode cur = root;
    //     while (cur != null) {
    //         if (cur.val == data) return true;
    //         else if (data > cur.val) cur = cur.right;
    //         else cur = cur.left;
    //     }

    //     return false;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ArrayList<TreeNode> rootToNodePath(TreeNode root, int data) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     TreeNode cur = root;

    //     boolean flag = false;
    //     while (cur != null) {
    //         ans.add(cur.val);
    //         if (cur.val == data) {
    //             flag = true;
    //             break;
    //         }
    //         else if (data > cur.val) cur = cur.right;
    //         else cur = cur.left;
    //     }

    //     if (!flag) ans.clear();

    //     return ans;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static TreeNode LowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     TreeNode cur = root;

    //     while (cur != null) {
    //         if (p.val > cur.val && q.val > cur.val) cur = cur.right;
    //         else if (p.val < cur.val && q.val < cur.val) cur = cur.left;
    //         else return cur;
    //     }

    //     return null;
    // }

    //-----------------------------------------------------------------------------------------------

    // Using Stack
    // class BSTIterator {
    
    //     private Stack<TreeNode> stack = null;
    //     public BSTIterator(TreeNode root) {
    //         this.stack = new Stack<>();
    //         addAllLeft(root);
    //     }
        
    //     public int next() {
    //         TreeNode rNode = this.stack.pop();
    //         addAllLeft(rNode.right);
            
    //         return rNode.val;
    //     }
        
    //     public boolean hasNext() {
    //         return !this.stack.isEmpty();
    //     }
        
    //     public void addAllLeft(TreeNode root) {        
    //         while (root != null) {
    //             this.stack.push(root);
    //             root = root.left;
    //         }
    //     }
    // }

    // Using LinkedList to achieve stack behaviour
    // class BSTIterator {
    
    //     private LinkedList<TreeNode> stack = null;
    //     public BSTIterator(TreeNode root) {
    //         this.stack = new LinkedList<>();
    //         addAllLeft(root);
    //     }
        
    //     public int next() {
    //         TreeNode rNode = this.stack.removeFirst();
    //         addAllLeft(rNode.right);
            
    //         return rNode.val;
    //     }
        
    //     public boolean hasNext() {
    //         return !this.stack.isEmpty();
    //     }
        
    //     public void addAllLeft(TreeNode root) {        
    //         while (root != null) {
    //             this.stack.addFirst(root);
    //             root = root.left;
    //         }
    //     }
    // }

    // Using ArrayDeque to achieve stack behaviour (Preferred, since LinkedList is class based so runs slightly slow when compared)
    // class BSTIterator {
    
    //     private ArrayDeque<TreeNode> stack = null;
    //     public BSTIterator(TreeNode root) {
    //         this.stack = new ArrayDeque<>();
    //         addAllLeft(root);
    //     }
        
    //     public int next() {
    //         TreeNode rNode = this.stack.removeFirst();
    //         addAllLeft(rNode.right);
            
    //         return rNode.val;
    //     }
        
    //     public boolean hasNext() {
    //         return !this.stack.isEmpty();
    //     }
        
    //     public void addAllLeft(TreeNode root) {        
    //         while (root != null) {
    //             this.stack.addFirst(root);
    //             root = root.left;
    //         }
    //     }
    // }

    //-----------------------------------------------------------------------------------------------

}
