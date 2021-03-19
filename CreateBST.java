package algoexpert.easy;

public class CreateBST {

    public Node root;

    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(root ==null)
        {
            root=newNode;
            return;
        }
        else
        {
            Node current = root;
            Node parent=null;
            while(true)
            {
                parent=current;
                if(data < current.data)
                {
                    System.out.println("left me "+current.left);
                    current=current.left;
                    if(current==null)
                    {
                        parent.left=newNode;
                        return;
                    }
                }
                else
                {
                    current=current.right;
                    System.out.println("right me "+current.right);
                    if(current==null)
                    {
                        parent.right=newNode;
                        return;
                    }
                }
            }


        }
    }

    public  static  void main(String arr[])
    {
        CreateBST createBST=new CreateBST();
        createBST.insert(10);
        createBST.insert(5);
        createBST.insert(15);
        createBST.insert(2);
        createBST.insert(5);
        createBST.insert(13);
        createBST.insert(22);
        createBST.insert(1);
        createBST.insert(14);
        System.out.println(createBST.root.toString());
    }

    public static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data){
            //Assign data to the new node, set left and right children to null
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
}
