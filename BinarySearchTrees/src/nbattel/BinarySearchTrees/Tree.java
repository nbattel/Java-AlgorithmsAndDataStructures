package nbattel.BinarySearchTrees;

public class Tree {

    private TreeNode root;

    //Insertion Method for the tree
    public void insert(int value)
    {
        if(root == null)
        {
            root = new TreeNode(value);
        }
        else
        {
            root.insert(value);
        }
    }

    //Method for traversing the tree
    public void traverseInOrder()
    {
        if(root != null)
        {
            root.traverseInOrder();
        }
    }

    //Method to search for a node in the tree
    public TreeNode get(int value)
    {
        if(root != null)
        {
            return root.get(value);
        }

        return null;
    }

    public void delete(int value)
    {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value)
    {
        if(subtreeRoot == null)
        {
            return subtreeRoot;
        }

        if(value < subtreeRoot.getData())
        {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if(value > subtreeRoot.getData())
        {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        else
        {
            //Cases 1 and 2: node to delete has 0 or 1 child(ren)
            if(subtreeRoot.getLeftChild() == null)
            {
                return subtreeRoot.getRightChild();
            }
            else if(subtreeRoot.getRightChild() == null)
            {
                return subtreeRoot.getLeftChild();
            }

            //Case 3: node to delete has 2 children
            //From the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            //Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }

        return subtreeRoot;
    }

    //Returning the minimum node value in the tree
    public int min()
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            return root.min();
        }
    }

    //Returning the maximum node value in the tree
    public int max()
    {
        if(root == null)
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return root.max();
        }
    }
}
