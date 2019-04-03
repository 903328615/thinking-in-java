package com.moyu.sort;

/**
 * @program: thinking-in-java
 * @description: 归并排序
 * @author: wangzibin
 * @create: 2019-04-02 12:57
 **/
public class MergeSort {

    public static String sortChar(String s){
        char[] chars=s.toCharArray();
        mergeSortChar(chars,chars.length);
        return String.valueOf(chars);
    }

    public static void mergeSort(int[] s,int n){
        mergeSortC(s,0,n-1);
    }

    public static void mergeSortChar(char[] s,int n){
        mergeSortChar(s,0,n-1);
    }

    public static void mergeSortC(int[] s,int p,int r){
      if (p>=r){
          return;
      }

      int q=p+(r-p)/2;

      mergeSortC(s,p,q);
      mergeSortC(s,q+1,r);
      merge(s,p,q,r);
    }

    public static void mergeSortChar(char[] s,int p,int r){
        if (p>=r){
            return;
        }

        int q=p+(r-p)/2;

        mergeSortChar(s,p,q);
        mergeSortChar(s,q+1,r);
        mergeChar(s,p,q,r);
    }


    private static void merge(int[] a, int p, int q, int r) {
        int i=p;
        int j=q+1;
        int k=0;
        int[] temp=new int[r-p+1];
        while (i<=q&&j<=r){
            if (a[i]<=a[j]){
                temp[k++]=a[i++];
            }else {
                temp[k++]=a[j++];
            }
        }
        int start=i;
        int end=q;
        if (j<=r){
            start=j;
            end=r;
        }

        while (start<=end){
            temp[k++]=a[start++];
        }

        for ( i=0;i<=r-p;i++){
            a[p+i]=temp[i];
        }
    }

    private static void mergeChar(char[] a, int p, int q, int r) {
        int i=p;
        int j=q+1;
        int k=0;
        char[] temp=new char[r-p+1];
        while (i<=q&&j<=r){
            if (a[i]<=a[j]){
                temp[k++]=a[i++];
            }else {
                temp[k++]=a[j++];
            }
        }
        int start=i;
        int end=q;
        if (j<=r){
            start=j;
            end=r;
        }

        while (start<=end){
            temp[k++]=a[start++];
        }

        for ( i=0;i<=r-p;i++){
            a[p+i]=temp[i];
        }
    }
}
