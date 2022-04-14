public class Node
{

    private Node leftPointer;
    private Node rightPointer;
    private int value;
    private int  freq;
    public Node(int value)
    {
        this.value = value;
        leftPointer = null;
        rightPointer = null;
        freq = 1;
    }
    public Node getLeftPointer() {
        return leftPointer;
    }
    public Node getRightPointer() {
        return rightPointer;
    }
    public int getValue() {
        return value;
    }
    public int getFreq() {
        return freq;
    }
    public void setLeftPointer(Node leftPointer )
    {
        this.leftPointer = leftPointer;
    }
    public void setRightPointer(Node rightPointer )
    {
        this.rightPointer = rightPointer;
    }
    public void incrementFreq()
    {
        this.freq+=1;
    }
    public void decrementFreq()
    {
        this.freq-=1;
    }
    public boolean hasLeft()
    {
        return leftPointer != null;
    }
    public boolean hasRight()
    {
        return rightPointer != null;
    }

    @Override
    public String toString()
    {
        return this.value+"("+this.freq+")";
    }

}