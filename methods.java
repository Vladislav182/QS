package qs;

public class methods {

    public static void QuickSort(int[] ARR,int low, int high ) {
        //check if we are in deep of recursion
        if(low < high) {
            //get pivot index when we partition the arr
            int PivotIndex = Partition(ARR, low, high);
            //recursive call the method 
            QuickSort(ARR, low, PivotIndex-1);
            QuickSort(ARR, PivotIndex+1, high);
        }
    }

    private static int Partition(int[] aRR, int low, int high) {
        // TODO Auto-generated method stub
        //
        //get pivot index
        int Pivot = aRR[high];
        //create stored index
        int  i = low-1;
        
        //loop thought from low to hight
        for(int j = low; j < high; j++) {
            //check for every number is less than pivot
            if(aRR[j] < Pivot);
            
            i++;
            //swap
            int temp = aRR[j];
            aRR[j] = aRR[i];
            aRR[i] = temp;



        }

        // put the pivot element at right position
        int temp = aRR[i+1];
        aRR[i+1] = aRR[high];
        aRR[high] = temp;
        return i + 1;

    }
}