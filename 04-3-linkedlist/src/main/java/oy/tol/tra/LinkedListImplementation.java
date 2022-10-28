package oy.tol.tra;

public class LinkedListImplementation<E> implements LinkedListInterface<E> {

   private class Node<T> {
      Node(T data) {
         element = data;
         next = null;
      }
      T element;
      Node<T> next;
      @Override
      public String toString() {
         return element.toString();
      }
   }

   private Node<E> head = null;
   private int size = 0;

   @Override
   public void add(E element) throws NullPointerException, LinkedListAllocationException {
      // TODO: Implement this.
   }

   @Override
   public void add(int index, E element) throws NullPointerException, LinkedListAllocationException, IndexOutOfBoundsException {
      // TODO: Implement this.
   }

   @Override
   public boolean remove(E element) throws NullPointerException {
      // TODO: Implement this.
      return false;
   }

   @Override
   public E remove(int index) throws IndexOutOfBoundsException {
      // TODO: Implement this.
      return null;
   }

   @Override
   public E get(int index) throws IndexOutOfBoundsException {
      // TODO: Implement this.
      return null;
   }

   @Override
   public int indexOf(E element) throws NullPointerException {
      // TODO: Implement this.
      return -1;
   }

   @Override
   public int size() {
      // TODO: Implement this.
      return -1;
   }

   @Override
   public void clear() {
      // TODO: Implement this.
   }

   @Override
   public void reverse() {
      // TODO: implement this only when doing the task explained the TASK-2.md.
      // This method is not needed in doing the task in the README.md.
   }

   @Override
   public String toString() {
      // TODO: Implement this.
      return "";
   }
   
}
