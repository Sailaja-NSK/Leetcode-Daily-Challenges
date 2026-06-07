class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer,TreeNode> map = new HashMap<>();

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i < descriptions.length;i++) {

            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            int isLeft = descriptions[i][2];

            if(!map.containsKey(parent)) {

                map.put(parent,new TreeNode(parent));
            } 

            if(!map.containsKey(child)) {
                map.put(child,new TreeNode(child));
            }

            TreeNode parentNode = map.get(parent);
            TreeNode childNode = map.get(child);

            if(isLeft == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }

            set.add(child);

        }

        for(int value : map.keySet()) {
            if(!set.contains(value)) {
                return map.get(value);
            }
        }

        return null;

    }
}
