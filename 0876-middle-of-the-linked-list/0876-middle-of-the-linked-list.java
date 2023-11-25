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
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    //     ListNode current = head;
    //     ListNode temp = head;
    //     int counter = 1;
    //     while(current.next!=null){
    //         counter++;
    //         current = current.next;
    //     }
    //     if(counter == 2 && current.next==null){
    //         return current;
    //     }
    //     counter = counter/2;
    //     current = head;
    //     while(current.next!=null){
    //         if(counter == 0){
    //             temp = current;
    //         }
    //         current = current.next;
    //         counter--;
    //     }
    //     return temp;
    // }
}
}