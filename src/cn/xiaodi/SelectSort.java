package cn.xiaodi;

public class SelectSort {
    public SelectSort(int[]a){
        int len=a.length;
        for(int i=0;i<len;i++){
            for(int k=i;k<len;k++){
                if(a[i]>a[k]){
                    exch(a,i,k);
                }
            }
        }
    }
    private static void exch(int[]a,int x,int y){
        int t=a[x];a[x]=a[y];a[y]=t;
    }
}
