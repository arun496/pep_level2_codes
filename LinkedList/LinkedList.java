package LinkedList;

import java.util.List;
import java.util.Random;

public class LinkedList {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    // public static ListNode midNode(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode slow = head;
    //     ListNode fast = head;
        
    //     while(fast.next != null && fast.next.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
        
    //     return slow;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode reverse(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode prev = null;
    //     ListNode cur = head;
        
    //     while (cur != null) {
    //         ListNode frwd = cur.next;
            
    //         cur.next = prev;
    //         prev = cur;
    //         cur = frwd;
    //     }
        
    //     return prev;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode midNode(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode slow = head;
    //     ListNode fast = head;
        
    //     while(fast.next != null && fast.next.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
        
    //     return slow;
    // }

    // public static ListNode reverse(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode prev = null;
    //     ListNode cur = head;
        
    //     while (cur != null) {
    //         ListNode frwd = cur.next;
            
    //         cur.next = prev;
    //         prev = cur;
    //         cur = frwd;
    //     }
        
    //     return prev;
    // }

    // public static boolean isPalindrome(ListNode head) {
    //     if (head == null || head.next == null) return true;
        
    //     ListNode mid = midNode(head);
    //     ListNode nHead = mid.next;
    //     mid.next = null;
        
    //     ListNode l1 = head;
    //     ListNode l2 = reverse(nHead);
        
    //     ListNode c1 = l1, c2 = l2;
    //     boolean res = true;

    //     while (c2 != null) {
    //         if (c1.val != c2.val) {
    //             res = false;
    //             break;
    //         }
    //         c1 = c1.next;
    //         c2 = c2.next;
    //     }
        
    //     l2 = reverse(l2);
    //     mid.next = l2;
        
    //     return res;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode midNode(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode slow = head;
    //     ListNode fast = head;
        
    //     while(fast.next != null && fast.next.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
        
    //     return slow;
    // }

    // public static ListNode reverse(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode prev = null;
    //     ListNode cur = head;
        
    //     while (cur != null) {
    //         ListNode frwd = cur.next;
            
    //         cur.next = prev;
    //         prev = cur;
    //         cur = frwd;
    //     }
        
    //     return prev;
    // }

    // public static void fold(ListNode head) {
    //     if (head == null || head.next == null) return;
        
    //     ListNode mid = midNode(head);
    //     ListNode nHead = mid.next;
    //     mid.next = null;
    //     nHead = reverse(nHead);
        
    //     ListNode c1 = head, c2 = nHead;
        
    //     while (c2 != null) {
            
    //         ListNode f1 = c1.next;
    //         ListNode f2 = c2.next;
            
    //         c1.next = c2;
    //         c2.next = f1;
            
    //         c1 = f1;
    //         c2 = f2;
    //     }
    // }

    // Approach with 2 extra pointers
    // public static void unfold(ListNode head) {
    //     if (head == null || head.next == null) return;
        
    //     ListNode l1 = new ListNode(-1);
    //     ListNode l2 = new ListNode(-1);
    //     ListNode p1 = l1, p2 = l2, c1 = head, c2 = head.next;
        
    //     while (c1 != null && c2 != null) {
    //         p1.next = c1;
    //         p2.next = c2;
            
    //         p1 = p1.next;
    //         p2 = p2.next;
            
    //         if (c2 != null) c1 = c2.next;   // For odd cases
    //         if (c1 != null) c2 = c1.next;   // For even cases
    //     }
        
    //     p1.next = null;
    //     l2.next = reverse(l2.next);
    //     p1.next = l2.next;
    // }

    // Approach with only 1 extra pointer
    // public static void unfold(ListNode head) {
    //     if (head == null || head.next == null) return;
        
    //     ListNode l1 = new ListNode(-1);
    //     ListNode l2 = new ListNode(-1);
    //     ListNode p1 = l1, p2 = l2;
        
    //     p1.next = head;
    //     p2.next = head.next;
        
    //     p1 = p1.next;
    //     p2 = p2.next;
        
