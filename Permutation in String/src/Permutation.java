import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		String s1 = in1.nextLine();
		Scanner in2 = new Scanner(System.in);
		String s2 = in2.nextLine();
		
		Solution ans = new Solution();
		System.out.println(ans.checkInclusion(s1, s2));
	}

}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
        	return false;
        int[] m1 = new int[26]; // HashMap<Character, Integer> s1map = new HashMap<>();
        int[] m2 = new int[26];
        for(int i=0; i<s1.length(); i++)
        {
        	m1[s1.charAt(i)-'a'] += 1; // s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
        	m2[s2.charAt(i)-'a'] += 1;
        }
        for(int i=0; i<s2.length()-s1.length(); i++)
        {
        	if (match(m1, m2))
        		return true;
        	m2[s2.charAt(i+s1.length())-'a'] += 1;
        	m2[s2.charAt(i)-'a'] -= 1;
        }
    	return match(m1, m2);
    }
    
    public boolean match(int[] m1, int[] m2)
    {
    	for(int i=0; i<m1.length; i++)
    	{ 
    		if (m1[i] != m2[i])
    			return false;
    	}
    	return true;
    }
    
//    int count = 0;
//    for (int i = 0; i < 26; i++) {
//    	if (s1map[i] == s2map[i])
//    		count++;
//        }
//
//    for (int i = 0; i < s2.length() - s1.length(); i++) {
//    	int r = s2.charAt(i + s1.length()) - 'a', l = s2.charAt(i) - 'a';
//        if (count == 26)
//        	return true;
//        s2map[r]++;
//        if (s2map[r] == s1map[r]) {
//        	count++;
//        } else if (s2map[r] == s1map[r] + 1) {
//        	count--;
//        }
//        s2map[l]--;
//        if (s2map[l] == s1map[l]) {
//        	count++;
//        } else if (s2map[l] == s1map[l] - 1) {
//        	count--;
//        }
//    }
//    return count == 26;
}