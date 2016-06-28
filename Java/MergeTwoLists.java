public class MergeTwoLists{
    public class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null && l2 != null) return l2;
            else if(l1 != null && l2 == null) return l1;

            ListNode first = new ListNode(0);
            ListNode head = first;
            while(l1 != null && l2!=null){
                if(l1.val < l2.val){
                    first.next = l1;
                    first = first.next;
                    l1 = l1.next;
                }
                else{
                    first.next = l2;
                    first = first.next;
                    l2 = l2.next;
                }
            }
            
            if(l1 == null && l2 !=null) first.next = l2;
            if(l2 == null && l1 !=null) first.next = l1;
            
            return head.next;
            
        }
    }
}