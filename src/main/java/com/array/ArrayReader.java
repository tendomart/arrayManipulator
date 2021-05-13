package com.array;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReader {

    int [] a = new int [100000];

    public ArrayList<Integer> readArray(){
       ArrayList list = new ArrayList<Object>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type integer :\n");
        while (list.size() < a.length) {
            list.add(scan.nextInt());
            System.out.println("If you want to stop press zero(0) and enter :\n");
            if (list.contains(0)) {
                return list;
            }
        }
        return list;
    }

    public void calculateOutCome() {
        System.out.println("Please type integer :\n");
        a = readArray().stream().distinct().mapToInt(i -> i).toArray();
        System.out.println("The Distinct values are \n" + Arrays.toString(a));
    }
}


