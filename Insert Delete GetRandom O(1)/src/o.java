import java.util.*;

public class o {
	public static void main(String args[])
	{
		Scanner in1 = new Scanner(System.in);
		int n = in1.nextInt();
//		Vector<String> v0 = new Vector<>();
//		Scanner in2 = new Scanner(System.in);
//		String name = in2.nextLine();
//		String[] s0 = name.split(" ");
		Vector<Vector<Integer>> v1 = new Vector<>();
//		Scanner in3 = new Scanner(System.in);
//		String val = in3.nextLine();
//		String[] s1 = val.split(" ");
		
//		for(String num : s0)
//		{
//			v0.add(num);
//		}
		
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
		
		RandomizedSet randomizedSet = new RandomizedSet();
		System.out.println(randomizedSet.insert(v1.get(1).get(0)));
		System.out.println(randomizedSet.remove(v1.get(2).get(0)));
		System.out.println(randomizedSet.insert(v1.get(3).get(0)));
		System.out.println(randomizedSet.getRandom());
		System.out.println(randomizedSet.remove(v1.get(5).get(0)));
		System.out.println(randomizedSet.insert(v1.get(6).get(0)));
		System.out.println(randomizedSet.getRandom());
	}

}

class RandomizedSet {
	
	Random random = new Random();
	private Vector<Integer> v;
	private HashMap<Integer, Integer> h;
	
    public RandomizedSet() {
    	v = new Vector<Integer>();
    	h = new HashMap<Integer,Integer>();
    }
    
    public boolean insert(int val) {
    	if (h.containsKey(val))
    	{
    		return false;
    	}
    	else
    	{
    		h.put(val,v.size());
    		v.add(val);
    		return true;
    	}
    }
    
    public boolean remove(int val) {
    	boolean c = h.containsKey(val);
    	if (!c)
    	{
    		return false;
    	}
    	int loc = h.get(val);
    	if (loc < v.size()-1)
    	{
    		int last = v.get(v.size()-1);
    		v.set(loc,last);
    		h.put(last,loc);
    	}
    	h.remove(val);
    	v.remove(v.size()-1);
    	return true;
    }
    
    public int getRandom() {
    	int i = random.nextInt(0, v.size());
        return v.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */