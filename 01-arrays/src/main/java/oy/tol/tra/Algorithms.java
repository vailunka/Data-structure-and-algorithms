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


}
