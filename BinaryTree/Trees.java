package BinaryTree;

import java.util.*;

public class Trees {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int size(TreeNode root) {
        return root == null ? 0 : size(root.left) + size(root.right) + 1;
    }

    public static int height(TreeNode root) {
        return root == null ? -1 : Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int Maximum(TreeNode root) {
        return root == null ? -(int) 1e9 : Math.max(Math.max(Maximum(root.left), Maximum(root.right)), root.val);
    }

    public static boolean find(TreeNode root, int data) {
        if (root == null)
            return false;
        if (root.val == data)
            return true;

        return find(root.left, data) || find(root.right, data);
    }

    public static ArrayList<TreeNode> nodeToRootPath(TreeNode root, int data) {
        ArrayList<TreeNode> list = new ArrayList<>();
        if (root == null)
            return list;

        if (root.val == data) {
            list.add(root);
            return list;
        }

        ArrayList<TreeNode> left = nodeToRootPath(root.left, data);
        if (left.size() > 0) {
            left.add(root);
            return left;
        }
        ArrayList<TreeNode> right = nodeToRootPath(root.right, data);
        if (right.size() > 0) {
            right.add(root);
            return right;
        }

        return list;
    }

    public static boolean nodeToRootPath(TreeNode root, int data, ArrayList<TreeNode> ans) {
        if (root == null)
            return false;

        if (root.val == data) {
            ans.add(root);
            return true;
        }

        boolean lans = nodeToRootPath(root.left, data, ans);
        if (lans) {
            ans.add(root);
            return true;
        }
        boolean rans = nodeToRootPath(root.right, data, ans);
        if (rans) {
            ans.add(root);
            return true;
        }

        return false;
    }

    // Bottom to top solution (Follow top to better solution)
    public static ArrayList<ArrayList<Integer>> nodeToAllLeafPath(TreeNode root) {
        // write your code here
        
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    
            if (root == null) return list;
            if (root.left == null && root.right == null) {
                ArrayList<Integer> subList = new ArrayList<>();
                subList.add(root.val);
                list.add(subList);
                return list;
                
            }
        
    
            ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
            
            ArrayList<ArrayList<Integer>> left = nodeToAllLeafPath(root.left);
            if (left.size() > 0) {
                for (ArrayList<Integer> subList : left) {
                    list.add(subList);
                }
            }
            
            ArrayList<ArrayList<Integer>> right  = nodeToAllLeafPath(root.right);
            if (right.size() > 0) {
                for (ArrayList<Integer> subList : right) {
                    list.add(subList);
                }
            }
            
            
            for (ArrayList<Integer> subList : list) {
                subList.add(0, root.val);
            }
    
            return list;
      }
    

    // Top to Bottom solution
    // public static ArrayList<ArrayList<Integer>> nodeToAllLeafPath(TreeNode root) {
    //     // write your code here

    //     ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    //     ArrayList<Integer> subAns = new ArrayList<>();
    //     rootToAllLeafPath(root, subAns, ans);

    //     return ans;
    // }

    public static void rootToAllLeafPath(TreeNode root, ArrayList<Integer> subAns, ArrayList<ArrayList<Integer>> ans) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            ArrayList<Integer> base = new ArrayList<>(subAns);
            base.add(root.val);
            ans.add(base);
            return;
        }

        subAns.add(root.val);

        rootToAllLeafPath(root.left, subAns, ans);
        rootToAllLeafPath(root.right, subAns, ans);

        subAns.remove(subAns.size() - 1);
    }

    public static ArrayList<Integer> exactlyOneChild(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        findSingleChildParent(root, ans);
        return ans;
    }

    public static void findSingleChildParent(TreeNode root, ArrayList<Integer> ans) {
        if ((root == null) || (root.left == null && root.right == null))
            return;

        if (root.left == null || root.right != null) {
            ans.add(root.val);
        }

        findSingleChildParent(root.left, ans);
        findSingleChildParent(root.right, ans);
    }

    public static int countExactlyOneChild(TreeNode root) {
        if ((root == null) || (root.left == null && root.right == null)) {
            return 0;
        }

        int left = countExactlyOneChild(root.left);
        int right = countExactlyOneChild(root.right);

        int ans = left + right;
        if (root.left == null || root.right == null) {
            ans++;
        }

        return ans;
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<TreeNode> path = new ArrayList<>();
        rootToNodePath(root, target, path);
        
        List<Integer> ans = new ArrayList<>();
        for (int i = 0;i < path.size();i++) {
            if (k-i < 0) break;
            printKLevelsDown(path.get(i), k-i, (i == 0) ? null : path.get(i-1), ans);
        }
        
        return ans;
    }
    
    public void printKLevelsDown(TreeNode root, int k, TreeNode blocker, List<Integer> ans) {
        if (root == null || root == blocker) return;
        
        if (k == 0) ans.add(root.val);
        printKLevelsDown(root.left, k-1, blocker, ans);
        printKLevelsDown(root.right, k-1, blocker, ans);
    }
    
    public boolean rootToNodePath(TreeNode root, TreeNode target, List<TreeNode> path) {
        if (root == null) return false;
        
        if (root == target) {
            path.add(root);
            return true;
        }
        
        boolean lres = rootToNodePath(root.left, target, path);
        if (lres) {
            path.add(root);
            return true;
        }
        boolean rres = rootToNodePath(root.right, target, path);
        if (rres) {
            path.add(root);
            return true;
        }
        
        return false;
    }

}