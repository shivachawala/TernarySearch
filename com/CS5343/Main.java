package com.CS5343;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int[] array = new int[]{0,1,2,3,5,7,9,12,15,17,18,22,24,30,52,54,75,88,89,93,97,105,110};
        System.out.println("Enter element to search:");
        int val = scan.nextInt();
        Searching s = new Searching();
        int position = s.ternarysearch(array, val, 0, array.length-1);
        if(position == -1)
            System.out.println("\n" +val+ " Element not found");
        else
            System.out.println("\n"+ val +" element found at position "+ position);

    }
}
