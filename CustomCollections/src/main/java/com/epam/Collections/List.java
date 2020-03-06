package com.epam.Collections;

import java.util.Arrays;

public class List<E>
{
    
    private int length = 0;
     
    
    private static final int Min_Capacity = 10;
     
        private Object Numbers[];
 
    public List() {
    	Numbers = new Object[Min_Capacity];
    }
 
    public void add(E e) {
        if (length == Numbers.length) {
            ensureCapacity();
        }
        Numbers[length++] = e;
    }
     
    @SuppressWarnings("unchecked")
    public E get(int j) {
        if (j >= length || j < 0) {
            throw new IndexOutOfBoundsException("Index: " + j + ", Size " + j);
        }
        return (E) Numbers[j];
    }
     
    @SuppressWarnings("unchecked")
    public E remove(int k) {
        if (k >= length || k < 0) {
            throw new IndexOutOfBoundsException("Index: " + k + ", Size " + k);
        }
        Object item = Numbers[k];
        int numElts = Numbers.length - ( k + 1 ) ;
        System.arraycopy( Numbers, k + 1, Numbers, k, numElts ) ;
        length--;
        return (E) item;
    }
     
    public int size() {
        return length;
    }
     
    @Override
    public String toString() 
    {
         StringBuilder SB = new StringBuilder();
         SB.append('[');
         for(int i = 0; i < length ;i++) {
             SB.append(Numbers[i].toString());
             if(i<length-1){
                 SB.append(",");
             }
         }
         SB.append(']');
         return SB.toString();
    }
     
    private void ensureCapacity() {
        int newSize = Numbers.length * 2;
        Numbers = Arrays.copyOf(Numbers, newSize);
    }
}