    //     while (p2 != null && p2.next != null) {
    //        ListNode f = p2.next;
           
    //        p1.next = f;
    //        p2.next = f.next;
           
    //        p1 = p1.next;
    //        p2 = p2.next;
    //     }
        
    //     p1.next = null;
    //     l2.next = reverse(l2.next);
    //     p1.next = l2.next;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     if (l1 == null || l2 == null) {
    //         return l1 != null ? l1 : l2;
    //     }
        
    //     ListNode l = new ListNode(-1);   // Dummy node
    //     ListNode p = l;
    //     ListNode c1 = l1;
    //     ListNode c2 = l2;
        
    //     while (c1 != null && c2 != null) {
    //         if (c1.val < c2.val) {
    //             p.next = c1;
    //             c1 = c1.next;
    //         }
    //         else {
    //             p.next = c2;
    //             c2 = c2.next;
    //         }
            
    //         p = p.next;
    //     }
        
    //     // If one full list completely traversed till end and hits null 
    //     if (c1 == null) p.next = c2;        
    //     else if (c2 == null) p.next = c1;
        
    //     return l.next;
    // }

    //-----------------------------------------------------------------------------------------------
 
    // public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     if (l1 == null || l2 == null) {
    //         return l1 != null ? l1 : l2;
    //     }
        
    //     ListNode l = new ListNode(-1);   // Dummy node
    //     ListNode p = l;
    //     ListNode c1 = l1;
    //     ListNode c2 = l2;
        
    //     while (c1 != null && c2 != null) {
    //         if (c1.val < c2.val) {
    //             p.next = c1;
    //             c1 = c1.next;
    //         }
    //         else {
    //             p.next = c2;
    //             c2 = c2.next;
    //         }
            
    //         p = p.next;
    //     }
        
    //     // If one full list completely traversed till end and hits null 
    //     if (c1 == null) p.next = c2;        
    //     else if (c2 == null) p.next = c1;
        
    //     return l.next;
    // }

    // Brute solution -> TC : (Nk) || (lambda * k^2)  [lambda -> avg. len of lists after distribution]
    // public static ListNode mergeKLists(ListNode[] lists) {
    //     if (lists == null || lists.length == 0) return null;
        
    //     ListNode res = null;
        
    //     for (int i = 0;i < lists.length;i++) {
    //         res = mergeTwoLists(res, lists[i]);
    //     }
        
    //     return res;
    // }

    // public static ListNode mergeKListsOptimized(ListNode[] lists, int si, int ei) {
    //     if (si == ei) return lists[si];
        
    //     int mid = (si + ei) / 2;
    //     ListNode leftMerged = mergeKListsOptimized(lists, si, mid);
    //     ListNode rightMerged = mergeKListsOptimized(lists, mid+1, ei);
    //     ListNode finalMerged = mergeTwoLists(leftMerged, rightMerged);
        
    //     return finalMerged;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode midNode(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode slow = head;
    //     ListNode fast = head;
        
    //     while(fast.next != null && fast.next.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
        
    //     return slow;
    // }

    // public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     if (l1 == null || l2 == null) {
    //         return l1 != null ? l1 : l2;
    //     }
        
    //     ListNode l = new ListNode(-1);   // Dummy node
    //     ListNode p = l;
    //     ListNode c1 = l1;
    //     ListNode c2 = l2;
        
    //     while (c1 != null && c2 != null) {
    //         if (c1.val < c2.val) {
    //             p.next = c1;
    //             c1 = c1.next;
    //         }
    //         else {
    //             p.next = c2;
    //             c2 = c2.next;
    //         }
            
    //         p = p.next;
    //     }

    // public static ListNode mergeSort(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode mid = midNode(head);
    //     ListNode rightHead = mid.next;
    //     mid.next = null;
    //     ListNode leftHead = head;
        
    //     ListNode leftList = mergeSort(leftHead);
    //     ListNode rightList = mergeSort(rightHead);
    //     ListNode fullMerged = mergeTwoLists(leftList, rightList);
        
