import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Node{
    int data;
    Node left;
    Node right;
    Node(int x){
        this.data = x;
        this.left=this.right=null;
    }
}

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] arr = new Node[n];
        for(int i=0;i<n;i++){
            arr[i] = new Node(i+1);
        }

        for(int i=0;i<n;i++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            if(left!=-1){
                arr[i].left = arr[left-1];
            }

            if(right!=-1){
                arr[i].right = arr[right-1];
            }
        }

        System.out.print(getCount(arr[0]));

        // preOrder(arr[0]);
        // System.out.println();
        // inOrder(arr[0]);
	}

    static int getCount(Node root){
        if(root==null) return 0;
        if(root.left == null && root.right == null) return 1;
        return getCount(root.left) + getCount(root.right);
    }

    static void preOrder(Node root){
        if(root==null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if(root==null) return;

        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

}