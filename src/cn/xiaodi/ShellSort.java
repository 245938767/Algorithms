package cn.xiaodi;

public class ShellSort {
    public ShellSort(int[]a){
        for(int gap=a.length/2;gap>0;gap/=2){
            for(int k=gap;k<a.length;k++){
                for(int i=k-gap;i>=0;i=i-gap){
                    if(a[i]>a[i+gap]){
                        exch(a,i,i+gap);
                    }
                }
            }
        }
    }
    private static void exch(int[]a,int i,int j){
        int t=a[i];a[i]=a[j];a[j]=t;
    }
}