    //     return fullMerged;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode removeNthFromEnd(ListNode head, int n) {
    //     if (head == null || n <= 0) return head;
        
    //     ListNode slow = head;
    //     ListNode fast = head;
        
    //     while (n-- > 0) {                 // To maintain gap of n for removal
    //         fast = fast.next;
            
    //         if (fast == null && n > 0) {  // Invalid 'n' values
    //             return head;
    //         }
    //     }
        
    //     if (fast == null) {               // Case when n = 1, first node removal
    //         ListNode rNode = slow;
    //         head = rNode.next;
    //         rNode.next = null;
    //         return head;
    //     }
        
    //     while (fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next;
    //     }
        
    //     ListNode rNode = slow.next;
    //     slow.next = rNode.next;
    //     rNode.next = null;                // Complete removal
    
    //     return head;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode segregateEvenOdd(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode evenL = new ListNode(-1);
    //     ListNode oddL = new ListNode(-1);
    //     ListNode ep = evenL, op = oddL, curr = head;
        
    //     while (curr != null) {
    //         if (curr.val%2 == 0) {
    //             ep.next = curr;
    //             ep = ep.next;
    //         }
    //         else {
    //             op.next = curr;
    //             op = op.next;
    //         }
            
    //         curr = curr.next;
    //     }
        
    //     ep.next = oddL.next;
    //     op.next = null;             // Point to null since it might point to some other node and form a circle
    //     head = evenL.next;

    //     evenL.next = oddL.next = null;   // Good Practice

    //     return head;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode segregate01(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode zeroL = new ListNode(-1);
    //     ListNode oneL = new ListNode(-1);
    //     ListNode zp = zeroL, op = oneL, curr = head;
        
    //     while (curr != null) {
    //         if (curr.val == 0) {
    //             zp.next = curr;
    //             zp = zp.next;
    //         }
    //         else {
    //             op.next = curr;
    //             op = op.next;
    //         }
            
    //         curr = curr.next;
    //     }
        
    //     zp.next = oneL.next;
    //     op.next = null;             // Point to null since it might point to some other node and form a circle
    //     head = zeroL.next;

    //     zeroL.next = oneL.next = null;   // Good Practice
        
    //     return head;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode segregate012(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode zeroL = new ListNode(-1);
    //     ListNode oneL = new ListNode(-1);
    //     ListNode twoL = new ListNode(-1);
    //     ListNode zp = zeroL, op = oneL, tp = twoL, curr = head;
        
    //     while (curr != null) {
    //         if (curr.val == 0) {
    //             zp.next = curr;
    //             zp = zp.next;
    //         }
    //         else if (curr.val == 1) {
    //             op.next = curr;
    //             op = op.next;
    //         }
    //         else {
    //             tp.next = curr;
    //             tp = tp.next;
    //         }
            
    //         curr = curr.next;
    //     }
        
    //     op.next = twoL.next;
    //     zp.next = oneL.next;
    //     tp.next = null;             // Point to null since it might point to some other node and form a circle
    //     head = zeroL.next;

    //     zeroL.next = oneL.next = twoL = null;   // Good Practice
        
    //     return head;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode segregateOnLastIndex(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode less = new ListNode(-1);
    //     ListNode great = new ListNode(-1);
    //     ListNode lp = less, gp = great; 
    //     ListNode lastPivot = head;
    //     ListNode curr = head;
        
    //     while (lastPivot.next != null) {
    //         lastPivot = lastPivot.next;
    //     }
        
    //     while (curr != null) {
    //         if (curr.val <= lastPivot.val) {
    //             lp.next = curr;
    //             lp = lp.next;
    //         }
    //         else {
    //             gp.next = curr;
    //             gp = gp.next;
    //         }
    //         curr = curr.next;
    //     }
        
    //     lp.next = great.next;
    //     gp.next = null;             // This is to deduct cycle because of pointers
        
    //     return lastPivot;           // Can also return lp (Bith points to same)
    // }

    //-----------------------------------------------------------------------------------------------

