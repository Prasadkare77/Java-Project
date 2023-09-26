import java.util.*;

public class BinaryTrees {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root){
            if (root==null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if (root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if (root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root){
            if (root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode==null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if (currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int countOfNodes(Node root){
            if (root==null){
                return 0;
            }
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);
            return leftNodes + rightNodes + 1;
        }

        public static int sumOfNodes(Node root){
            if (root==null){
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        public static int height(Node root){
            if (root==null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int myHeight = Math.max(leftHeight, rightHeight) + 1;
            return myHeight;
        }

        public static int diameter(Node root){
            if (root==null){
                return 0;
            }
            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = height(root.left) + height(root.right) + 1;
            return Math.max(dia3, Math.max(dia1,dia2));
        }

        static class TreeInfo{
            int ht;
            int diam;
            TreeInfo(int ht, int diam){
                this.ht = ht;
                this.diam = diam;
            }
        }
        public static TreeInfo diameter2(Node root){
            if (root==null){
                return new TreeInfo(0,0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);
            int myHeight = Math.max(left.ht, right.ht);

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;
            int myDiam = Math.max(Math.max(diam1,diam2),diam3);

            TreeInfo myInfo = new TreeInfo(myHeight,myDiam);
            return myInfo;
        }
    }
    public static void main(String arg[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println("Root is: " + root.data);

        System.out.print("Pre Order Tree Is: ");
        tree.preOrder(root);
        System.out.println();

        System.out.print("Inorder Tree Is: ");
        tree.inOrder(root);
        System.out.println();

        System.out.print("Post Order Tree Is: ");
        tree.postOrder(root);
        System.out.println();

        System.out.println("Level Order Tree Is: ");
        tree.levelOrder(root);

        System.out.print("Count Of Nodes is: ");
        System.out.println(tree.countOfNodes(root));

        System.out.print("Sum Of Nodes is: ");
        System.out.println(tree.sumOfNodes(root));

        System.out.print("Height of Tree is: ");
        System.out.println(tree.height(root));

        System.out.print("Diameter of Tree is: ");
        System.out.println(tree.diameter(root));

        System.out.print("Diameter2 of Tree is: ");
        System.out.println(tree.diameter2(root).diam);
    }
}
