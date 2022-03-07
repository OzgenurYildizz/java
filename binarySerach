package com.company;

public class Main {
   public static int binarySearch(int key,int A[],int low,int high) {
    int index=-1;
       while(low<=high){
           int mid=(low+high)/2; //index cinsinden
           if(A[mid]==key){
               index=mid;
               return index;
           }
           else if(A[mid]>key){
               high=mid-1;
           }
           else if(A[mid]<key){
               low=mid+1;
           }
       }
      return index;
    }

    public static void main(String[] args) {
	// write your code here
        int A[]={10,15,20,25,30};
    int n=A.length;
    int low=0; int high=A.length-1; //A.length uzunluğunu birim şeklinde alır.
   // System.out.println(low+" "+high);
    int key=25;
        int index = binarySearch(key, A, low, high);
         if(index!=-1) {
             System.out.println(index + ". indexte " + key + " elemanı bulundu");
         }
    }
}
