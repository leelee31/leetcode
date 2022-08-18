/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Integer, Node> map = new HashMap();
    
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        System.out.println(node.val);

        Node newNode = new Node(node.val);
        map.put(newNode.val, newNode);
        
        List<Node> neighbors = new ArrayList<>();
        
        for (Node n : node.neighbors) {
            if (!map.containsKey(n.val)) {
                Node newNode2 = cloneGraph(n);
            }
            
            Node temp = map.get(n.val);
            neighbors.add(temp);
        }

        newNode.neighbors = neighbors;
        return newNode;
    }
}