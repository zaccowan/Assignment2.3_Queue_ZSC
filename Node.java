
/**
 * Generic Node class to store data.
 * @author Zachary Cowan
 * @param <T> Generic type of data to store in node
 * @version 9/29/2022
 * Fall/2022
 */
public class Node<T> {
    private T data; // Entry in stack
    private Node<T> next; // Link to next node
    
    
    /**
     * Constructor to set data in the node.
     * @param dataPortion Data to set.
     */
    public Node(T dataPortion)
    {
       this(dataPortion, null);
    } // end constructor
    
    /**
     * Constructor to set data in the node and the next node.
     * @param dataPortion Data to set.
     * @param linkPortion Next node to link
     */
    public Node(T dataPortion, Node<T> linkPortion)
    {
       data = dataPortion;
       next = linkPortion;
    } // end constructor
    
    /**
     * Get the data stored in the node.
     * @return T data in node
     */
    public T getData()
    {
       return data;
    } // end getData
    
    /**
     * Set the data stored in the node.
     * @param newData data in node
     */
    public void setData(T newData)
    {
       data = newData;
    } // end setData
    
    /**
     * Get the reference to the next linked node.
     * @return Node Next linked node
     */
    public Node<T> getNextNode()
    {
       return next;
    } // end getNextNode
    
    /**
     * Set the reference to the next linked node.
     * @param nextNode Next node to link
     */
    public void setNextNode(Node<T> nextNode)
    {
       next = nextNode;
    } // end setNextNode

} // end Node
