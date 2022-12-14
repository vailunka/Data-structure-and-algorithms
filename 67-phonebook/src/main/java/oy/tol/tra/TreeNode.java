package oy.tol.tra;

public class TreeNode<K extends Comparable<K>,V>  {
    private int hash;
    private Pair<K,V> keyValue;
    private TreeNode<K,V> leftChild;
    private TreeNode<K,V> rightChild;
    private LinkedListImplementation<Pair<K,V>> collisionChain = null;
    
    
    public TreeNode(K key, V value){
        this.keyValue = new Pair<>(key, value);
        this.leftChild = null;
        this.rightChild = null;
        this.hash = key.hashCode();
        this.collisionChain = null;
        }
    
    
    
    

    public int insert(K key, V value, int keyToSearch){
        int added = 0;
         if(keyToSearch<(this.hash)){
            if(leftChild == null){
                leftChild = new TreeNode<>(key, value);
                added = 1;
            }
            else{
                added = leftChild.insert(key, value, keyToSearch);
                
            }
        }else if(keyToSearch > this.hash){
            if(rightChild == null){
                rightChild = new TreeNode<>(key, value);
                added = 1;
            }else 
                added = rightChild.insert(key, value, keyToSearch);
        }else{
            
            if(keyValue.getKey().equals(key)){
                keyValue.setvalue(value);
                
            }
            else{
                if(collisionChain == null){
                    collisionChain = new LinkedListImplementation<>();
                    collisionChain.add(new Pair<>(key, value));
                    added = 1;
                }
                else if(!collisionChain.isEmpty()){
                    
                    int index = collisionChain.indexOf(keyValue);
                    if(index < 0){
                        collisionChain.add(new Pair<>(key, value));
                        added = 1;
                    }
                    else{
                        collisionChain.remove(index);
                        collisionChain.add(new Pair<>(key, value));
                    }
                }
            }
        }
    
        return added;
    
    
}

    public V find(K key, int toFindHash){
        V result = null;
        if(toFindHash<this.hash){
            if(leftChild!=null){
                result = leftChild.find(key, toFindHash);
            }
        }else if(toFindHash>this.hash){
            if(rightChild!=null){
                result = rightChild.find(key, toFindHash);
            }
        }else{
            if(keyValue.getKey().equals(key)){
                return keyValue.getValue();
            }
            else{
                
                if(collisionChain != null){
                    Pair<K,V> toSearch = keyValue;
                    int index = collisionChain.indexOf(toSearch);
                    if(index >= 0){
                        return collisionChain.get(index).getValue();
                    }
                }
                
                
            }
        }
    
        return result;
}

    

	public void toSortedArray(Pair<K, V>[] sortedArray, int addIndex) {
        if(leftChild != null){
            leftChild.toSortedArray(sortedArray, addIndex);
        }
        sortedArray[addIndex] = new Pair<>(keyValue.getKey(), keyValue.getValue());
        if (collisionChain != null) {
			for (int index = 0; index < collisionChain.size(); index++) {
				Pair<K,V> found = collisionChain.get(index);
				if (found != null) {
					sortedArray[addIndex++] = new Pair<K,V>(found.getKey(), found.getValue());
				}
			}
		}
        if(rightChild != null){
            rightChild.toSortedArray(sortedArray, addIndex);
        }
	}

    



 
    @Override
    public boolean equals(Object obj) {
       if (this == obj) {
          return true;
       }
       if (obj == null) {
          return false;
       }
       if (getClass() != obj.getClass()) {
          return false;
       }
       Pair<?,?> other = (Pair<?,?>) obj;
       if (keyValue == null) {
          if (other != null) {
             return false;
          }
       } else if (!keyValue.equals(other)) {
          return false;
       }
       return true;
    }
    
 
 }
    
    

    



