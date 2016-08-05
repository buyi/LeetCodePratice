
public class Solution19_RemoveNthNodeFromEndofList {
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 ListNode newHead = head;
		 int length = 0;
	
		 
		 
		 do {
			 newHead = newHead.next;
			 length++;
		 } while (newHead.next != null);
		 System.out.println("length:" + length);
		 
//		 return newHead;
		 
		 if (n > length) return null;
		 
		 
		 ListNode target;
		 // 头指针
		 ListNode pre = head;
		 int index = 0;
		 
		 do {
			 target = pre.next;
			 index++;
			 if (index == length-n) {
				 pre = target.next;
				 target = pre.next;
			 } else {
				 pre = target;
				 target = target.next;
			 }
		 } while (target.next != null);
		 
		 return head;
	        
	    }
	 
	 
	 public ListNode removeNthFromEnd1(ListNode head, int n) {
         ListNode p1 = head;  
     ListNode p2 = head;  
     ListNode removeNode = head;  
     int i = 0;  
     while(p1!=null){  
         p1 = p1.next;  
         i++;  
         if(i > n){  
             p2 = removeNode;  
             removeNode = removeNode.next;  
         }  
     }  
       
     if(removeNode == head){  
         head = head.next;  
     }else{  
         p2.next = removeNode.next;  
     }  
     return head;  
 }
}
