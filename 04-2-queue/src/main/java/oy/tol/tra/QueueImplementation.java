package oy.tol.tra;

public class QueueImplementation<E> implements QueueInterface<E> {
   private static final int MY_CONSTANT_VARIABLE = 10;
   private Object [] itemArray;
   private int capacity;
   private int count;
   private int head;
   private int tail;
   
    public QueueImplementation() throws QueueAllocationException{
        this(MY_CONSTANT_VARIABLE);
    }
    
    public QueueImplementation(int capacity) throws QueueAllocationException{
        if(capacity < 2){
            throw new QueueAllocationException("Must be higher than 1");
        }
        try{
            itemArray = new Object[capacity];
            this.capacity = capacity;
            count = 0;
            head = 0;
            tail = 0;
        }
        catch(Exception e){
            throw new QueueAllocationException(e.getMessage());
        }
    }
   /**
    * For querying the current capacity of the queue.
    @return The number of elements the queue can currently hold.
    */
    @Override
    public int capacity(){
        return capacity;
    }
   
    /**
     * Add an element to the queue.
     * @param element The element to add, must not be null.
     * @throws QueueAllocationException If the reallocation for the queue failed in case queue needs reallocation.
     * @throws NullPointerException If the element is null.
     */
    @Override
    public void enqueue(E element) throws QueueAllocationException, NullPointerException{
        if(element == null){
            throw new NullPointerException();
        }
        if(count == capacity){
            Reallocate();
        }
        if(tail >= capacity && head > 0){
            tail = 0;
        }
        itemArray[tail] = element;
        tail++;
        count++;
        
    }

    /**
     * Removes an element from the queue.
     * @return The element from the head of the queue.
     * @throws QueueIsEmptyException If the queue is empty.
     */
    @SuppressWarnings("unchecked")
    @Override
    public E dequeue() throws QueueIsEmptyException{
        E tmp;
        if(count == 0){
            throw new QueueIsEmptyException("Queue is empty");
        }
        tmp = (E) itemArray[head];
        itemArray[head] = null;
        head++;
        count--;
        if(head >= capacity){
            head = 0;
        }
    
        return tmp;
    }
    /**
     * Returns the element at the head of the queue, not removing it from the queue.
     * @return The element in the head of the queue.
     * @throws QueueIsEmptyException If the queue is empty.
     */
    @SuppressWarnings("unchecked")
    @Override
    public E element() throws QueueIsEmptyException{
        if(count == 0){
            throw new QueueIsEmptyException("Empty queue");
        }
        return (E) itemArray[head];
        
    }
 
    /**
     * Returns the count of elements currently in the queue.
     * @return Count of elements in the queue.
     */
    @Override
    public int size(){
        return count;
    }
 
    /**
     * Can be used to check if the queue is empty.
     * @return True if the queue is empty, false otherwise.
     */
    @Override
    public boolean isEmpty(){
        return count == 0;
    }
 
    /**
     * Resets the queue to empty state, removing the objects.
     * There is no need to change the capacity, just keep it as it is.
     */
    @Override
    public void clear(){
        for(int index = 0; index < capacity; index++){
            itemArray[index] = null;
         }
   
         head = 0;
         tail = 0;
         count = 0; 
         }

    
    public void Reallocate(){
    int newCapacity = capacity * 2;
    Object [] newitemArray = new Object[newCapacity];
    int index = head;
    for(int i = 0; i < count; i++){
        newitemArray[i] = itemArray[index++];
        if(index >= capacity){
            index = 0;
        }
    }
    head = 0;
    tail = count;
    capacity = newCapacity;
    itemArray = newitemArray;
    }
    @Override
    public String toString(){
        
        
        int index = head;
        StringBuilder builder = new StringBuilder();
        
        if(count == 0){
            return "[]";
        
        }
        builder.append("[");
        for(int i = 0; i < count; i++){
            String tmpString = itemArray[index++].toString();
            builder.append(tmpString);
            if(i < count - 1){
                builder.append(", ");
            }
            if(index >= capacity){
                index = 0;
            }
        }
        builder.append("]");
        return builder.toString();
        
    }

    

    

}

