import java.util.ArrayList;
import java.util.Collections;

class SD {
    public ArrayList<String> serialize(TreeNode node) {
      ArrayList<String> list = new ArrayList<>();
      helper(node, list);
      return list;
    }
    void helper(TreeNode node, ArrayList<String> list) {
      if (node == null) {
        list.add("null");
        return;
      }  
      
      list.add(String.valueOf(node.val));
  
      helper(node.left, list);
      helper(node.right, list);
    }
  
    TreeNode deserialize(ArrayList<String> list) {
      Collections.reverse(list);
      TreeNode node = helper2(list);
      return node;
    }
    TreeNode helper(ArrayList<String> list) {
      String val = list.remove(list.size() - 1);
  
      if (val.charAt(0) == 'n') {
        return null;
      }
      
      TreeNode node = new TreeNode(Integer.parseInt(val));
  
      node.left = helper2(list);
      node.right = helper2(list);
  
      return node;
    }
  }
