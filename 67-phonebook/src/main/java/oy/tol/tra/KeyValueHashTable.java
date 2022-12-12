package oy.tol.tra;

import java.security.Key;

public class KeyValueHashTable<K extends Comparable<K>, V> implements Dictionary<K, V> {

    private static final double loadfactor = 0.65;
    private static final int defaut_capacity = 20;
    private int capacity = 20;
    private int count;
    private int collisioncount;
    private int maxProbingCount;
    private Pair<K, V> [] array = null;
    private int reallocateCount;


    public KeyValueHashTable(int capacity) throws OutOfMemoryError {
        ensureCapacity(capacity);
    }

    public KeyValueHashTable() throws OutOfMemoryError {
    
        reallocateCount = 0;
        count = 0;
        collisioncount = 0;
        maxProbingCount = 0;
        ensureCapacity(20);
    }

    @Override
    public Type getType() {
        return Type.HASHTABLE;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void ensureCapacity(int size) throws OutOfMemoryError {
        // TODO: Implement this!
        if(count == 0){
            this.capacity = size;
           array = (Pair<K,V>[])new Pair[size];
        }
        else{
            reallocate(size * 2);
        }
    }

    @Override
    public int size() {
        // TODO: Implement this!
        return count;
    }

    /**
     * Prints out the statistics of the hash table.
     * Here you should print out member variable information which tell something
     * about your implementation.
     * <p>
     * For example, if you implement this using a hash table, update member
     * variables of the class (int counters) in add() whenever a collision
     * happen. Then print this counter value here.
     * You will then see if you have too many collisions. It will tell you that your
     * hash function is not good.
     */
    @Override
    public String getStatus() {
        // TODO: Implement this!
        String toReturn = "KeyValueArray reallocated " + reallocateCount + " times, each time doubles the size\n";
      toReturn += String.format("KeyValueArray fill rate is %.2f%%%n", (count / (double)array.length) * 100.0);
      return toReturn;
        
    }

    @Override
    public boolean add(K key, V value) throws IllegalArgumentException, OutOfMemoryError {
        // TODO: Implement this!
        int index = 0;
        int  hashModifier = 0; 
        int currentProbingcount = 0;
        boolean added = false;
        double currentLoadFactor = 0;
        currentLoadFactor = count / capacity;
        if (null == key || value == null) {
            throw new IllegalArgumentException("Not Key nor value can be null");
        }
        if(currentLoadFactor > loadfactor){
            reallocate(capacity * 2);
        }
        do{
            index = indexFor(hashModifier, key);
            if(array[index] == null){
                array[index] = new Pair<>(key, value);
                added = true;
                count++;
                return true;
            }
            else if(!array[index].getKey().equals(key)){
                //collision
                hashModifier++;
                collisioncount++;
                currentProbingcount++;
            }

        }while(!added);
        if(currentProbingcount > maxProbingCount){
            maxProbingCount = currentProbingcount;
        } 

        return false;
    }

    @Override
    public V find(K key) throws IllegalArgumentException {
        // TODO: Implement this!
        int index = 0;
        int  hashModifier = 0; 
        boolean found = false;
        if(key == null){
            throw new IllegalArgumentException("Key to find cannot be null");
        }
        do{
            index = indexFor(hashModifier, key);
            if(array[index] != null && key.equals(array[index].getKey())){
                return array[index].getValue();
            }
        }while(!found);{
            hashModifier++;
        }
        return null;
    }

    @Override
    @java.lang.SuppressWarnings({"unchecked"})
    public Pair<K,V> [] toSortedArray() {
        // TODO: Implement this!

        Pair<K, V> [] sorted = (Pair<K,V>[])new Pair[count];
        int addIndex = 0;
        for(int index = 0; index < capacity; index++){
            if(array[index ]!= null){
                sorted[addIndex++] = array[index];
            }
        }
        Algorithms.fastSort(sorted);
        return sorted;
        
      }

    @Override
    public void compress() throws OutOfMemoryError {
        // TODO: Implement this!
        int indexOfFirstNull = Algorithms.partitionByRule(array, count, element -> element == null);
        reallocate(indexOfFirstNull);


    }
    @java.lang.SuppressWarnings({"squid:S3012", "unchecked"})
    public void reallocate(int newSize){
        int oldCapacity = capacity;
        capacity = newSize;
        reallocateCount++;
        Pair<K, V> [] newArray = (Pair<K,V>[])new Pair[newSize];
        for(int i = 0; i < oldCapacity; i++){
            boolean replaced = false;
            int hashModifier = 0;
            int index = 0;
            if(array[i] != null){
                do{
                    index = indexFor(hashModifier, array[i].getKey());
                    if(newArray[index] == null){
                        newArray[index] = new Pair<>(array[i].getKey(),array[i].getValue());
                        replaced = true;
                        
                    }
                    else {
                        //collision
                        hashModifier++;
                        
                    }
        }while(!replaced);{}
            }
        }
    array = newArray;
    }

    public int indexFor(int hashModifier, K key){
        return ((key.hashCode() & 0x7fffffff) + hashModifier) % capacity;
    }
 

}
