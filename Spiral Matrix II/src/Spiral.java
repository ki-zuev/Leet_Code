import java.util.*;

public class Spiral {

	public static void main(String[] args) {
			Solution result = new Solution();
			Scanner in1 = new Scanner(System.in);
			int n = in1.nextInt();
			int[][] ans = result.generateMatrix(n); 
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					System.out.print(ans[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
	}

}

class Solution {
    public int[][] generateMatrix(int n) {
    	int[][] matrix = new int[n][n];
    	int i = 0, j = 0, c = 0, j0 = 0, l = 1;
    	while(i < n-j)
    	{
    		while(j < n-i)
    		{
    			matrix[i][j] = l;
    			l++;
    			j++;
    		}
    		j--;
    		c = i+1;
    		while(c < n-i)
    		{
    			matrix[c][j] = l;
    			l++;
    			c++;
    		}
    		j--;
    		c--;
    		j0 = j;
    		while(j0 >= n-j-1-1)
    		{
    			matrix[c][j0] = l;
    			l++;
    			j0--;
    		}
    		c--;
    		j0++;
    		while(c > 0+i)
    		{
    			matrix[c][j0] = l;
    			l++;
    			c--;
    		}
    		i++;
    		j = i;
    	}
    	return matrix;
    }
}