import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if (root==null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        return;
    }

    public static boolean search(Node root, int key){
        if (root==null){
            return false;
        }
        if(root.data > key){
            return search(root.left,key);
        }
        if(root.data==key){
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if (root.data > val){
            root.left = delete(root.left,val);
        }
        else if (root.data < val){
            root.right = delete(root.right, val);
        }
        else {
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2
            if (root.left==null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            }
            //case 3
            Node IS = inorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccesor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int X, int Y){
        if (root==null){
            return;
        }
        if (root.data>=X && root.data<=Y){
            printInRange(root.left,X,Y);
            System.out.print(root.data + " ");
            printInRange(root.right,X,Y);
        }
        else if (root.data <=X){
            printInRange(root.right,X,Y);
        }else {
            printInRange(root.left,X,Y);
        }
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if (root==null){
            return;
        }
        path.add(root.data);
        if (root.left==null && root.right==null){
            printPath(path);
        } else {
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for (int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+ "->");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int values[] = {8,5,1,3,4,2,7,10,11,14};
        Node root = null;

        for (int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        if (search(root,3)) {
            System.out.println("Key is Found");
        }else {
            System.out.println("Key is not Found");
        }

        delete(root,4);
        inOrder(root);

        printInRange(root,3,10);

        printRoot2Leaf(root,new ArrayList<>());
    }
}
