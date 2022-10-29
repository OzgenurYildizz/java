package com.company;

public class Main {

   public static void bubbleSort(int A[],int n){
       for(int i=0;i<n;i++){
           for(int j=0;j<n-i-1;j++) {
               if (A[j] > A[j + 1]) {
                   int temp=A[j];
                   A[j]=A[j + 1];
                   A[j + 1]=temp;
               }
           }
       }
   }
   public static void printArray(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.print(A[i]);
        }
   }
    public static void main(String[] args) {
        int A[]={7,2,4,6,3,8};
        int n=A.length;
        System.out.println("unsorted array: "); printArray(A,n);
        bubbleSort(A,n);
        System.out.println("\nafter bubble sort algorithm: "); printArray(A,n);
    }
}
