package oy.tol.tra;


/**
 * An implementation of the StackInterface.
 * <p>
 * TODO: Students, implement this so that the tests pass.
 * 
 * Note that you need to implement construtor(s) for your concrete StackImplementation, which
 * allocates the internal Object array for the Stack:
 * - a default constructor, calling the StackImplementation(int size) with value of 10.
 * - StackImplementation(int size), which allocates an array of Object's with size.
 *  -- remember to maintain the capacity and/or currentIndex when the stack is manipulated.
 */
public class StackImplementation<E> implements StackInterface<E> {

   // TODO: Add member variables needed.
   // Do not use constant values in code, e.g. 10. Instead, define a constant for that. For example:
   // private static final int MY_CONSTANT_VARIABLE = 10;
   private static final int MY_CONSTANT_VARIABLE = 10;
   private Object [] itemArray;
   private int capacity;
   private int currentIndex = -1;
   

   
   /**
    * Allocates a stack with a default capacity.
    * @throws StackAllocationException
    */
   public StackImplementation() throws StackAllocationException {
      // TODO: call the constructor with size parameter with default size (see member variable!).
        this(MY_CONSTANT_VARIABLE);
      
      
      
   }

   /** TODO: Implement so that
    * - if the size is less than 2, throw StackAllocationException
    * - if the allocation of the array throws with Java exception,
    *   throw StackAllocationException.
    * @param capacity The capacity of the stack.
    * @throws StackAllocationException If cannot allocate room for the internal array.
    */
   public StackImplementation(int capacity) throws StackAllocationException {
      if(capacity < 2){
         throw new StackAllocationException("Should be more than 1");
      }
      try{
         itemArray = new Object[capacity];
         this.capacity = capacity;
         currentIndex = -1;
      }
      catch(Exception e){
         throw new StackAllocationException(e.getMessage());
      }
   }

   
   
   
   

   @Override
   public int capacity() {
      // TODO: Implement this
      
      return capacity;
   }
   
   @Override
   public void push(E element) throws StackAllocationException, NullPointerException {
      // TODO: Implement this
      if(element == null){
         
         throw new NullPointerException();
         }
         currentIndex = currentIndex + 1;
      if(currentIndex >= capacity){
        ReallocateArray();
            }
      
      itemArray[currentIndex] =  element;
      
      }
      
   

   @SuppressWarnings("unchecked")
   @Override
   public E pop() throws StackIsEmptyException {
      // TODO: Implement this
      if(currentIndex == -1 || itemArray[currentIndex]==null){
         throw new StackIsEmptyException("Stack is empty");
      }
      else{
         return (E) itemArray[currentIndex--];
      
      }
      
   }

   @SuppressWarnings("unchecked")
   @Override
   public E peek() throws StackIsEmptyException {
      if(currentIndex == -1){
      throw new StackIsEmptyException("Stack is empty");
      }
      if(currentIndex < capacity){
      return (E) itemArray[currentIndex];
      }
      else{
         return null;
      }
      }
   
   @Override
   public int size() {
      // TODO: Implement this
      return currentIndex + 1;
      
   }
 
   @Override
   public void clear() {
      // TODO: Implement this
      for(int index = 0; index < capacity; index++){
         itemArray[index] = null;
      }

      currentIndex = -1; 
      }
      
   
   
   @Override
   public boolean isEmpty() {
      return currentIndex == -1;
      
   }
 
   @Override
   public String toString() {
      // TODO: Implement this
      StringBuilder builder = new StringBuilder();
      builder.append("[");
      for(int index = 0; index < currentIndex + 1; index++){
         String tmpString = itemArray[index].toString();
         builder.append(tmpString);
         if(index < currentIndex){
         builder.append(", ");
      }
      }
      builder.append("]");
      return builder.toString();
   }
   
   
   public void ReallocateArray(){
      
      int newCapacity = capacity * 2;
      Object [] newitemArray = new Object[newCapacity];
      for(int index = 0; index < currentIndex; index++){
         newitemArray[index] =  itemArray[index];
      }
      capacity = newCapacity;
      itemArray = newitemArray;
   }

   public void StackImplementation1(int capacity2) {
   }

   
   
}
