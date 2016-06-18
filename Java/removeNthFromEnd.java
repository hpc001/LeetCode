/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class removeNthFromEnd {
    public class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            List<ListNode> nodeList = new LinkedList<ListNode>();
            ListNode temp = head;
            while(temp!= null){
                nodeList.add(temp);
                temp = temp.next;
            }
            
            int size = nodeList.size();
            if(n==1){
                if(size<=1) return null;
                else nodeList.get(size-n-1).next = null;
            }
            else if(n==size) head = nodeList.get(1);
            else nodeList.get(size-n-1).next = nodeList.get(size-n+1);
            return head;
        }
    }
}