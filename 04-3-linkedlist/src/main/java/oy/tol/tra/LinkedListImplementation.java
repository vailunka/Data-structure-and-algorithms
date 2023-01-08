package oy.tol.tra;

import javax.lang.model.element.Element;

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
   private int random = 0;

   public LinkedListImplementation(){
      head = null;
      size = 0;
   }


   @Override
   public void add(E element) throws NullPointerException, LinkedListAllocationException {
      
      if(element == null){
         throw new NullPointerException("element is null");
      }
      if(head == null){
         head = new Node<E>(element);
         size = size + 1;
      }
      else{
         Node<E> current = head;
         while(current.next != null){
            current = current.next;
         }
         current.next = new Node<E>(element);
         size = size + 1;
      }
   }

   @Override
   public void add(int index, E element) throws NullPointerException, LinkedListAllocationException, IndexOutOfBoundsException {
      
      if(element == null){
         throw new NullPointerException("element is null");
      }
      if(index > size || index < 0){
         throw new IndexOutOfBoundsException("index out of bounds");
      }
      if(index == 0){
         Node<E> newNode = new Node<E>(element);
         newNode.next = head;
         head = newNode;
         size = size + 1;
      }
      else{
         int counter = 0;
         Node<E> current = head;
         Node<E> previous = null;
         while(counter < index){
            previous = current;
            current = current.next;
            counter = counter + 1;
         }
         Node<E> newNode = new Node<E>(element);
         previous.next = newNode;
         newNode.next = current;
         size = size + 1;
      }



   }

   @Override
   public boolean remove(E element) throws NullPointerException {
      
      if(element == null){
         throw new NullPointerException("element is null");
      }
      if(head == null){
         return false;
      }
      if(head == element){
        head = head.next; 
        size = size - 1;
        return true;
      }
      
      Node<E> current = head;
      Node<E> previous = null;
         while(current.next != null){
            if(current == element){
               previous.next = current.next;
               size = size - 1;
               return true;
            }
            previous = current;
            current = current.next;
         }

      return false;
   }
   
   @Override
   public E remove(int index) throws IndexOutOfBoundsException {
      
      if(index >= size || index < 0){
         throw new IndexOutOfBoundsException("index out of bounds");
      }
      Node<E> tmp = null;
      Node<E> current = head;
      Node<E> previous = null;
      if(index == 0){
         tmp = head;
         head = head.next;
         size = size - 1;
         return (E) tmp.element;
      }
      else{
         int counter = 0;
         while(counter < index){
            previous = current;
            current = current.next;
            counter = counter + 1;
         }
         previous.next = current.next;
         size = size - 1;
         return (E) current.element;
      }
}
  
   @Override
   public E get(int index) throws IndexOutOfBoundsException {
      
      if(index >= size || index < 0){
         throw new IndexOutOfBoundsException("index out of bounds");
      }
      if(index == 0){
         return (E) head.element;

      }
      else {
      int counter = 0;
      Node<E> current = head;
      
      while(counter < index){
         current = current.next;
         counter = counter + 1;
      }
      return (E) current.element;
      }
      
   }

   @Override
   public int indexOf(E element) throws NullPointerException {
      
      if(element == null){
         throw new NullPointerException("element is null");
      }
      if(head == null){
         return -1;
      }
      
      Node<E> current = head;
      int counter = 0;
      while(current.next != null){
         if(current.element == element){
            return counter;
         }
         current = current.next;
         counter = counter + 1;
         if(current.element == element){
            return counter;
      }
   }
      return -1;
   }

   @Override
   public int size() {
      
      return size;
   }

   @Override
   public void clear() {
      
      head = null;
      size = 0;
   }

   @Override
   public void reverse() {
      
      Node<E> current = head;
      Node<E> previous = null;
      Node<E> tmp = head;
      while(current != null){
         tmp = tmp.next;
         current.next = previous;
         previous = current;
         current = tmp; 
      }
      head = previous;
   }

   @Override
   public String toString() {
      
      StringBuilder builder = new StringBuilder();
      if(size == 0){
         return "[]";
      }
      
      Node<E> current = head;
      builder.append("[");
      while(current != null){
         String tmpString = current.element.toString();
         builder.append(tmpString);
         if(current.next != null){
         builder.append(", ");
         }
         
         current = current.next;
      }
      builder.append("]");

      return builder.toString();
   }
   
}
