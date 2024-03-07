public class binary {
	
	// путь с максимальной суммой от корня до листа
	
	static int maxPathSum0(TreeNode root)
	{
		  if (root == null)
		  {
		    return 0;
		  }
		  int maxLeftPath = maxPathSum0(root.left);
		  int maxRightPath = maxPathSum0(root.right);
		  return Math.max(maxLeftPath, maxRightPath)+root.val;
	}
	
	public static void main (String args[])
	{
//		TreeNode a1 = new TreeNode();
//		TreeNode a2 = new TreeNode();
//		TreeNode a3 = new TreeNode();
//		TreeNode a4 = new TreeNode();
//		TreeNode a5 = new TreeNode();
//		TreeNode a6 = new TreeNode();
//		a6.val = 7;
//		a5.val = 2;
//		a4.val = 3;
//		a4.left = a5;
//		a3.val = 2;
//		a2.val = 4;
//		a2.left = a3;
//		a2.right = a4;
//		a1.val = 1;
//		a1.left = a2;
//		a1.right = a6;
//		
//		int result = 0;
//		result = maxPathSum0(a1);
//		System.out.println(result);
		
		
		TreeNode a1 = new TreeNode();
		TreeNode a2 = new TreeNode();
		TreeNode a3 = new TreeNode();
		TreeNode a4 = new TreeNode();
		TreeNode a5 = new TreeNode();
		TreeNode a6 = new TreeNode();
		TreeNode a7 = new TreeNode();
		TreeNode a8 = new TreeNode();
		TreeNode a9 = new TreeNode();
		a9.val = 9;
		a8.val = -2;
		a7.val = -2;
		a5.val = 5;
		a5.left = a7;
		a6.val = -4;
		a3.val = -3;
		a3.left = a5;
		a3.right = a6;
		a4.val = 8;
		a4.right = a8;
		a2.val = 20;
		a2.left = a3;
		a2.right = a4;
		a1.val = -10;
		a1.right = a2;
		a1.left = a9;
		
		Solution s = new Solution();
		s.maxPathSum1(a1);
		System.out.println(s.answer);
	}

}

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode()
	{
		this.left = null;
		this.right = null;
	}
}

class Solution
{

//есть отрицательные числа, каждую вершину проходим один раз, максимальный любой путь в дереве

	int answer = 0;
	
	int maxPathSum1(TreeNode root)
	{
		helper(root);
		return answer;
	}
	
	int helper (TreeNode node)
	{
		if (node == null)
		{
			return 0;
		}
		int maxLeftPath = Math.max(helper(node.left), 0);
		int maxRightPath =  Math.max(helper(node.right), 0);
		answer = Math.max(answer, maxLeftPath+maxRightPath+node.val);
		return Math.max(maxLeftPath, maxRightPath)+node.val;
	}
}