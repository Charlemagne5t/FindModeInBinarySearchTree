import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int[] max = new int[1];
        dfs(root, map, max);
        return map.entrySet().stream().filter(a -> a.getValue() == max[0]).mapToInt(Map.Entry::getKey).toArray();
    }
    private void dfs(TreeNode root, Map<Integer, Integer> map, int[] max){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        int count = map.getOrDefault(root.val, 0);
        count++;

        map.put(root.val, count);
        max[0] = Math.max(max[0], count);
        if(root.left != null){
            dfs(root.left, map, max);
        }

        if(root.right != null){
            dfs(root.right, map, max);
        }

    }
}