    //     public static ListNode segregate(ListNode head, int pivotIdx) {
    //         if (head == null || head.next == null) return head;
            
    //         ListNode less = new ListNode(-1);
    //         ListNode great = new ListNode(-1);
    //         ListNode lp = less, gp = great; 
    //         ListNode pivot = head;
    //         ListNode curr = head;
            
    //         while (pivotIdx-- > 0) {
    //             pivot = pivot.next;
    //         }
            
    //         while (curr != null) {
    //             if (curr == pivot) {    // Since we need to segregate on basis of pivot node (Pivot in it's correct position)
    //                  // Do-nothing
    //             }
    //             else if (curr.val <= pivot.val) {
    //                 lp.next = curr;
    //                 lp = lp.next;
    //             }
    //             else if (curr.val > pivot.val) {
    //                 gp.next = curr;
    //                 gp = gp.next;
    //             }
    //             curr = curr.next;
    //         }
            
    //         lp.next = pivot;
    //         lp = lp.next;
            
    //         lp.next = great.next;
    //         head = less.next;            // Corner case to change head [When all elements are greater then pivot, eg: 5->6->4->7, pivot=4]
    //         gp.next = null;             // This is to deduct cycle because of pointers
            
    //         less.next = great.next = null;  // Good Practice
            
    //         return head;           // Can also return lp (Bith points to same)
    //   }

    //-----------------------------------------------------------------------------------------------

    // public static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
    // public static int partition(int[] arr, int pivotIdx, int si, int ei) {
    //     swap(arr, pivotIdx, ei);

    //     int i = si, j = si, pivot = arr[ei];
    //     while (i <= ei) {
    //         if (arr[i] <= pivot) {
    //             swap(arr, i, j);
    //             i++;
    //             j++;
    //         }
    //         else i++;
    //     }

    //     return j-1;
    // }

    // static Random rand = new Random(); 
    // public static void quickSort(int[] arr, int si, int ei) {
    //     if (si > ei) return;
        
    //     int lastIdx = ei;
    //     // int midIdx = (si+ei)/2; // si + (ei - si)/2;
    //     // int randomIdx = rand.nextInt(ei-si+1) + si;
    //     int pivotIdx = partition(arr, lastIdx, si, ei);

    //     // Slight Optimization. This would not affect interms of Big-O
    //     boolean flag = true;       // arr is sorted
    //     for (int i = si+1;i <= ei;i++) if (arr[i-1] > arr[i]) {
    //         flag = false;            // arr is not sorted
    //         break;
    //     }

    //     if (flag) return;

    //     quickSort(arr, si, pivotIdx-1);
    //     quickSort(arr, pivotIdx+1, ei);
    // }

    //-----------------------------------------------------------------------------------------------

    // public static int length(ListNode head) {
    //     ListNode cur = head;
    //     int len = 0;
    //     while (cur != null) {
    //         len++;
    //         cur = cur.next;
    //     }
    //     return len;
    // }

    // public static ListNode[] segregate(ListNode head, int pivotIdx) {

    //     ListNode pivot = head;
    //     while (pivotIdx-- > 0) pivot = pivot.next;

    //     ListNode small = new ListNode(-1);
    //     ListNode large = new ListNode(-1);
    //     ListNode sp = small, lp = large, cur = head;

    //     while (cur != null) {
    //         if (cur == pivot) {
    //             // Do nothing
    //         }
    //         else if (cur.val <= pivot.val) {
    //             sp.next = cur;
    //             sp = sp.next;
    //         }
    //         else {
    //             lp.next = cur;
    //             lp = lp.next;
    //         }
    //         cur = cur.next;
    //     }

    //     // Here we need to break the list after segregation & return left & right lists
    //     sp.next = lp.next = pivot.next = null;
    //     ListNode lHead = small.next, rHead = large.next;
    //     return new ListNode[]{lHead, pivot, rHead};
    // }

