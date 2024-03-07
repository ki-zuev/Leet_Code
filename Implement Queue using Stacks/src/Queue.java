import java.util.*;

public class Queue {

	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		int n = in1.nextInt();
		Vector<Vector<Integer>> v1 = new Vector<>();
		
		for(int i=0; i<n; i++)
		{
			Vector<Integer> vector = new Vector<Integer>();
			Scanner in = new Scanner(System.in);
			String value = in.nextLine();
			String[] s = value.split(" ");

			if ((s.length == 1) & (s[0] == ""))
			{
				v1.add(vector);
			}
			else
			{
				for(int j=0; j<s.length; j++)
				{
					vector.add(Integer.parseInt(s[j]));
				}
				v1.add(vector);
			}
		}
		
		System.out.println(v1);
		
		MyQueue myQueue = new MyQueue();
		myQueue.push(v1.get(1).get(0));
		myQueue.push(v1.get(2).get(0));
		System.out.println(myQueue.peek());
		System.out.println(myQueue.pop());
		System.out.println(myQueue.empty());
	}

}

class MyQueue {

	Stack<Integer> v;
	Stack<Integer> v0;
    public MyQueue() {
        v = new Stack<Integer>();
        v0 = new Stack<Integer>();
    }
    
    public void push(int x) {
        v.push(x);
    }
    
    public int pop() {
    	while (!v.empty())
    	{
    		v0.push(v.peek());
    		v.pop();
    	}
    	int val = v0.pop();
    	while (!v0.empty())
    	{
    		v.push(v0.peek());
    		v0.pop();
    	}
        return val;
    }
    
    public int peek() {
    	while (!v.empty())
    	{
    		v0.push(v.peek());
    		v.pop();
    	}
    	int val = v0.peek();
    	while (!v0.empty())
    	{
    		v.push(v0.peek());
    		v0.pop();
    	}
        return val;
    }
    
    public boolean empty() {
        if (v.empty())
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */