package com.company;

public class Main {

    public static void main(String[] args) {
        int A[]={2,4,7,9,10,15,20};
        int key=15;
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                System.out.println((i+1)+". indiste "+key+" elemanı bulundu.");
                break;
            }
        }
    }
}
