package trees.genericTree;

import trees.genericTree.ThroughArray.Node;

public class DisplayGenericTree {
    
    public static void display(Node node){

        System.out.print(node.data + " → " );
        
        for(int idx = 0; idx < node.children.size(); idx++){

            System.out.print(node.children.get(idx).data + ", ");
        }

        System.out.println();
        for(int idx = 0; idx < node.children.size(); idx++){

            display(node.children.get(idx));
        }
    }
}
