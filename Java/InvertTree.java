public class InvertTree{
	public class Solution {
	    public TreeNode invertTree(TreeNode root) {
	        if(root == null) return root;
	        invertTree(root.left);
	        invertTree(root.right);
	        TreeNode temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	        return root;
	    }

	    public TreeNode invertTree2(TreeNode root) {
	        Queue<TreeNode> queue = new LinkedList<>();
	        if (root != null) {
	            queue.offer(root);
	        }
	        while (!queue.isEmpty()) {
	            int size = queue.size();
	            for (int i = 0; i < size; i++) {
	                TreeNode node = queue.poll();
	                if (node.right != null) {
	                    queue.offer(node.right);
	                }
	                if (node.left != null) {
	                    queue.offer(node.left);
	                }
	                TreeNode tmp = node.left;
	                node.left = node.right;
	                node.right = tmp;
	            }
	        }
	        return root;
	    }
	}
}