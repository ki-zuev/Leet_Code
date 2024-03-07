import java.util.*;
import java.io.*;

public class list {
	public static void main (String args[])
	{
		ListNode a1 = new ListNode();
		ListNode a2 = new ListNode();
		ListNode a3 = new ListNode();
		ListNode a4 = new ListNode();
		ListNode a5 = new ListNode();
		ListNode a6 = new ListNode();
//		a1.val = 1;
//		a1.next = a4;
//		a4.val = 4;
//		a4.next = a2;
//		a2.val = 2;
//		a2.next = a3;
//		a3.val = 3;
//		a3.next = a5;
//		a5.val = 5;
//		a5.next = a6;
//		a6.val = 6;
//		a6.next = a2;
//		
//		a1.val = 1;
//		a1.next = a3;
//		a3.val = 3;
//		a3.next = a2;
//		a2.val = 2;
//		a2.next = null;
//		
//		a1.val = 1;
//		a1.next = a3;
//		a3.val = 3;
//		a3.next = a4;
//		a4.val = 4;
//		a4.next = a2;
//		a2.val = 2;
//		a2.next = a1;
		
		Solution result = new Solution();
		System.out.println(result.prost(a1));
	}
}

class ListNode
{
	int val;
	ListNode next;
}

class Solution
{
	Vector<Integer> v = new Vector<>();
	String ans = "null";
	
	String prost(ListNode l)
	{
		if (v.contains(l.val) == true)
		{
			ans = Integer.toString(l.val);
		}
		else
		{
			v.add(l.val);
			if (l.next != null)
			{
				prost(l.next);
			}
		}
		return ans;
	}
}