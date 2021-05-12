package com.array;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Component
public class ArrayReader {
    //Number of Integers (0 to 100000)
    public int [] a = new int[10];

    public int [] compareList = new int[10];

    public int distinctCount = 0;

    public void readArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter integer :\n");
        // N can be any number between -1000000 to 1000000
        compareList = a;
        for(int i = 0;  i < a.length ; i++){
            for(int j = i + 1; j < a.length ; j++) {
                if( (a[i] == a[j]) && (i != j) ) {
                    a[i] = scan.nextInt();
//                    compareList[i] = a[i];
                    distinctCount = distinctCount + 1;
                    System.out.println("If you want to exit please press X otherwise continue : \n");
                    if (new Scanner(System.in).nextLine().contains("X".toLowerCase())) {
                        System.out.println(Arrays.toString(a));
                        return;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }

}
