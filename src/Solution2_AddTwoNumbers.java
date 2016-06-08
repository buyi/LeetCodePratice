import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution2_AddTwoNumbers {
	  public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		      
		      @Override
		    public String toString() {
		    	  List<Integer> result = new ArrayList<Integer> ();
		    	  ListNode node = this;
		    	  while (node != null) {
		    	  result.add(node.val);
		    	  node = node.next;
		    	  }
		    		  
		    	 
		    return Arrays.toString(result.toArray());
		    }
		  }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //ListNode result = null; //= new ListNode(-1);
        ListNode resultHead = null;// = result;
        ListNode resultTail = null;
        boolean isAdd = false;
            while (l2 != null && l1 != null) {
            	int tempResult = 0;
            	if (isAdd) {
            		tempResult = l1.val + 1 + l2.val;
            		//resultTemp.val = (tempResult) % 10;
            	} else {
            		tempResult = l1.val + l2.val;
            		//resultTemp.val = (tempResult) % 10;
            	}
                if (tempResult >= 10) {
                	isAdd = true;
                } else {
                	isAdd = false;
                }
                ListNode current = new ListNode ((tempResult) % 10);
                if (isAdd) {
                	current.next = new ListNode (1);
                } else {
                	current.next = null;
                }
                
                if (resultHead == null) {
                	 resultHead = current;
                } else {
                	resultTail.next = current;
                }
                resultTail = current;
//                result.next = new ListNode (-1);
//                resultTemp = result.next;
//                result = result.next;
                
                
                l1 = l1.next;
                l2 = l2.next;
            }
            while (l1 !=null) {
            	int tempResult = 0;
            	if (isAdd) {
            		tempResult = l1.val + 1;
            		////resultTemp.val = (tempResult) % 10;
            	} else {
            		tempResult = l1.val;
            		//resultTemp.val = (tempResult) % 10;
            	}
                if (tempResult >= 10) {
                	isAdd = true;
                } else {
                	isAdd = false;
                }
//                resultTemp.next = new ListNode (-1);
//                resultTemp = resultTemp.next;
                ListNode current = new ListNode ((tempResult) % 10);
                if (isAdd) {
                	current.next = new ListNode (1);
                } else {
                	current.next = null;
                }
                
                if (resultHead == null) {
                	 resultHead = current;
                } else {
                	resultTail.next = current;
                }
                resultTail = current;
                l1 = l1.next;
            	
            }
            
            while (l2 != null) {
            	int tempResult = 0;
            	if (isAdd) {
            		tempResult = l2.val + 1;
            	} else {
            		tempResult = l2.val;
            	}
                if (tempResult >= 10) {
                	isAdd = true;
                } else {
                	isAdd = false;
                }
//                resultTemp.next = new ListNode (-1);
//                resultTemp = resultTemp.next;
                ListNode current = new ListNode ((tempResult) % 10);
                if (isAdd) {
                	current.next = new ListNode (1);
                } else {
                	current.next = null;
                }
                
                if (resultHead == null) {
                	 resultHead = current;
                } else {
                	resultTail.next = current;
                }
                resultTail = current;
                l2 = l2.next;
            	
            
            }
        return resultHead;
        
    }
    
    public static void main(String[] args) {
    	ListNode node1 = new ListNode (5);
    	node1.next = new ListNode(6);
    	ListNode node2 = new ListNode (5);
    	node2.next = new ListNode (3);
    	ListNode result = addTwoNumbers (node1, node2);
    	System.out.println("result:" + result);
    }
  
}
