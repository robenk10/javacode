 package com.AssignmentOfCW;

import java.util.*;
import java.util.Scanner;

public class Merge2arrayIn3rdArray {
   
	public static void main(String[] args) {
		
		int[] a = { 1, 2, 2, 3, 1, 5, 3 ,8,9};
        int[] b = { 4, 3, 1, 5, 7, 8, 4, 2,5 };

        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < (a.length > b.length ? a.length : b.length); i++) {
            if (i < a.length) {
                int c = 0;
                while (c <= l.size()) {
                    if (! l.contains(a[i])) {
                        l.add(a[i]);
                    }
                    c++;
                }
            }
            if (i < b.length) {
                int c = 0;
                while (c <= l.size()) {
                    if (! l.contains(b[i])) {
                        l.add(b[i]);
                    }
                    c++;
                }

            }
        }
        System.out.println(l);
		
	}
}