    // public static ListNode[] mergeLists(ListNode[] lList, ListNode pivot, ListNode[] rList) {
    //     ListNode head = null;
    //     ListNode tail = null;
    //     if (lList[0] != null && rList[0] != null) {
    //         lList[1].next = pivot;
    //         pivot.next = rList[0];
    //         head = lList[0];
    //         tail = rList[1];
    //     }
    //     else if (lList[0] != null) {
    //         lList[1].next = pivot;
    //         head = lList[0];
    //         tail = pivot;
    //     }
    //     else if (rList[0] != null) {
    //         pivot.next = rList[0];
    //         head = pivot;
    //         tail = rList[1];
    //     }
    //     else {
    //         head = tail = pivot;
    //     }

    //     return new ListNode[]{head, tail};
    // }

    // static Random rand = new Random();
    // public static ListNode[] quickSortUtility(ListNode head) {
    //     if (head == null || head.next == null) return new ListNode[]{head, head};

    //     // Get Pivot Idx for segregation & broken lists points
    //     int len = length(head);
    //     // int midPivotIdx = (len/2);
    //     int randomPivotIdx = rand.nextInt(len);

    //     ListNode[] segregatedElements = segregate(head, randomPivotIdx);

    //     // Sort further broken lists
    //     ListNode[] leftSorted = quickSortUtility(segregatedElements[0]);
    //     ListNode[] rightSorted = quickSortUtility(segregatedElements[2]);

    //     // Merge both broken left & right lists
    //     return mergeLists(leftSorted, segregatedElements[1], rightSorted);
    // }

    // public static ListNode quickSort(ListNode head) {
    //     return quickSortUtility(head)[0];
    // }

    //-----------------------------------------------------------------------------------------------
    
    // public static ListNode reverse(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode cur = head;
    //     ListNode prev = null;
        
    //     while (cur != null) {
    //         ListNode frwd = cur.next;
            
    //         cur.next = prev;
            
    //         prev = cur;
    //         cur = frwd;
    //     }
        
    //     return prev;
    // }

    // public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    //     l1 = reverse(l1);
    //     l2 = reverse(l2);
        
    //     ListNode dummy = new ListNode(-1);
    //     ListNode c1 = l1, c2 = l2, prev = dummy;
    //     int carry = 0;
        
    //     while (c1 != null || c2 != null || carry != 0) {
    //         int d1 = c1 != null ? c1.val : 0;
    //         int d2 = c2 != null ? c2.val : 0;
    //         int sum = d1 + d2 + carry;
            
    //         carry = sum/10;
    //         sum = sum%10;
            
    //         prev.next = new ListNode(sum);
    //         prev = prev.next;
            
    //         if (c1 != null) c1 = c1.next;
    //         if (c2 != null) c2 = c2.next;
    //     }
        
    //     ListNode head = reverse(dummy.next);
    //     dummy.next = null;
    //     return head;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode reverse(ListNode head) {
    //     if (head == null || head.next == null) return head;
        
    //     ListNode cur = head;
    //     ListNode prev = null;
        
    //     while (cur != null) {
    //         ListNode frwd = cur.next;
            
    //         cur.next = prev;
            
    //         prev = cur;
    //         cur = frwd;
    //     }
        
    //     return prev;
    // }

    // public static ListNode subtractTwoNumbers(ListNode l1, ListNode l2) {
        
    //     l1 = reverse(l1);
    //     l2 = reverse(l2);
        
    //     ListNode dummy = new ListNode(-1);
    //     ListNode c1 = l1, c2 = l2, prev = dummy;
    //     int borrow = 0;
        
    //     while (c1 != null || c2 != null) {
    //         int d1 = (c1 != null ? c1.val : 0) + borrow;
    //         int d2 = c2 != null ? c2.val : 0;
            
    //         if (d1 < d2) {
    //             borrow = -1;
    //             d1 += 10;
    //         }
    //         else borrow = 0;
            
    //         int diff = (d1 - d2)%10;
            
    //         prev.next = new ListNode(diff);
    //         prev = prev.next;
            
    //         if (c1 != null) c1 = c1.next;
    //         if (c2 != null) c2 = c2.next;
    //     }
        
