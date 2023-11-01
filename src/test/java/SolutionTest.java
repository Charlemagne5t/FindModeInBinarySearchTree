import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findModeTest1(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] expected = {2};
        int[] actual = new Solution().findMode(root);

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void findModeTest2(){
        TreeNode root = new TreeNode(0);
        int[] expected = {0};
        int[] actual = new Solution().findMode(root);

        Assert.assertArrayEquals(expected, actual);
    }@Test
    public void findModeTest3(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.left.left.left = new TreeNode(0);

        int[] expected = {0,1};
        int[] actual = new Solution().findMode(root);

        Assert.assertArrayEquals(expected, actual);
    }
}
