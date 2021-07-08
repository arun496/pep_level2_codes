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
    //     return root == null ? -(int) 1e9 : Math.max(Math.max(Maximum(root.left), Maximum(root.right)), root.val);
    // }

    //-----------------------------------------------------------------------------------------------

    // public static boolean find(TreeNode root, int data) {
    //     if (root == null)
    //         return false;
    //     if (root.val == data)
    //         return true;

    //     return find(root.left, data) || find(root.right, data);
    // }

    //-----------------------------------------------------------------------------------------------

    // 1. ArrayList in return type
    // public static ArrayList<TreeNode> nodeToRootPath(TreeNode root, int data) {
    //     ArrayList<TreeNode> list = new ArrayList<>();
    //     if (root == null) return list;
        
    //     if (data == root.val) {
    //         list.add(root);
    //         return list;
    //     }
        
    //     ArrayList<TreeNode> Llist =  nodeToRootPath(root.left, data);
    //     if (Llist.size() > 0) {
    //         Llist.add(root);
    //         return Llist;
    //     }
        
    //     ArrayList<TreeNode> Rlist =  nodeToRootPath(root.right, data);
    //     if (Rlist.size() > 0) {
    //         Rlist.add(root);
    //         return Rlist;
    //     }
        
    //     return list;
    // }

    // 2. ArrayList in argument
    // Boolean as return type
    // public static boolean nodeToRootPath(TreeNode root, int data, ArrayList<TreeNode> list) {
    //     if (root == null) return false;
        
    //     if (data == root.val) {
    //         list.add(root);
    //         return true;
    //     }    
        
    //     boolean res = nodeToRootPath(root.left, data, list) || nodeToRootPath(root.right, data, list);
    //     if (res) {
    //         list.add(root);
    //     }
        
    //     return res;
    // }

    // Void as return type
    // public static void nodeToRootPath(TreeNode root, int data, ArrayList<TreeNode> list) {
    //     if (root == null) return;
        
    //     if (data == root.val) {
    //         list.add(root);
    //         return;
    //     }    
        
    //     nodeToRootPath(root.left, data, list);
    //     if (list.size() > 0) {
    //         list.add(root);
    //         return;
    //     }
        
    //     nodeToRootPath(root.right, data, list);
    //     if (list.size() > 0) {
    //         list.add(root);
    //         return;
    //     }
        
    //     return;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static void helper(TreeNode root, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> smallAns) {
    //     if (root == null) return;
    //     if (root.left == null && root.right == null) {
    //         ArrayList<Integer> newAns = new ArrayList<>(smallAns);
    //         newAns.add(root.val);
    //         ans.add(newAns);
    //         return;
    //     }
        
    //     smallAns.add(root.val);
        
    //     helper(root.left, ans, smallAns);
    //     helper(root.right, ans, smallAns);
        
    //     smallAns.remove(smallAns.size()-1);
    // }

    // public static ArrayList<ArrayList<Integer>> nodeToAllLeafPath(TreeNode root) {

    //     ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    //     ArrayList<Integer> smallAns = new ArrayList<>();
        
    //     helper(root, ans, smallAns);
    //     return ans;
    // }

    //-----------------------------------------------------------------------------------------------

    // Try method
    // public static ArrayList<Integer> exactlyOneChild(TreeNode root) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     if (root == null) return list;
        
    //     ArrayList<Integer> Llist = exactlyOneChild(root.left);
    //     ArrayList<Integer> Rlist = exactlyOneChild(root.right);
        
    //     if ((root.left == null && root.right != null) || (root.left != null && root.right == null))
    //         list.add(root.val);
        
    //     list.addAll(Llist);
    //     list.addAll(Rlist);

    //     return list;
    // }

    // Catch method (Use this method) - Also this is void return type
    // public static void singleChildNodes(TreeNode node, ArrayList<Integer> ans) {
    //     if (node == null || (node.left == null && node.right == null))
    //         return;

    //     if (node.left == null || node.right == null) {
    //         ans.add(node.val);
    //     }

    //     singleChildNodes(node.left, ans);
    //     singleChildNodes(node.right, ans);
    // }

    //-----------------------------------------------------------------------------------------------

    // Try method
    // public static int countExactlyOneChild(TreeNode root) {
    //     if (root == null) return 0;
        
    //     int Lans = countExactlyOneChild(root.left);
    //     int Rans = countExactlyOneChild(root.right);
        
    //     int ans = 0;
        
    //     if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) ans++;
        
    //     ans += (Lans + Rans);

    //     return ans;
    // }

    // Catch method (Use this method)
    // public static int countExactlyOneChild(TreeNode root) {
    //     if (root == null || (root.left == null && root.right == null)) return 0;
        
    //     int Lans = countExactlyOneChild(root.left);
    //     int Rans = countExactlyOneChild(root.right);
        
    //     int ans = 0;
    //     ans += (Lans + Rans);
        
    //     if (root.left == null || root.right == null) ans++;

    //     return ans;
    // }

    //-----------------------------------------------------------------------------------------------

    // // 1. node to root path, Blocker approach
    // public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    //     if (root == null) return new ArrayList<Integer>();
        
    //     List<TreeNode> list = new ArrayList<>();
    //     nodeToRootPath(root, list, target);
    //     return getKLevelsDown(root, list, k);
    // }
    
    // public boolean nodeToRootPath(TreeNode root, List<TreeNode> list, TreeNode target) {
    //     if (root == null) return false;
        
    //     if (root == target) {
    //         list.add(root);
    //         return true;
    //     }
        
    //     boolean res = nodeToRootPath(root.left, list, target) || nodeToRootPath(root.right, list, target);
        
    //     if (res) list.add(root);
        
    //     return res;
    // }
    
    // public List<Integer> getKLevelsDown(TreeNode root, List<TreeNode> list, int k) {
    //     List<Integer> ans = new ArrayList<>();
        
    //     for (int i = 0;i < list.size();i++) {
    //         if (k-i < 0) break;     //Just saving call, this part os already handled in function-to-call itself
    //         kLevelsDownUtility(list.get(i), k-i, ans, i==0 ? null : list.get(i-1));
    //     }
        
    //     return ans;
    // }
    
    // public void kLevelsDownUtility(TreeNode root, int k, List<Integer> list, TreeNode blocker) {
    //     if (root == null || root == blocker || k < 0) return;
    //     if (k == 0) {
    //         list.add(root.val);
    //         return;
    //     }
        
    //     kLevelsDownUtility(root.left, k-1, list, blocker);
    //     kLevelsDownUtility(root.right, k-1, list, blocker);
    // }

    // // 2. Pair class approach (Self)
    // class Pair {
    //     boolean found;
    //     TreeNode blocker;
    //     int k;
        
    //     Pair(boolean found, TreeNode blocker, int k) {
    //         this.found = found;
    //         this.blocker = blocker;
    //         this.k = k;
    //     }
    // }
    
    // public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    //     if (root == null) return new ArrayList<Integer>();
        
    //     List<Integer> ans = new ArrayList<>();
    //     getKLevelsDown(root, ans, k, target);
    //     return ans;
    // }
    
    // public Pair getKLevelsDown(TreeNode root, List<Integer> ans, int k, TreeNode target) {
    //     Pair p = new Pair(false, null, -1); 
    //     if (root == null) return p;
        
    //     if (root == target) {
    //         p.found = true;
    //         p.blocker = root;
    //         p.k = k;
    //         kLevelsDownUtility(root, p.k, ans, null);
    //         return p;
    //     }
        
    //     Pair lp = getKLevelsDown(root.left, ans, k, target);
    //     if (lp.found) {
    //         p.found = true;
    //         p.blocker = root;
    //         p.k = lp.k-1;
    //         kLevelsDownUtility(root, p.k, ans, lp.blocker);
    //         return p;
    //     }
    //     Pair rp = getKLevelsDown(root.right, ans, k, target);
    //     if (rp.found) {
    //         p.found = true;
    //         p.blocker = root;
    //         p.k = rp.k-1;
    //         kLevelsDownUtility(root, p.k, ans, rp.blocker);
    //         return p;
    //     }
        
    //     return p;
    // }
    
    // public void kLevelsDownUtility(TreeNode root, int k, List<Integer> ans, TreeNode blocker) {
    //     if (root == null || root == blocker || k < 0) return;
    //     if (k == 0) {
    //         ans.add(root.val);
    //         return;
    //     }
        
    //     kLevelsDownUtility(root.left, k-1, ans, blocker);
    //     kLevelsDownUtility(root.right, k-1, ans, blocker);
    // }

    // // 3. Return type int method Space O(1)
    // public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    //     if (root == null) return new ArrayList<Integer>();
        
    //     List<Integer> ans = new ArrayList<>();
    //     getKLevelsDown(root, ans, k, target);
    //     return ans;
    // }
    
    // public int getKLevelsDown(TreeNode root, List<Integer> ans, int k, TreeNode target) {
    //     if (root == null) return -1;
        
    //     if (root == target) {
    //         kLevelsDownUtility(root, k, ans, null);
    //         return 1;
    //     }
        
    //     int l = getKLevelsDown(root.left, ans, k, target);
    //     if (l != -1) {
    //         kLevelsDownUtility(root, k-l, ans, root.left);
    //         return l+1;
    //     }
        
    //     int r = getKLevelsDown(root.right, ans, k, target);
    //     if (r != -1) {
    //         kLevelsDownUtility(root, k-r, ans, root.right);
    //         return r+1;
    //     }
        
    //     return -1;
    // }
    
    // public void kLevelsDownUtility(TreeNode root, int k, List<Integer> ans, TreeNode blocker) {
    //     if (root == null || root == blocker || k < 0) return;
    //     if (k == 0) {
    //         ans.add(root.val);
    //         return;
    //     }
        
    //     kLevelsDownUtility(root.left, k-1, ans, blocker);
    //     kLevelsDownUtility(root.right, k-1, ans, blocker);
    // }

    //-----------------------------------------------------------------------------------------------


    public static void kLevelsDownUtility(TreeNode root, int time, ArrayList<ArrayList<Integer>> ans, TreeNode blocker) {
        if (root == null || root == blocker) return;

        if (time == ans.size())
            ans.add(new ArrayList<Integer>());
        
        ans.get(time).add(root.val);

        kLevelsDownUtility(root.left, time+1, ans, blocker);
        kLevelsDownUtility(root.right, time+1, ans, blocker);
    }

    // Same node to root path code
    public static int burningTree(TreeNode root, ArrayList<ArrayList<Integer>> ans, int target) {
        if (root == null) return -1;

        if (root.val == target) {
            kLevelsDownUtility(root, 0, ans, null);
            return 1;
        }

        int l = burningTree(root.left, ans, target);
        if (l != -1) {
            kLevelsDownUtility(root, l, ans, root.left);
            return l+1;
        }
        
        int r = burningTree(root.right, ans, target);
        if (r != -1) {
            kLevelsDownUtility(root, r, ans, root.right);
            return r+1;
        }

        return -1;
    } 
}