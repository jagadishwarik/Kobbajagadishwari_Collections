package com.epam.Collections;

public class Main {
	public static void main(String[] args) 
    {
		List<Integer> list = new List<Integer>(); 
        //insert elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        System.out.println(list);
         
        //Removes elements from the list
        list.remove(2);
        System.out.println(list);
          
        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(4) );
 
        //List Size
        System.out.println(list.size());
    }
	

}
