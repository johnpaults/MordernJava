package org.modern.java10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class VarTypeExample {
    public static void main(String[] args) {
        var name = "John";
        var num = 10;
        System.out.println("num + name = " + num + name);
        
        var time = LocalTime.now();
        System.out.println("time = " + time);
        
        var map = new HashMap<String, String>();
        map.put("name", "john");
        System.out.println("map = " + map);
        
        var numbers = new int[] {1,2,3,4,5};
        System.out.println("Arrays.asList(numbers) = " + Arrays.asList(numbers));
        
        //Collections
        var arrayList = new ArrayList<>();
        arrayList.add("John");
        arrayList.add(29);
        arrayList.add(map);
        System.out.println("arrayList = " + arrayList);
    }
}
