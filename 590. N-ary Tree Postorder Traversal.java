/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
       List<Integer> result = new ArrayList<>(); 
       if(root == null){
        return result;
       }
       traversePostorder(root, result);
       return result;
    }
    private void traversePostorder(Node currentNode, List<Integer> postorderList){
        if(currentNode == null){
            return;
        }
        //First visit all children
        for(Node childNode : currentNode.children) {
            traversePostorder(childNode, postorderList);
        }
        postorderList.add(currentNode.val);
    }
}
