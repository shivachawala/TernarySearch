package com.CS5343;

public class Searching {

//    public int binarysearch(int[] Arr, int val, int first, int last)
//    {
//        if(first > last)
//        {
//            return -1;
//        }
//        int mid = (first + last)/2;
//        if(val == Arr[mid])
//        {
//            return mid;
//        }
//        else if(val > Arr[mid])
//        {
//            first = mid +1;
//        }
//        else if(val < Arr[mid])
//        {
//            last = mid - 1;
//        }
//        return binarysearch(Arr, val, first, last);
//    }

    public int ternarysearch(int[] Arr, int val, int first, int last)
    {
        if(first > last)
        {
            return -1;
        }
        int mid1 = first + (last - first) / 3;
        int mid2 = first + 2*(last - first) / 3;
        if(val == Arr[mid1])
        {
            return mid1;
        }
        else if(val == Arr[mid2])
        {
            return mid2;
        }
        else if(val > Arr[mid1])
        {
            first = mid1+1;
        }
        else if(val < Arr[mid2])
        {
            last = mid2-1;
        }
        return ternarysearch(Arr, val, first, last);

    }
}
