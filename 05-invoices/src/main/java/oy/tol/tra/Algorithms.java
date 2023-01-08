package oy.tol.tra;

import java.util.function.Predicate;

public class Algorithms {
    
    public static <T extends Comparable<T>> void sort(T [] array) {
       /*  for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[i])<=0) {
                    swap(array, i, j); 
                }
            }
            }*/

         for(int k = array.length - 1 ; k > -1; k-- ){
            for(int l = k - 1; l > - 1; l--){
                if(array[k].compareTo(array[l])<0)
                swap(array, k, l); 
            }
        }
    }
   

   public static <T> void reverse(T [] array){
        int i = 0;
      while (i < array.length/2) {
         T temp = array[i];
         array[i] = array[array.length-i-1];
         array[array.length-i-1] = temp;
         i++;
     }
        
    }

    public static <T> void swap(T [] array, int first, int second){
        if(first != second){
            T tmp = array[first];
            array[first] = array[second];
            array[second] = tmp;
        }
    }

    public static class ModeSearchResult<T> {
        public T theMode;
        public int count;
     }
    public static <T extends Comparable<T>> ModeSearchResult<T> findMode(T [] array) {
        ModeSearchResult<T> result = new ModeSearchResult<>();
        int maxcount = 1;
        int count = 1;
        T maxvalue = null;
        int i = 0;
        
        if(array == null || array.length <= 1){
            result.count = -1;
            result.theMode = null;
            return result;
    } 
       
        sort(array);
        maxvalue = array[0];
        for(i = 0; i < array.length - 1; i++){
                if(array[i].compareTo(array[i+1]) == 0){
                    count++;
                    }
        
                else{
                    if(count >= maxcount){
                        maxcount = count;
                        maxvalue = array[i];
                        count = 1;
                    }
                }
        }
        if(count >= maxcount){
            maxcount = count;
            maxvalue = array[i];
            
        }

        
        result.count = maxcount;
        result.theMode = maxvalue;
        return result;
        
        }



    public static <T> int partitionByRule(T [] array, int count, Predicate<T> toCompare){
        int i = 0;
        for(i = 0; i < count - 1; i++ ){
            if(i >= count){
                return count;
            }
            if(toCompare.test(array[i])){
                break;
            }
        }
        int nextindex = i + 1;
        while(count > nextindex){
            if(!toCompare.test(array[nextindex])){
                swap(array, i, nextindex);
                i++;
            }
            nextindex++;
        }
            return i;
        }


    public static <T extends Comparable<T>> int binarySearch(T aValue, T [] fromArray, int fromIndex, int toIndex) {
        // TODO Implement this in step 2.
        
        //rekursiivinen
        /* 
        if(toIndex >= fromIndex){
            int middle = fromIndex + (toIndex - fromIndex ) / 2;

            if(fromArray[middle].compareTo(aValue) == 0){
                return middle;
            }

            else if(fromArray[middle].compareTo(aValue)> 0){
                return binarySearch(aValue, fromArray, fromIndex, middle -1);
            }

            else
            {
                return binarySearch(aValue, fromArray, middle + 1, toIndex);
            }

        }
        return -1;
        */
        
        while(toIndex >= fromIndex){
            int middle = fromIndex + (toIndex - fromIndex ) / 2;

            if(fromArray[middle].compareTo(aValue) == 0){
                return middle;
            }
            else if(fromArray[middle].compareTo(aValue)> 0){
                toIndex = middle - 1; 
            }
            else{
                fromIndex = middle + 1;
            }

        }
        return -1;
        
    }


    public static <E extends Comparable<E>> void fastSort(Comparable<E>[] array){
        quickSort(array, 0, array.length -1);    
    }


    private  static <E extends Comparable<E>> void quickSort(Comparable<E>[] array, int low, int high){
        if(low < high){
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private  static <E extends Comparable<E>> int partition(Comparable<E>[] array, int low, int high){
        E pivotValue = (E) array[high];
        int i = low -1;
        for(int j = low; j < high; j++){
            if(array[j].compareTo(pivotValue) < 0){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }


    public static <E extends Comparable<E>> void heapSort(Comparable<E>[] array){
        int N = array.length;
 
        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify((E[]) array, N, i);
 
        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            E temp = (E) array[0];
            array[0] = array[i];
            array[i] = temp;
 
            // call max heapify on the reduced heap
            heapify((E[]) array, i, 0);
        }
    }
    
    public static <E extends Comparable<E>> void heapify(E arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < N && arr[l].compareTo(arr[largest]) > 0 )
            largest = l;
 
        // If right child is larger than largest so far
        if (r < N && arr[r].compareTo(arr[largest]) > 0)
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            swap(arr, largest, i);
 
            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }
    
}
