package qs;
import java.util.*;
//import java.util.Scanner;
 
 
public class main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Input num of elements");
        //get length of the numbers user want to input
        int N = input.nextInt();
        //create aRR with this length
        int[] ARR = new int[N];
        //loop thought length to add actual numbers
        for (int i = 0; i < N; i++) {
            System.out.printf("Input[%d] elements:" , i);
            ARR [i] = input.nextInt();
        }
        //print array before sort
        System.out.printf("BEFORE SORT" + Arrays.toString(ARR));
        //after sort 
        methods.QuickSort(ARR,0,N-1);
        System.out.println("After sorting : " + Arrays.toString(ARR));
 
    }
}
 
