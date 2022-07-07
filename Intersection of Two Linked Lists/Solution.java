/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      if(headA == headB) return headA;
      LinkedList<ListNode> list1 = new LinkedList<>();
      LinkedList<ListNode> list2 = new LinkedList<>();
      ListNode cur1 = headA;
      ListNode cur2 = headB;
      ListNode result = null;
      while(cur1 != null){
        list1.add(cur1);
        cur1 = cur1.next;
      }
      while(cur2 != null){
        list2.add(cur2);
        cur2 = cur2.next;
      }
      while(true){
        cur1 = list1.pollLast();
        cur2 = list2.pollLast();
        if(cur1 == cur2) result = cur1;
        else break;
      }
      return result;
    }
}