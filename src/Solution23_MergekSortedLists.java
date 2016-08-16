import java.util.Comparator;
import java.util.PriorityQueue;



//  class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
public class Solution23_MergekSortedLists {
	public static void main(String[] args) {
		Solution23_MergekSortedLists s = new Solution23_MergekSortedLists();
//		ListNode[] l = new ListNode[] {new ListNode(1), new ListNode(0)};
		ListNode[] l = new ListNode[] {new ListNode(1)};
		s.mergeKLists(l);
	}
	
//	 public ListNode mergeKLists(ListNode[] lists) {
//		 ListNode node  = null;
//		 int length = lists.length;
//		 if (length == 0 ) {
//			 return null;
//		 } else if (length <= 1) return lists[0];
//		 
//	        for (int i = 0; i < lists.length - 1 ; ) {
//	        	if ( node == null) {
//	        		node = mergeTwoLists (lists[i], lists[i+1]);
//	        		i += 2;
//	        	} else {
//	        		node = mergeTwoLists(node, lists[i]);
//	        		i ++;
//	        	}
//	        	
//	        }
//	        return node;
//	    }
//	 
//	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		   ListNode head = null;
//		   ListNode target = null;
//		   boolean ifFrist = true;
//		   
//		   while (l1 != null && l2 != null) {
//			   if (l1.val <= l2.val) {
//				   if (ifFrist) {
//					   head = l1;
//					   target = head;
//					   ifFrist = false;
//				   } else {
//					   target.next = l1;
//					   l1 = l1.next;
//					   target = target.next;
//				   }
//			
//			   } else if (l1.val > l2.val) {
//				   if (ifFrist) {
//					   head = l2;
//					   target = head;
//					   ifFrist = false;
//				   } else {
//					   target.next = l2;
//					   l2 = l2.next;
//					   target = target.next;
//				   }
//				  
//			   }
//			  
//		   }
//		   
//		   if (l1 == null) {
//			   while (l2 != null) {
//				   if (ifFrist) {
//					   head = l2;
//					   target = head;
//					   ifFrist = false;
//				   } else {
//					   target.next = l2;
//					   target = target.next;
//				   }
//				   l2 = l2.next;
//			   }
//				  
//		   } else if (l2 == null) {
//			   while (l1 != null) {
//				   if (ifFrist) { 
//					   head = l1;
//					   target = head;
//					   ifFrist = false;
//				   } else {
//					   target.next = l1;
//					   target = target.next;
//				   }
//				  
//				   l1 = l1.next;
//				  
//			   }
//		   }
//		   
//		   
//		   return head;
//	    }
	 
	 
//	 ListNode merge2Lists(ListNode list1, ListNode list2) {  
//	        ListNode head    = new ListNode(-1);  
//	        ListNode current = head;  
//	        while(list1!=null&&list2!=null) {  
//	            if(list1.val<list2.val) {  
//	                current.next = list1;  
//	                list1   = list1.next;  
//	            } else {  
//	                current.next = list2;  
//	                list2   = list2.next;  
//	            }  
//	            current = current.next;  
//	        }  
//	        if(list1!=null) {  
//	            current.next = list1;  
//	        } else {  
//	            current.next = list2;  
//	        }  
//	        return head.next;  
//	    }  
//	    
//	    public ListNode mergeKLists(ListNode[] lists) {  
//	         List<ListNode> listss = new ArrayList<ListNode>();
//	        for (int i = 0; i< lists.length; i++) {
//	            listss.add(lists[i]);
//	        }
//	        
//	        return mergeKLists(lists);
//	    }
//	    public ListNode mergeKLists(List<ListNode> lists) { 
//	        if(lists==null||lists.size()==0) {  
//	            return null;  
//	        }  
//	        if(lists.size()==1) {  
//	            return lists.get(0);  
//	        }  
//	        int length = lists.size() ;  
//	        int mid = (length - 1)/2 ;  
//	        ListNode l1 = mergeKLists(lists.subList(0,mid + 1)) ;  
//	        ListNode l2 = mergeKLists(lists.subList(mid + 1,length)) ;  
//	  
//	        return merge2Lists(l1,l2) ;  
//	    }  
//	}
	 
	 public ListNode mergeKLists(ListNode[] lists) {
		    if(lists==null||lists.length==0)
		        return null;
		 
		    PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
		        public int compare(ListNode l1, ListNode l2){
		            return l1.val - l2.val;
		        }
		    });
		 
		    ListNode head = new ListNode(0);
		    ListNode p = head;
		 
		    for(ListNode list: lists){
		        if(list!=null)
		            queue.offer(list);
		    }    
		 
		    while(!queue.isEmpty()){
		        ListNode n = queue.poll();
		        p.next = n;
		        p=p.next;
		 
		        if(n.next!=null)
		            queue.offer(n.next);
		    }    
		 
		    return head.next;
		 
		}

}
