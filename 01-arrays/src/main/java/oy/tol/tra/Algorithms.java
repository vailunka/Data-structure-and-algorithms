package oy.tol.tra;

public class Algorithms {
    
    public static <T extends Comparable<T>> void sort(T [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[smallest_index])<=0) {
                    smallest_index = j;
                }
            }
            swap(array, i, smallest_index);  
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
