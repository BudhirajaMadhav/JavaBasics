package trees.genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class ThroughArray {
    
    public static class Node{

        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 50, -1, 60, -1, 70, -1, -1, 30, 80, -1, 90, -1, -1, 40, 100, -1, 110, -1, -1, -1};

        Stack<Node> stack = new Stack<>();
        Node root = null;
        for(int idx = 0; idx < arr.length; idx++){

            if(arr[idx] == -1){

                stack.pop();
            }else{

                Node node = new Node();

                node.data = arr[idx];

                if(stack.size() == 0){

                    root = node;
                }else{

                    stack.peek().children.add(node);
                }

                stack.push(node);
            }
            
        } 
            DisplayGenericTree.display(root);
    }

    

    
}
