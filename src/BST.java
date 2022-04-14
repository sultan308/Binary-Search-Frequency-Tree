public class BST {

    private Node rootNode;

    public BST()
    {
        this.rootNode = null;
    }

    private void addNode(Node newNode)
    {
        if(this.rootNode == null)
        {
            this.rootNode = newNode;
            return;
        }
        Node currentNode = this.rootNode;
        while (currentNode != newNode)
        {
            if(newNode.getValue() > currentNode.getValue())
            {
                if (!currentNode.hasRight()) currentNode.setRightPointer(newNode);
                currentNode = currentNode.getRightPointer();

            }
            else {
                if (!currentNode.hasLeft()) currentNode.setLeftPointer(newNode);
                currentNode = currentNode.getLeftPointer();

            }
        }
    }

    private Node getParent(Node targetNode)
    {
        Node parentNode = (targetNode == this.rootNode) ? null : this.rootNode;
        while(parentNode != null)
        {
            if (parentNode.getValue() > targetNode.getValue())
            {
                if(parentNode.getLeftPointer().getValue() == targetNode.getValue()) break;
                parentNode = parentNode.getLeftPointer();
            }
            else if(parentNode.getValue() < targetNode.getValue())
            {
                if(parentNode.getRightPointer().getValue() == targetNode.getValue()) break;
                parentNode = parentNode.getRightPointer();
            }

        }
        return parentNode;
    }

    private void removeNode(Node targetNode)
    {
        Node parentNode = getParent(targetNode);
        Node replacmentNode = targetNode.hasLeft() ? getMax(targetNode.getLeftPointer()) : getMin(targetNode.getRightPointer());

        if(replacmentNode != null)
        {
            removeNode(replacmentNode);
            replacmentNode.setLeftPointer(targetNode.getLeftPointer());
            replacmentNode.setRightPointer(targetNode.getRightPointer());
        }
        if(parentNode != null)
        {
            if(parentNode.getRightPointer() == targetNode)
            {
                parentNode.setRightPointer(replacmentNode);
            }
            else if(parentNode.getLeftPointer() == targetNode)
            {
                parentNode.setLeftPointer(replacmentNode);
            }
        }
        else
        {
            this.rootNode = replacmentNode;
        }

    }

    public void remove(int value)
    {
        Node node = findNode(value);

        if(node != null) {
            node.decrementFreq();

            if (node.getFreq() <= 0) {
                removeNode(node);
            }
        }

    }

    public void add(int value)
    {
        Node node = findNode(value);
        if(node != null)
        {
            node.incrementFreq();
        }
        else {
            node = new Node(value);
            addNode(node);

        }
    }

    private Node findNode(int value)
    {
        Node currentNode = this.rootNode;
        while(currentNode != null)
        {
            if (currentNode.getValue() > value) currentNode = currentNode.getLeftPointer();
            else if(currentNode.getValue() < value) currentNode = currentNode.getRightPointer();
            else return currentNode;
        }
        return null;
    }

    public String findFreq(int value)
    {
        Node targetNode = findNode(value);
        return targetNode == null ? (value+"("+0+")") : targetNode.toString();

    }

    private Node getMax(Node start)
    {
        if(start == null) return start;
        Node max = start;
        while(max.getRightPointer() != null)
        {
            max = max.getRightPointer();
        }
        return max;
    }

    public String getMax()
    {
        Node max = getMax(this.rootNode);
        return  max == null ? "0(0)" : max.toString();

    }

    private Node getMin(Node start)
    {
        if(start == null) return start;
        Node min = start;
        while(min.getLeftPointer() != null)
        {
            min = min.getLeftPointer();
        }
        return min;
    }

    public String getMin()
    {
        Node min = getMin(this.rootNode);
        return  min == null ? "0(0)" : min.toString();
    }

    private String preOrder(Node node)
    {
        String preorder = "";
        preorder += node.toString() + " ";
        if(node.hasLeft())preorder += preOrder(node.getLeftPointer());
        if(node.hasRight())preorder += preOrder(node.getRightPointer());
        return preorder;

    }
    public String preOrder()
    {
        if(this.rootNode == null) return "";
        return preOrder(this.rootNode).trim();
    }

    private String postOrder(Node node)
    {
        String postorder = "";
        if(node.hasLeft()) postorder += postOrder(node.getLeftPointer());
        if(node.hasRight()) postorder += postOrder(node.getRightPointer());
        postorder += node.toString() + " ";

        return postorder;

    }
    public String postOrder()
    {
        if(this.rootNode == null) return "";
        return postOrder(this.rootNode).trim();
    }
    private String inOrder(Node node)
    {
        String inorder = "";
        if(node.hasLeft()) inorder += inOrder(node.getLeftPointer());
        inorder += node.toString() + " ";
        if(node.hasRight())inorder += inOrder(node.getRightPointer());
        return inorder;

    }
    public String inOrder()
    {
        if(this.rootNode == null) return "";
        return inOrder(this.rootNode).trim();
    }



}
