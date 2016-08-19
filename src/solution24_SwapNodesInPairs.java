
public class solution24_SwapNodesInPairs {
	
	public static void main(String[] args) {
		solution24_SwapNodesInPairs s = new solution24_SwapNodesInPairs();
		ListNode h = new ListNode(1);
		h.next = new ListNode(2);
		s.swapPairs(h);
	}
	
	public ListNode swapPairs(ListNode head) {
	    if(head == null || head.next == null)   
	        return head;
	 
	    ListNode h = new ListNode(0);
	    h.next = head;
	    ListNode p = h;
	 
	    while(p.next != null && p.next.next != null){
	        //use t1 to track first node
	        ListNode t1 = p;
	        p = p.next;
	        t1.next = p.next;
	 
	        //use t2 to track next node of the pair
	        ListNode t2 = p.next.next;
	        p.next.next = p;
	        p.next = t2;
	    }
	 
	    return h.next;
	}
	
	 public ListNode swapPairs1(ListNode head) {
		 	int i =0;
		 	ListNode target = head;
		 	ListNode newHead = head;
		 	ListNode newTarget = head;
		 	ListNode previous = null;
		 	while (target != null) {
		 		
		 		if (i % 2 == 0) {
		 			previous = target;
		 			target = target.next;
		 		} else {
		 			if (i == 1) {
		 				newHead = target;
		 				newHead.next = previous;
		 				newTarget = newHead.next;
		 				target = target.next;
		 			} else {
		 				newTarget = target;
		 				newTarget.next = previous;
		 				newTarget = newTarget.next;
		 				target = target.next;
		 				
		 			}
		 		}
		 		i++;
		 	}
	        return newHead;
	 }
}