    //     ListNode head = reverse(dummy.next);
    //     dummy.next = null;
    //     return head;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static boolean isCyclePresentInLL(ListNode head) {
    //     if (head == null || head.next == null) return false;
        
    //     ListNode slow = head;
    //     ListNode fast = head;
        
    //     // Why movement in 2:1 ratio, to handle less base cases and most optimal interms of time (no. of cycle rotations by each) 
    //     while (fast.next != null && fast.next.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
            
    //         if (fast == slow) return true;
    //     }
        
    //     return false;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode CycleNode(ListNode head) {
    //     if (head == null || head.next == null) return null;
        
    //     ListNode slow = head;
    //     ListNode fast = head;
        
    //     // Modified while condition than previous used common condition to handle very corner cases on leetcode
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
            
    //         if (slow == fast) break;
    //     }
        
    //     // This means that there is no cycle, just long straight linked list
    //     if (slow != fast) return null;
        
    //     // Reset slow to head and fast be in meeting point itself to find starting node
    //     slow = head;
    //     while (slow != fast) {
    //         slow = slow.next;
    //         fast = fast.next;
    //     }
        
    //     return slow;
    // }


    // This is just to calculate the other parameters of cyclic linked list
    // public static ListNode CycleNode(ListNode head) {
    //     if (head == null || head.next == null) return null;
        
    //     ListNode slow = head;
    //     ListNode fast = head;
        
    //     // Modified while condition than previous used common condition to handle very corner cases on leetcode
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
            
    //         if (slow == fast) break;
    //     }
        
    //     // This means that there is no cycle, just long straight linked list
    //     if (slow != fast) return null;

    //     ListNode meetingNode = fast;
    //     int a = 1, n = 0, nDash = 0, b = 0, c = 0, bc = 0, count = 0;
    //     // bc -> b + c, nDash -> n'
        
    //     // Reset slow to head and fast be in meeting point itself to find starting node
    //     slow = head;
    //     boolean inLoop = false;
    //     while (slow != fast) {
    //         slow = slow.next;
    //         fast = fast.next;
    //         inLoop = true;

    //         if (nDash == 0 && fast == meetingNode) bc = count;
    //         if (fast == meetingNode) nDash++;

    //         a++;
    //         count++;    // This is to count number of cycles after meeting point
    //     }

    //     if (!inLoop) {          
    //         // No tail case
    //         fast = fast.next;
    //         bc = 1;
    //         while (slow != fast) {
    //             fast = fast.next;
    //             bc++;
    //         }
    //         n = 1;
    //         nDash = 0;              
    //         a = 0;
    //         c = 0;
    //         b = bc;
    //     }
    //     else {
    //         // Tail case    
    //         n = nDash+1;
    //         c = a - bc*(n-1);
    //         b = bc - c;
    //     }

    //     return slow;
    // }

    //-----------------------------------------------------------------------------------------------

    // public static ListNode CycleNode(ListNode head) {
    //     if (head == null || head.next == null) return null;
        
    //     ListNode slow = head;
    //     ListNode fast = head;
        
    //     // Modified while condition than previous used common condition to handle very corner cases on leetcode
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
            
    //         if (slow == fast) break;
    //     }
        
    //     // This means that there is no cycle, just long straight linked list
    //     if (slow != fast) return null;
        
    //     // Reset slow to head and fast be in meeting point itself to find starting node
    //     slow = head;
    //     while (slow != fast) {
    //         slow = slow.next;
    //         fast = fast.next;
    //     }
        
    //     return slow;
    // }

    // public static ListNode IntersectionNodeInTwoLL(ListNode headA, ListNode headB) {
    //     if (headA == null || headB == null) return null;
        
    //     ListNode tail = headA;
    //     while (tail.next != null) tail = tail.next;
    //     // Link with list2; find intersectNode; Unlink from list2; 
    //     tail.next = headB;
    //     ListNode intersectNode = CycleNode(headA);
    //     tail.next = null;
        
    //     return intersectNode;
    // }
}