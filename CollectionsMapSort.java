/*Write a program to sort a map by value.
Set is a Collection that cannot contain duplicate elements. 
entrySet() returns a Set view of the mappings contained in this map.
The Map.entrySet method returns a collection-view of the map, whose elements are of this class. The only way to obtain a reference to a map entry is from the iterator of this collection-view. These Map.Entry objects are valid only for the duration of the iteration; more formally, the behavior of a map entry is undefined if the backing map has been modified after the 
entry was returned by the iterator, except through the setValue operation on the map entry.
Using comparator, we can sort the elements based on data members
*/ 
package com.sheetal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CollectionsMapSort {
	public static void main(String a[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("apple", 520);
        map.put("banana", 645);
        map.put("pear", 82);
        map.put("orange", 7);
        
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> i1, Map.Entry<String, Integer> i2 )
            {
                return (i2.getValue()).compareTo( i1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }
    }
}