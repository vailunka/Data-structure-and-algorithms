package oy.tol.tra;
import java.lang.Math;

public class KeyValueBSearchTree<K extends Comparable<K>,V> implements Dictionary<K, V> {

    // This is the BST implementation, KeyValueHashTable has the hash table implementation

    TreeNode<K,V> root;
    int hash;
    int count;
    int maxDepth;
    int btsCollisionCount;
    public KeyValueBSearchTree(){
        root = null;
        count = 0;
        maxDepth = 0;
        btsCollisionCount = 0;
    }


    @Override
    public Type getType() {
       return Type.BST;
    }
 
    @Override
    public int size() {
        // TODO: Implement this!
        return count;
        
    }

    /**
     * Prints out the statistics of the tree structure usage.
     * Here you should print out member variable information which tell something about
     * your implementation.
     * <p>
     * For example, if you implement this using a hash table, update member variables of the class
     * (int counters) in add(K) whenever a collision happen. Then print this counter value here. 
     * You will then see if you have too many collisions. It will tell you that your hash function
     * is good or bad (too much collisions against data size).
     */
    @Override
    public String getStatus() {
        // TODO: Implement this!
        String toReturn = ( "count: " + count + "\n");
        toReturn += String.format( "maxdepth: " + maxDepth + "\n");
        toReturn += String.format( "linked list length: " + btsCollisionCount + "\n");
        return toReturn;
    }

    @Override
    public boolean add(K key, V value) throws IllegalArgumentException, OutOfMemoryError {
        // TODO: Implement this!
        if (null == key || value == null) {
            throw new IllegalArgumentException("Not Key nor value can be null");
        }
        if(root == null){
            root = new TreeNode<>(key, value);
            count++;
            maxDepth = 1;
            btsCollisionCount = 0;
            return true;
        }
        else{
            TreeNode.addDepth = 1;
            btsCollisionCount = 0;
            int added = root.insert(key, value, key.hashCode());
            if(added > 0){
                maxDepth = Math.max(maxDepth, TreeNode.addDepth);
                btsCollisionCount = Math.max(TreeNode.collisionChainLength, btsCollisionCount);
                count++;
                return true;
            }
        }

        return false;
    }

    @Override
    public V find(K key) throws IllegalArgumentException {

        // TODO: Implement this!
        if(key == null){
            throw new IllegalArgumentException("Key to find cannot be null");
        }
        if(root == null){
            return null;
        }else{
            return root.find(key, key.hashCode());
        }
    }
        

    @Override
    public void ensureCapacity(int size) throws OutOfMemoryError {
        // TODO: Implement this (if needed)!
    }
      @Override
      public void compress() throws OutOfMemoryError {
        // TODO: Implement this (if needed)!
    }

    @java.lang.SuppressWarnings({"unchecked"})
    @Override
    public Pair<K, V>[] toSortedArray() {
       
        if(root == null){
            return null;
        }
        Pair<K,V>[] sortedArray = (Pair<K,V>[])new Pair[count];
        Integer [] addIndex = {0};
        root.toSortedArray(sortedArray, addIndex);
        Algorithms.fastSort(sortedArray);
        return sortedArray;
    }
    
   
}
