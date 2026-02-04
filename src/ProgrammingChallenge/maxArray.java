package ProgrammingChallenge;

import java.util.Scanner;

public class searchArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to finding the maximum\n");
        int[] arr = new int[5];
        for (int i=0; i<arr.length; i++){
            arr[i] += sc.nextInt();
        }

//        for finding max element in an array
        int max = Integer.MIN_VALUE;
        for (int num: arr){
            if (max < num){
                max = num;
            }
        }
        System.out.println("Max element is: " + max);






        //        for printing arr
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

    }
}
