
public class Merge {

	public static void main(String[] args) {
//		ListNode a1 = new ListNode(4);
//		ListNode a2 = new ListNode(2,a1);
//		ListNode a3 = new ListNode(1,a2);
//		ListNode a4 = new ListNode(4);
//		ListNode a5 = new ListNode(3,a4);
//		ListNode a6 = new ListNode(1,a5);
		
		ListNode a3 = new ListNode(4);
		ListNode a6 = new ListNode(1);
		
		Solution result = new Solution();
		ListNode ans = (result.mergeTwoLists(a3,a6));

		result.print(ans);
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	if (list1 == null)
    		return list2;
    	if (list2 == null)
    		return list1;
    	return sol(list1, list2);
    }
    
    public ListNode sol(ListNode list1, ListNode list2) {
    	if (list2.next != null)
    	{
    		if (list2.val <= list1.val & list1.val <= list2.next.val)
    		{
	    		ListNode value = new ListNode(list1.val,list2.next);
	    		list2.next = value;
	    		mergeTwoLists(list1.next, list2.next);
    		}
    		if (list2.val < list1.val & list1.val > list2.next.val)
        	{
        		mergeTwoLists(list1, list2.next);
        	}
    	}
    	else
    	{
    		if (list2.val <= list1.val)
    		{
	    		ListNode value = new ListNode(list1.val,null);
	    		list2.next = value;
	    		mergeTwoLists(list1.next, list2.next);
    		}
    		if (list2.val < list1.val)
        	{
        		mergeTwoLists(list1, null);
        	}
    	}
    	if (list2.val > list1.val)
    	{
    		ListNode value = new ListNode(list2.val,list2.next);
    		list2.val = list1.val;
    		list2.next = value;
    		mergeTwoLists(list1.next, list2.next);
    	}
    	return list2;
    }
    
    public void print(ListNode ans)
    {
    	if (ans != null)
    	{
    		System.out.println(ans.val);
    		print(ans.next);
    	}
    }
}