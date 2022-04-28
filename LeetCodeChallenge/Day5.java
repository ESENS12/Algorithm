/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return new ListNode();
        }
        ListNode result = head;
        ListNode temp  = head.next;
        if(temp == null){
            return head;
        }
        int nMaxCnt = 0;
        while(temp.next != null){
            temp = temp.next;
            nMaxCnt++;
        }
        
        for(int i=0; i<=nMaxCnt/2; i++){
            result = result.next;
        }
        
        
        return result;
    }
}


// Using recursive function
class Solution {
    
    int idx=0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return new ListNode();
        
        ListNode dummyNode = new ListNode(-1, head);
        remove(dummyNode, n);
        return dummyNode.next;
    }
    
    public void remove(ListNode node, int n) {
        if(node==null)
            return;
        
        remove(node.next, n);
        
        if(idx==n) {
            ListNode temp = node.next.next;
            node.next=temp;
        }
        
        idx++;
        return;
    }
    public void println(String str){
        System.out.println(str);
    }
}


