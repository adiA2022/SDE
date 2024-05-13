package com.company;

import java.util.Arrays;

public class Arrayclass {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int index = Arrays.binarySearch(a,3);//it only works if element is ion sorted order
        System.out.println(index);

    }
}
