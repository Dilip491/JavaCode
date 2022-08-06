package Javaprogramming;

public class SortTheArrays {

    public static void main(String[] args) {
       int[] arr=new int[]{3,5,1,6,9,4};


       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]<arr[j]){
                 arr[i]=arr[i]*arr[j];
                 arr[j]=arr[i]/arr[j];
                 arr[i]=arr[i]/arr[j];
               }
           }
           System.out.print(arr[i]+" ");
       }

    }
    }

