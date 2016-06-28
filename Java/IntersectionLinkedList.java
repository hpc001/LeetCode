public class IntersectionLinkedList{
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int distance = getListLength(headA) - getListLength(headB);
            if(distance < 0){
                for(int i = 0; i< Math.abs(distance); i++){
                    headB = headB.next;
                }
            }
            else{
                for(int i = 0; i< Math.abs(distance); i++){
                    headA = headA.next;
                }
            }
            
            while(headA != null){
                if(headA == headB) return headA;
                headA = headA.next;
                headB = headB.next;
            }
            
            return null;
        }
        
        public int getListLength(ListNode node){
            int count = 0;
            while(node != null){
                count++;
                node = node.next;
            }
            return count;
        }
    }
}