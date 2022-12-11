package oy.tol.tra;

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
        public int count = 0;
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



}
