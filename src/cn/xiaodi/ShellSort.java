package cn.xiaodi;

public class ShellSort {
    public ShellSort(int[]a){
        int n=1;
        while(n<a.length)n=n*3+1;
        while(n>0) {
            for (int i = n; i < a.length; i++) {
                for (int k = n; k > 0; k -= n) {
                    exch(a, k, k - n);
                }
            }
            n=n/3;
        }
    }
    private static void exch(int[]a,int i,int j){
        int t=a[i];a[i]=a[j];a[j]=t;
    }
}
