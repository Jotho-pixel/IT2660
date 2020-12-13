public class BinaryTree {
    TreeNode root;
    public BinaryTree() {
        root = null;
    }

    public boolean insert(StudentListings newListing) {
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        TreeNode n = new TreeNode();

        if (n == null)
            return false;
        else
        {
            n.node = newListing.deepCopy();
            n.lc = null;
            n.rc = null;
            if (root == null)
            {
                root = n;
            }
            else
            {
                findNode(newListing.getName(), p, c);
                if(newListing.getName().compareTo(p.get().node.getName()) < 0)
                {
                    p.get().lc = n;
                }
                else 
                {
                    p.get().rc = n;
                }

            }
            return true;
        }
        
    }

    public StudentListings fetch(String targetKey) {
        boolean found;
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        found = findNode(targetKey, p, c);
        if (found == true)
            return c.get().node.deepCopy();
        else
            return null;
    }

    public boolean delete(String targetKey)
    {
        boolean found;
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        TreeNode largest;
        TreeNode nextLargest;
        found = findNode(targetKey, p, c);
        if (found == false)
            return false;
        else
        {
            if(c.get().lc == null && c.get().rc == null)
            {
                if (p.get().lc == c.get())
                    p.get().lc = null;
                else
                    p.get().rc = null;
            }
            else if (c.get().lc == null || c.get().rc == null)
            {
                if (c.get().lc != null)
                    p.get().lc = c.get().lc;
                else 
                    p.get().lc = c.get().rc;
            }
            else
            {
                nextLargest = c.get().lc;
                largest = nextLargest.rc;
                if (largest != null)
                {
                    while(largest.rc != null)
                    {
                        nextLargest = largest;
                        largest = largest.rc;
                    }
                    c.get().node = largest.node;
                    nextLargest = largest.lc;
                }
                else 
                {
                    nextLargest.rc = c.get().rc;
                    if(p.get().lc == c.get())
                    p.get().lc = nextLargest;
                    else
                        p.get().rc = nextLargest;
                }
            }
            return true;
        }
    }

    public boolean update(String targetKey, StudentListings newListing)
    {
        if(delete(targetKey) == false)
            return false;
        else if (insert(newListing) == false)
            return false;
        return true;
    }

    public class TreeNode
    {
        private StudentListings node;
        private TreeNode lc;
        private TreeNode rc;
        public TreeNode()
        {}
    }

    private boolean findNode(String targetKey, TreeNodeWrapper parent, TreeNodeWrapper child)
    {
        parent.set(root);
        child.set(root);
        if (root == null)
            return true;
        while (child.get() != null)
        {
            if(child.get().node.compareTo(targetKey) == 0)
                return true;
            else
            {   parent.set(child.get());
            if (child.get().node.compareTo(child.get().node.getName()) < 0)
                child.set(child.get().lc);
            else
                child.set(child.get().rc);
            }
        }
        return false;
    }
    
    public class TreeNodeWrapper
    {
        TreeNode treeRef = null;
        public TreeNodeWrapper()
        {}
        public TreeNode get()
        {
            return treeRef;
        }
        public void set(TreeNode t)
        {
            treeRef = t;
        }
    }
}
