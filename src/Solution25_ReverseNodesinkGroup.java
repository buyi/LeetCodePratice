
public class Solution25_ReverseNodesinkGroup {
	
	public static void main(String[] args) {
		ListNode one  = new ListNode(41);
		one.next = new ListNode(9);
		one.next.next = new ListNode(23);
		
		
		Solution25_ReverseNodesinkGroup ww = new Solution25_ReverseNodesinkGroup();
//		ListNode result = ww.swapThreePairs (one);
		ListNode result = ww.reverseKGroup (one, 1);
		while (result != null) {
			System.out.println("result:" + result.val);
			result = result.next;
		}
			
			
	}

	  public ListNode reverseKGroup(ListNode head, int k) {
		  if(head == null || head.next == null)   
		        return head;
		  
		  if (k == 1) 
			  return head;
		  
		    ListNode h = new ListNode(0);
		    h.next = head;
		    ListNode p = h;
		    
		  
		    while (isLastNodeNull(p.next, k)) {
		        //use t1 to track first node
		        ListNode t1 = p; // 指向前一个
		        p = p.next; // 指向pairs的第一个
		        t1.next = pointLastNode(p.next, k-1);  // 指向pairs的最后一个
		        
		        
		        //use t2 to track next node of the pair
		        ListNode t2 = pointLastNode(p.next.next, k-1); // 指向后一个
//		        p.next.next.next = p.next; //
//		        p.next.next = p;
		        swapKNode (p.next, p, k-1);
		        p.next = t2;
		    }
	        return h.next;
	    }
	  
	  private void  swapKNode (ListNode after, ListNode pre, int k) {
		  if (k > 0) {
			  ListNode after1 = pointLastNode(after, k);
			  ListNode pre1 = pointLastNode(pre, k);
//			  if (after1 == null)
//				  return;
			  after1.next = pre1;
			  swapKNode (after, pre, k-1);
		  }
		 
		 
//		  //4
//		  p.next.next.next.next = p.next.next; 
//		  p.next.next.next = p.next; 
//		  p.next.next = p; 
//		  
//		  //3
//		    p.next.next.next = p.next; //
//	        p.next.next = p;
//	        
//	        //2
//	        p.next.next = p;
	  }
	  
	  private boolean isLastNodeNull(ListNode node, int k) {
		  if (node == null)
			  return false;
		  
		  
		  int index = k;
		    ListNode last = node;
		    while (index > 1) {
		    	if (last == null)
		    		return false;
		    	last = last.next;
		    	index--;
		    }
		    
		    return last != null;
	  }
	  
	  private ListNode pointLastNode (ListNode node, int k) {
//		  if (node == null)
//			  return null;
		  int index = k;
		  ListNode last = node;
		    while (index > 1) {
//		    	if (last == null)
//		    		return last;
		    	last = last.next;
		    	index--;
		    }
		    return last;
	  }
	  
	  public ListNode swapThreePairs (ListNode head) {
		  if(head == null || head == null)   
		        return head;
		 
		    ListNode h = new ListNode(0);
		    h.next = head;
		    ListNode p = h;
		 
		    while(p.next != null && p.next.next != null && p.next.next.next != null){
		        //use t1 to track first node
		        ListNode t1 = p; // 指向前一个
		        p = p.next; // 指向pairs的第一个
		        t1.next = p.next.next;  // 指向pairs的最后一个
		 
		        //use t2 to track next node of the pair
		        ListNode t2 = p.next.next.next; // 指向后一个
		        p.next.next.next = p.next; //
		        p.next.next = p;
		        p.next = t2;
		    }
		 
		    return h.next;
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
	  
	  
}
