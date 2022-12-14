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
            for(i = 0; i < count; i++ ){
                if(i >= count){
                    return count;
                }
                if(toCompare.test(array[i])){
                    break;
                }
            }
            if(i >= count){
                    return count;
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
        }

