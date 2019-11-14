package offer;

/**
 * @author sunjh
 * @date 2019/9/26 11:28
 */

import java.util.Arrays;
import java.util.Scanner;

public class swapswap {
    public static int method(int[] arr,int n){
        int[] a=Arrays.copyOf(arr,n);
        int[] b=new int[n];
        Arrays.sort(a);
        int num=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=a[i]){
                num++;
                int index=getIndex(a,arr[i],i);
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                if(arr[i]!=a[i]){
                    i--;
                }
            }
        }
        return num;
    }


    public static int getIndex(int[] a,int num,int s){
        for(int i=s;i<a.length;i++){
            if(a[i]==num){
                return i;
            }
        }
        return -1;

    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int all=sc.nextInt();
        while(all--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            method(arr,n);
        }
    }

}
