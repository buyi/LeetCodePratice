
public class Solution21_MergeTwoSortedLists {
	   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		   ListNode head = null;
		   ListNode target = null;
		   boolean ifFrist = true;
		   
		   while (l1 != null && l2 != null) {
			   if (l1.val <= l2.val) {
				   if (ifFrist) {
					   head = l1;
					   target = head;
					   ifFrist = false;
				   } else {
					   target.next = l1;
					   l1 = l1.next;
					   target = target.next;
				   }
			
			   } else if (l1.val > l2.val) {
				   if (ifFrist) {
					   head = l2;
					   target = head;
					   ifFrist = false;
				   } else {
					   target.next = l2;
					   l2 = l2.next;
					   target = target.next;
				   }
				  
			   }
//			   target = target.next;
		   }
		   
		   if (l1 == null) {
			   while (l2 != null) {
				   if (ifFrist) {
					   head = l2;
					   target = head;
					   ifFrist = false;
				   } else {
					   target.next = l2;
					   target = target.next;
				   }
				   l2 = l2.next;
			   }
				  
		   } else if (l2 == null) {
			   while (l1 != null) {
				   if (ifFrist) { 
					   head = l1;
					   target = head;
					   ifFrist = false;
				   } else {
					   target.next = l1;
					   target = target.next;
				   }
				  
				   l1 = l1.next;
				  
			   }
		   }
		   
		   
		   return head;
	    }
}

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
